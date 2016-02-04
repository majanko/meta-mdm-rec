require libwebsockets.inc

PRIORITY = "10"

SRCREV = "ab620ffde36b3186a6392e75d96d8f7016a2b3f6"
SRC_URI += "git://github.com/warmcat/libwebsockets.git;branch=${PV};protocol=git"

#git://github.com/bmwcarit/joynr.git;branch=${PV};protocol=git

CENCEBBCLASSEXTEND += " native "
