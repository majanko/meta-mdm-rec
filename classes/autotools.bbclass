autotools_do_configure() {
  bbnote "AUTOTOOLS_CONFIGURE"
}

autotools_do_make() {
  bbnote "AUTOTOOLS_MAKE"
}

autotools_do_install() {
  bbnote "AUTOTOOLS_INSTALL"
}

EXPORT_FUNCTIONS do_configure do_make do_install
