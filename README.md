gatling-with-gradle
===================

Sample project that demonstrates how to automate load testing with [Gatling][1] and [Gradle][2]

----

Project Overview
-----------------

**buildSrc/** --Custom Gradle tasks for setting up and tearing down test data
**loadTestSrc/** -- Gatling simulation
**testWebAppSrc/** -- A simple Groovy web application
**build.gradle** - Gradle file defining the load test tasks

Running the Load Test
---------------------
In your favorite terminal type:
`./gradlew runLoadTest`

Gatling will create a summary of the test results which can be viewed in a browser


  [1]: http://gatling-tool.org/
  [2]: http://www.gradle.org/