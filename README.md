cobertura-example
=================

Cobertura Example for CS340

See the build.xml file for configuring ant to run your junit tests with cobertura integration.

List of ant commands:
```bash
ant init # creates report directories
ant clean # deletes report directories
ant compile # compiles the src code
ant compile-tests # compiles the test code
ant test # runs junit tests
ant coverage # generates cobertura reports
```
to view the coverage reports, open the coverage-report/index.html file

