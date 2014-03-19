# Cobertura Example for BYU CS340

See the **build.xml** file for a simple example of configuring ant to run your junit tests with cobertura integration.

List of available ant commands:
```bash
ant clean # deletes report directories
ant init # creates report directories
ant compile # compiles the src code
ant compile-tests # compiles the test code
ant test # runs junit tests
ant coverage # generates cobertura reports
```
to view the coverage reports, open **coverage-reports/index.html** in a browser

for a full tutorial, visit: https://github.com/cobertura/cobertura/wiki/Ant-Task-Reference
