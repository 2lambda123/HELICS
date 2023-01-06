# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# Copyright (c) 2019-2023, Battelle Memorial Institute; Lawrence Livermore
# National Security, LLC; Alliance for Sustainable Energy, LLC.
# See the top-level NOTICE for additional details.
# All rights reserved.
#
# SPDX-License-Identifier: BSD-3-Clause
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#
# This file is used to add libzmq to a project
#

if(${PROJECT_NAME}_USE_ZMQ_STATIC_LIBRARY)
    set(zmq_static_build ON)
    set(zmq_shared_build OFF)
else()
    set(zmq_static_build OFF)
    set(zmq_shared_build ON)
endif()

set(${PROJECT_NAME}_LIBZMQ_VERSION v4.3.4)

string(TOLOWER "libzmq" lcName)

include(FetchContent)

mark_as_advanced(FETCHCONTENT_BASE_DIR)
mark_as_advanced(FETCHCONTENT_FULLY_DISCONNECTED)
mark_as_advanced(FETCHCONTENT_QUIET)
mark_as_advanced(FETCHCONTENT_UPDATES_DISCONNECTED)

fetchcontent_declare(
    libzmq GIT_REPOSITORY https://github.com/zeromq/libzmq.git
    GIT_TAG ${${PROJECT_NAME}_LIBZMQ_VERSION}
)

fetchcontent_getproperties(libzmq)

if(NOT ${lcName}_POPULATED)
    # Fetch the content using previously declared details
    fetchcontent_populate(libzmq)

endif()

hide_variable(FETCHCONTENT_SOURCE_DIR_LIBZMQ)
hide_variable(FETCHCONTENT_UPDATES_DISCONNECTED_LIBZMQ)

# Set custom variables, policies, etc. ...

set(ZMQ_BUILD_TESTS OFF CACHE INTERNAL "")
set(ENABLE_CURVE OFF CACHE INTERNAL "")
set(ENABLE_DRAFTS OFF CACHE INTERNAL "")
set(WITH_DOCS OFF CACHE INTERNAL "")
set(${PROJECT_NAME}_ZMQ_LOCAL_BUILD ON CACHE INTERNAL "")
set(LIBZMQ_PEDANTIC OFF CACHE INTERNAL "")
set(WITH_PERF_TOOL OFF CACHE INTERNAL "")
set(ENABLE_CPACK OFF CACHE INTERNAL "")
set(BUILD_STATIC ${zmq_static_build} CACHE INTERNAL "")
set(BUILD_SHARED ${zmq_shared_build} CACHE INTERNAL "")
set(ENABLE_CPACK OFF CACHE INTERNAL "")
set(ENABLE_WS OFF CACHE INTERNAL "")

set(ENABLE_PRECOMPILED OFF CACHE INTERNAL "")

set(ENABLE_CLANG ON CACHE INTERNAL "")

set(ENABLE_TSAN OFF CACHE INTERNAL "")

set(ENABLE_TSAN OFF CACHE INTERNAL "")
if(${PROJECT_NAME}_ENABLE_ENCRYPTION AND NOT ${PROJECT_NAME}_DISABLE_ZMQ_ENCRYPTION)
    set(WITH_LIBSODIUM ON CACHE INTERNAL "")
else()
    set(WITH_LIBSODIUM OFF CACHE INTERNAL "")
endif()

set(ZMQ_OUTPUT_BASENAME zmq CACHE INTERNAL "")

set(ZEROMQ_CMAKECONFIG_INSTALL_DIR ${CMAKE_INSTALL_LIBDIR}/cmake/ZeroMQ CACHE INTERNAL "")
# Bring the populated content into the build
set(COMPILER_SUPPORTS_CXX11 ON)
set(ZMQ_HAVE_NOEXCEPT ON)

