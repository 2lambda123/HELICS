function v = helics_sequencing_mode_ordered()
  persistent vInitialized;
  if isempty(vInitialized)
    vInitialized = helicsMEX(0, 116);
  end
  v = vInitialized;
end
