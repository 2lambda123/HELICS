function v = helics_flag_force_logging_flush()
  persistent vInitialized;
  if isempty(vInitialized)
    vInitialized = helicsMEX(0, 52);
  end
  v = vInitialized;
end