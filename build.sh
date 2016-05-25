#!/bin/sh

[ -d tmp ] || mkdir tmp
find src -name "*.java" -print0 | xargs -0 javac -d tmp
echo 'Main-Class: polyplot.PolyPlot' > tmp/manifest.txt
jar cfm polyplot.jar tmp/manifest.txt -C tmp .
