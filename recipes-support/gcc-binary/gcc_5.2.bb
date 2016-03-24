DESCRIPTION = "Pre-built GNU toolchain from ARM Cortex-M & Cortex-R processors (Cortex-M0/M0+/M3/M4/M7,Cortex-R4/R5/R7)"
SECTION = "devtools"
LICENSE = "Unknown"
LIC_FILES_CHKSUM ??= "file://${WORKSPACE}/meta-mdm-rec//files/LICENCE;md5=cf4a21270f331e068c4ae90d6711e62e"

SRC_URI = "https://launchpad.net/gcc-arm-embedded/5.0/5-2015-q4-major/+download/gcc-arm-none-eabi-5_2-2015q4-20151219-linux.tar.bz2"

FILES_${PN} = "/lib"

inherit bin_package

SRC_URI[md5sum] = "f88caac80b4444a17344f57ccb760b90"
SRC_URI[sha256sum] = "1e94f8e287d100f0d36702ca23be7cfb7c9dabdb7e4fce9f81872f1e13e5ab8a"
