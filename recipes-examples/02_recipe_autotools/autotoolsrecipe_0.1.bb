DESCRIPTION = "REC testing recipe. Does nothing, yust says something..."
LICENSE = "REC"
LIC_FILES_CHKSUM = "file://${COREBASE}/../meta-mdm-rec/files/rec-license;md5=cce63d5b4335303d80851a3ffd492e96"
PR = "r0"

# SRC_URI = "git://github.com/linneman/idefix.git"
# SRCREV = "master"
# S = "${WORKDIR}/git"

FILESEXTRAPATHS_prepend := "${WORKSPACE}"
SRC_URI = "file://rec/idefix"
S = "${WORKDIR}/idefix"


inherit autotools
