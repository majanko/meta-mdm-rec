DESCRIPTION = "DLT-daemon"
HOMEPAGE = "http://www.genivi.org"
LICENSE="CLOSED"

PR = "r0"
DEPENDS = "zlib"

FILESEXTRAPATHS_prepend := "${WORKSPACE}"
SRC_URI = "file://dlt-daemon"
S = "${WORKDIR}/dlt-daemon"

EXTRA_OECMAKE = "-DWITH_MAN=no -DWITH_DLT_DBUS=no"

inherit cmake
