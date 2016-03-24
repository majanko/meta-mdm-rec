require joynr.inc

#GCCVERSION = "4.9.2"
PREFERRED_VERSION_gcc = "5.2"

EXTRA_OECMAKE = " \
	      -DUSE_DBUS_COMMONAPI_COMMUNICATION=OFF \
	      -DENABLE_GCOV=OFF \
	      -DENABLE_DOXYGEN=OFF \
	      -DENABLE_CLANG_FORMATTER=OFF \
	      -DPYTHON_EXECUTABLE=/usr/bin/python \
	      -DJOYNR_SERVER=localhost:8080 \
	      -DCMAKE_BUILD_TYPE=Release ../git/cpp \
	      -DBUILD_TESTS=OFF \
	      -DGIT_EXECUTABLE=/usr/bin/git \
	      "

do_generate_headers(){
  cd ${WORKDIR}
  java -jar joynr-generator-standalone-${PV}.jar -outputPath git/cpp/libjoynr -modelpath ${WORKDIR}/git/basemodel/src/main/franca/joynr -generationLanguage cpp
}

addtask generate_headers after do_patch before do_configure
