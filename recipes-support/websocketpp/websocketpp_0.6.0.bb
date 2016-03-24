require websocketpp.inc

PRIORITY = "10"

SRCREV = "c5510d6de04917812b910a8dd44735c1f17061d9"
SRC_URI += "git://github.com/zaphoyd/websocketpp.git;branch=${PV};protocol=git"

DEPENDS += "boost"

#git://github.com/bmwcarit/joynr.git;branch=${PV};protocol=git

CENCEBBCLASSEXTEND += " native "
