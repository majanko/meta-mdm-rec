require spdlog.inc

PREFERRED_VERSION_cmake ?="3.3.1"
DEPENDS +="cmake"

SRCREV = "0c7beb2e36008598cf80d0e8eb8635ac403febb9"
SRC_URI += "git://github.com/gabime/spdlog.git;protocol=git"

#do_configure() {
#	cd ${S}
#	pwd > ~/spdlog_out.log
#	chmod 777 /home/majanko/planck-m2/build/tmp-eglibc/work/armv7a-vfp-neon-oe-linux-gnueabi/cmake/3.3.1-r0/image/usr/bin/cmake
#	ls -lat /home/majanko/planck-m2/build/tmp-eglibc/work/armv7a-vfp-neon-oe-linux-gnueabi/cmake/3.3.1-r0/image/usr/bin/cmake
#	/home/majanko/planck-m2/build/tmp-eglibc/work/armv7a-vfp-neon-oe-linux-gnueabi/cmake/3.3.1-r0/image/usr/bin/cmake -H. -B_builds -DCMAKE_INSTALL_PREFIX=./ -DCMAKE_BUILD_TYPE=Release
#}
