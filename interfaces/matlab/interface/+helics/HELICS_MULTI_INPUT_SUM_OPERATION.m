function v = HELICS_MULTI_INPUT_SUM_OPERATION()
  persistent vInitialized;
  if isempty(vInitialized)
    vInitialized = helicsMEX(0, 99);
  end
  v = vInitialized;
end