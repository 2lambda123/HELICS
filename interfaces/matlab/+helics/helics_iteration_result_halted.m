function v = helics_iteration_result_halted()
  persistent vInitialized;
  if isempty(vInitialized)
    vInitialized = helicsMEX(0, 90);
  end
  v = vInitialized;
end