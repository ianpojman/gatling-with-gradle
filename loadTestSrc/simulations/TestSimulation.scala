package loadTests


import io.gatling.core.Predef._ // 2
import io.gatling.http.Predef._
import scala.concurrent.duration._

class TestSimulation extends Simulation {

  val httpProtocol = http
    .baseURL("http://localhost:8888/gatling-with-gradle")
    .acceptHeader("application/json")

  val testScn = scenario("test")
    .repeat(10) {
        exec(http("hello world").get("/"))
    }

  setUp(
    testScn.inject(atOnceUsers(2))
  ).protocols(http)
}