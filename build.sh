#!/usr/bin/env bash

DIR=.

if [ x$TARGET == x ]; then
case "$OSTYPE" in
  darwin*)  TARGET=macbook ;;
  linux*)   TARGET=linux ;;
  *)        echo "unknown: $OSTYPE" && exit 1;;
esac
fi

var=CFLAGS_${TARGET}
CFLAGS=${!var}
var=LINKER_ARGS_${TARGET}
LINKER_ARGS=${!var}
var=COMPILER_ARGS_${TARGET}
COMPILER_ARGS=${!var} # add -opt for an optimized build.

konanc $COMPILER_ARGS -target $TARGET $DIR/src/gbgtechradar/kotlin/demo/collections/Collections.kt $DIR/src/Main.kt  -o Collections || exit 1
