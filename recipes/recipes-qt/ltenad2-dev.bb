DESCRIPTION = "Open Source Cross Build Framework \
for the Qualcomm MDM9640 ARMv7processor application processor. Development image."

LICENSE = "MIT"
LIC_FILES_CHKSUM ??= "file://${WORKSPACE}/meta-mdm-rec/LICENCE;md5=11e39c317a462f34e20380af1ea4de10"

inherit core-image

require images.inc
require dev_packages.inc

IMAGE_INSTALL += "kernel-module-g-multi"
IMAGE_INSTALL += "gadget-init"
IMAGE_INSTALL += "usb-gadget-init5-start"
IMAGE_INSTALL += "gadget-init-network"

DEV_TOOLS = " \
    htop \
    procps \
    iptables \
 "

KERNEL_FEATURES = " \
    kexec-tools \
    rsyslog \
"

IMAGE_INSTALL += " \
    ${DEV_TOOLS} \
    ${KERNEL_FEATURES} \
 "

export IMAGE_BASENAME = "ltenad2-dev"
