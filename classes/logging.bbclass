bbplain() {
	echo "$*"
}

bbnote() {
	echo "NOTE: $*"
}

bbwarn() {
	echo "WARNING: $*"
}

bberror() {
	echo "ERROR: $*"
}

bbfatal() {
	echo "ERROR: $*"
	exit 1
}
