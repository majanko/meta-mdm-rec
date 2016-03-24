DESCRIPTION = "Very fast, header only, C++ logging library."
HOMEPAGE = "https://github.com/gabime/spdlog/wiki"
LICENSE = "MIT"
LIC_FILES_CHKSUM ??= "file://${WORKSPACE}/meta-mdm-rec//files/LICENCE;md5=cf4a21270f331e068c4ae90d6711e62e"
SRC_URI = ""

S = "${WORKDIR}/git"

inherit cmake