if("${CMAKE_CXX_COMPILER_ID}" STREQUAL "Clang")
    message(STATUS "clang compiling for ZMQ ${CMAKE_CXX_FLAGS}")
    set(OLD_CMAKE_CXX_FLAGS ${CMAKE_CXX_FLAGS})
    set(CMAKE_CXX_FLAGS
        "${CMAKE_CXX_FLAGS} -Wno-inconsistent-missing-override -Wno-unused-parameter "
    )
endif()

add_subdirectory(${${lcName}_SOURCE_DIR} ${${lcName}_BINARY_DIR} EXCLUDE_FROM_ALL)

if("${CMAKE_CXX_COMPILER_ID}" STREQUAL "Clang")
    set(CMAKE_CXX_FLAGS ${OLDCMAKE_CXX_FLAGS})
endif()

set(ZeroMQ_FOUND TRUE)

if(${PROJECT_NAME}_USE_ZMQ_STATIC_LIBRARY)
    set_target_properties(libzmq-static PROPERTIES FOLDER "Extern")
    target_compile_options(libzmq-static PRIVATE $<$<NOT:$<CXX_COMPILER_ID:MSVC>>:-fPIC>)

else()
    set_target_properties(libzmq PROPERTIES FOLDER "Extern")
endif()

# hide a bunch of local variables and options

hide_variable(LIBZMQ_WERROR)
hide_variable(WITH_MILITANT)
hide_variable(WITH_OPENPGM)
hide_variable(WITH_VMCI)
hide_variable(WITH_LIBSODIUM_STATIC)
hide_variable(WITH_NORM)

hide_variable(POLLER)
hide_variable(API_POLLER)
hide_variable(ENABLE_ANALYSIS)
hide_variable(ENABLE_ASAN)
hide_variable(ENABLE_RADIX_TREE)
hide_variable(ENABLE_EVENTFD)
hide_variable(ZMQ_CV_IMPL)
hide_variable(BUILD_TESTS)
hide_variable(ENABLE_INTRINSICS)

hide_variable(ZMQ_WIN32_WINNT)

if(${PROJECT_NAME}_USE_ZMQ_STATIC_LIBRARY)
    set(zmq_target_output "libzmq-static")
else()
    set(zmq_target_output "libzmq")
endif()

if(${PROJECT_NAME}_BUILD_CXX_SHARED_LIB OR NOT ${PROJECT_NAME}_DISABLE_C_SHARED_LIB)

    if(NOT ${PROJECT_NAME}_USE_ZMQ_STATIC_LIBRARY AND NOT ${PROJECT_NAME}_SKIP_ZMQ_INSTALL)
        set_target_properties(${zmq_target_output} PROPERTIES PUBLIC_HEADER "")
        if(NOT CMAKE_VERSION VERSION_LESS "3.13")
            install(
                TARGETS ${zmq_target_output}
                RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
                ARCHIVE DESTINATION ${CMAKE_INSTALL_LIBDIR}
                LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
                FRAMEWORK DESTINATION "Library/Frameworks"
            )
        elseif(WIN32)
            install(FILES $<TARGET_FILE:${zmq_target_output}> DESTINATION ${CMAKE_INSTALL_BINDIR}
                    COMPONENT libs
            )
        else()
            message(
                WARNING
                    "Update to CMake 3.13+ or enable the ${PROJECT_NAME}_USE_ZMQ_STATIC_LIBRARY CMake option to install when using ZMQ as a subproject"
            )
        endif()
        if(MSVC AND NOT EMBEDDED_DEBUG_INFO AND NOT ${PROJECT_NAME}_BINARY_ONLY_INSTALL)
            install(
                FILES $<TARGET_PDB_FILE:${zmq_target_output}>
                DESTINATION ${CMAKE_INSTALL_BINDIR}
                OPTIONAL
                COMPONENT libs
            )
        endif()
        if(MSVC AND NOT ${PROJECT_NAME}_BINARY_ONLY_INSTALL)
            install(FILES $<TARGET_LINKER_FILE:${zmq_target_output}>
                    DESTINATION ${CMAKE_INSTALL_LIBDIR} COMPONENT libs
            )
        endif()

    endif()

endif()
