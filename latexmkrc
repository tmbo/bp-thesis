add_cus_dep('glo', 'gls', 0, 'run_makeglossaries');
add_cus_dep('acn', 'acr', 0, 'run_makeglossaries');

sub run_makeglossaries {
  if ( $silent ) {
    system "/usr/texbin/makeglossaries -q '$_[0]'";
  }
  else {
    system "/usr/texbin/makeglossaries '$_[0]'";
  };
}