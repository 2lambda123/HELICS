function v = HELICS_HANDLE_OPTION_INPUT_PRIORITY_LOCATION()
  persistent vInitialized;
  if isempty(vInitialized)
    vInitialized = helicsMEX(0, 118);
  end
  v = vInitialized;
end
