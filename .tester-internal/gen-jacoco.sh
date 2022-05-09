#!/bin/sh
cd .tester-internal
java -jar jacococli.jar merge $(find jacoco/*.exec) --destfile jacoco/merged.exec
rm -rf ../integration-jacoco
# export reports, can change paths later
java -jar jacococli.jar report jacoco/merged.exec --classfiles ../target/classes --html ../integration-jacoco/
java -jar jacococli.jar report jacoco/merged.exec --classfiles ../target/classes --xml ../.tester-internal/jacoco-report.xml
cd ..
