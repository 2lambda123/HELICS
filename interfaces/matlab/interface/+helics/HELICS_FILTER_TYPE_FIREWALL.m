function v = HELICS_FILTER_TYPE_FIREWALL()
  persistent vInitialized;
  if isempty(vInitialized)
    vInitialized = helicsMEX(0, 124);
  end
  v = vInitialized;
end