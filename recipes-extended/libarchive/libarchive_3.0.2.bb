SUMMARY = "Support for reading various archive formats"
DESCRIPTION = "C library and command-line tools for reading and writing tar, cpio, zip, ISO, and other archive formats"
HOMEPAGE = "http://www.libarchive.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=b4e3ffd607d6686c6cb2f63394370841"

DEPENDS = "e2fsprogs-native"

PACKAGECONFIG ?= "libxml2 zlib bz2"

PACKAGECONFIG_append_class-target = "\
	${@base_contains('DISTRO_FEATURES', 'acl', 'acl', '', d)} \
	${@base_contains('DISTRO_FEATURES', 'xattr', 'xattr', '', d)} \
	${@base_contains('DISTRO_FEATURES', 'largefile', 'largefile', '', d)} \
"

PACKAGECONFIG_append_class-nativesdk = " largefile"

PACKAGECONFIG[acl] = "--enable-acl,--disable-acl,acl,"
PACKAGECONFIG[xattr] = "--enable-xattr,--disable-xattr,attr,"
PACKAGECONFIG[largefile] = "--enable-largefile,--disable-largefile,,"
PACKAGECONFIG[zlib] = "--with-zlib,--without-zlib,zlib,"
PACKAGECONFIG[bz2] = "--with-bz2lib,--without-bz2lib,bzip2,"
PACKAGECONFIG[xz] = "--with-lzmadec --with-lzma,--without-lzmadec --without-lzma,xz,"
PACKAGECONFIG[openssl] = "--with-openssl,--without-openssl,openssl,"
PACKAGECONFIG[libxml2] = "--with-xml2,--without-xml2,libxml2,"
PACKAGECONFIG[expat] = "--with-expat,--without-expat,expat,"
PACKAGECONFIG[lzo] = "--with-lzo2,--without-lzo2,lzo,"

SRC_URI = "http://libarchive.org/downloads/libarchive-${PV}.tar.gz"

SRC_URI[md5sum] = "4df33cb107c9702c80473e0794ddf833"
SRC_URI[sha256sum] = "b27a10182f4fc3f69d01419a59ddb16fccf5df8c4b166008c04f41905e29fd74"

#inherit autotools-brokensep lib_package
inherit autotools lib_package

CPPFLAGS += "-I${WORKDIR}/extra-includes"

do_configure[cleandirs] += "${WORKDIR}/extra-includes"
do_configure_prepend() {
	# We just need the headers for some type constants, so no need to
	# build all of e2fsprogs for the target
	cp -R ${STAGING_INCDIR_NATIVE}/ext2fs ${WORKDIR}/extra-includes/
}

#BBCLASSEXTEND = "native nativesdk"