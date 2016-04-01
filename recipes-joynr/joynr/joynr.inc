SUMMARY = "BMW car IT joynr framework"
DESCRIPTION = "Provides the support for joynr framework"
HOMEPAGE = "https://github.com/bmwcarit/joynr"

LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5"

PREFERRED_VERSION_cmake ?="3.3.1"

PREFERRED_VERSION_gcc ?= "4.9"
PREFERRED_VERSION_gcc-cross-initial = "4.9"
PREFERRED_VERSION_gcc-cross = "4.9"
PREFERRED_VERSION_gcc-crosssdk= "4.9"
PREFERRED_VERSION_gcc-crosssdk-initial= "4.9"

# working dependency but has almost everything in it
DEPENDS = "qtbase qtwebsockets curl git-native libasyncipc libwebsockets boost cmake gcc-cross-initial"

# test dependency
# DEPENDS = "qtwebsockets curl git-native spdlog"

SRCREV = "78c712299d340c9e4c35d4a5f5560a0e288867bf"

SRC_URI = "git://github.com/bmwcarit/joynr.git;branch=${PV};protocol=git \
	   http://central.maven.org/maven2/io/joynr/tools/generator/joynr-generator-standalone/${PV}/joynr-generator-standalone-${PV}.jar;unpack=0 \
	   file://complete-asyncipc-cpp-integration.patch \
	   file://complete-asyncipc-java-integration.patch"
SRC_URI[md5sum] = "0828ee58d8780c6fe17e10be4b218d51"
SRC_URI[sha256sum] = "7ef0abaa05a7016c94ab8d166ac6724177e6cbb879711563f97d9ee63f4bece5"

S = "${WORKDIR}/git"

inherit cmake

FILES_${PN} = "${libdir}/* \
	      ${includedir}/* \
	      ${bindir}/*"
