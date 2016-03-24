SUMMARY = "BMW car IT joynr framework"
DESCRIPTION = "Provides the support for joynr framework"
HOMEPAGE = "https://github.com/bmwcarit/joynr"

LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5"

PREFERRED_VERSION_cmake ?="3.3.1"

# working dependency but has almost everything in it
DEPENDS = "qtbase qtwebsockets curl git-native libasyncipc"

# test dependency
# DEPENDS = "qtwebsockets curl git-native"

SRCREV = "78c712299d340c9e4c35d4a5f5560a0e288867bf"

SRC_URI = "git://github.com/bmwcarit/joynr.git;branch=${PV};protocol=git \
	   http://central.maven.org/maven2/io/joynr/tools/generator/joynr-generator-standalone/${PV}/joynr-generator-standalone-${PV}.jar;unpack=0"
SRC_URI[md5sum] = "263d0f22080efc683ac0645e0052fb64"
SRC_URI[sha256sum] = "a1a1627f2c17f449ee5dabe222292e59a9ed2655c3148eebc841d5e2dee4e4f0"

S = "${WORKDIR}/git/cpp"

inherit cmake

FILES_${PN} = "${libdir}/* \
	      ${includedir}/* \
	      ${bindir}/*"
