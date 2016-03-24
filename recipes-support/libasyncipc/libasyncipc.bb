SUMMARY = "BMW car IT joynr framework"
DESCRIPTION = "Provides the joynr example"

LICENSE = "CLOSED"

#RADIO_DIR = "home/majanko/planck-m2/libasyncipc"

FILESEXTRAPATHS_prepend := "${WORKSPACE}"
SRC_URI = "file://libasyncipc"

S = "${WORKDIR}/libasyncipc"

inherit autotools

FILES_${PN} = "${libdir}/* \
	      ${includedir}/* \
	      ${bindir}/*"
