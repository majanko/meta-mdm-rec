SUMMARY = "BMW car IT joynr framework"
DESCRIPTION = "Provides the joynr example"

LICENSE = "CLOSED"

RADIO_DIR = "home/michal/yocto_old/poky/radio-app"

SRC_URI = "file:///${RADIO_DIR} \
	   http://central.maven.org/maven2/io/joynr/tools/generator/joynr-generator-standalone/${PV}/joynr-generator-standalone-${PV}.jar;unpack=0"

S = "${WORKDIR}/home/michal/yocto_old/radio-app"

inherit cmake

DEPENDS = "qtbase git-native joynr"

EXTRA_OECMAKE = " \
	      -DUSE_DBUS_COMMONAPI_COMMUNICATION=OFF \
	      -DENABLE_GCOV=OFF \
	      -DENABLE_DOXYGEN=OFF \
	      -DENABLE_CLANG_FORMATTER=OFF \
	      -DPYTHON_EXECUTABLE=/usr/bin/python \
	      -DJOYNR_SERVER=localhost:8080 \
	      -DCMAKE_BUILD_TYPE=Release ../radio-app \
	      -DBUILD_TESTS=OFF \
	      -DGIT_EXECUTABLE=/usr/bin/git \
	      "
	      
do_generate_headers(){
  install -d ${S}/src/main/generated-cpp
  cd ${WORKDIR}
  java -jar joynr-generator-standalone-${PV}.jar -outputPath ${S}/src/main/generated-cpp -modelpath ${S}/src/main/model -generationLanguage cpp
}

addtask generate_headers after do_patch before do_configure

FILES_${PN} = "${bindir}/*"