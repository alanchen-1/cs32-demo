#!/bin/sh
cd .tester-internal
java -jar jacococli.jar merge $(find jacoco/*.exec) --destfile jacoco/merged.exec
rm -rf ../integration-jacoco
java -jar jacococli.jar report jacoco/merged.exec --classfiles ../target/classes --html ../integration-jacoco/
cd ..
