DESCRIPTION = "Open Source Cross Build Framework   \
for the Qualcomm MDM9640 ARMv7processor application processor. Provides libraries required by joynr framework."

LICENSE = "MIT"
LIC_FILES_CHKSUM ??= "file://${WORKSPACE}/meta-mdm-rec/LICENCE;md5=11e39c317a462f34e20380af1ea4de10"

#PREFERRED_PROVIDER_virtual/libc ?= "eglibc"

PREFERRED_VERSION_gcc="4.9"

inherit core-image

require images.inc
require dev_packages.inc

IMAGE_INSTALL += "kernel-module-g-multi"

IMAGE_INSTALL += "gadget-init"
IMAGE_INSTALL += "usb-gadget-init5-start"
IMAGE_INSTALL += "gadget-init-network"

DEPENDS += "gcc"

QT_DEPENDENCIES = " \
    boost \
    libwebsockets \
 "

QT_TOOLS = " \
    qtbase \
 "

DEV_TOOLS = " \
    htop \
    procps \
    iptables \
 "
    
IMAGE_INSTALL += " \
    ${DEV_TOOLS} \
    ${QT_DEPENDENCIES} \
    ${QT_TOOLS} \
 "

export IMAGE_BASENAME = "ltenad2-linaro49"