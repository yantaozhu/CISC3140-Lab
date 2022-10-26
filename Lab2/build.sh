#! /bin/bash

compile() {
	javac Part1.java
}

run() {
	java Part1 < input.txt
}

compileAndRun() {
	compile
	run
}
