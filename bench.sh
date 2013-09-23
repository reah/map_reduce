#!/bin/bash

rm -rf test-bench-*
time hadoop jar proj1.jar Proj1 -conf conf.xml -Dcombiner=true ~cs61c/data/sample.seq test-bench-int test-bench-out

echo "You should make sure that the time reported under the category 'user' is less than 2 minutes."

exit 0
