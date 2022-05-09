#!/bin/sh

cd .tester-internal

# the Tester should've generated individual exec files for each parsed test in the jacoco/ folder; merge all of them
# into a combined exec file
java -jar jacococli.jar merge $(find jacoco/*.exec) --destfile jacoco/merged.exec

# clean out the old report
rm -rf ../integration-jacoco

# Generate the new HTML report
java -jar jacococli.jar report jacoco/merged.exec --classfiles ../target/classes --html ../integration-jacoco/

# Clean out all of the old exec files form the directory
rm $(find jacoco/*.exec)

cd ..

