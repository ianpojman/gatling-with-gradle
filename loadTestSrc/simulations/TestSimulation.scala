package loadTests

import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import bootstrap._

class TestSimulation extends Simulation {

  val httpProtocol = httpConfig
    .baseURL("http://localhost:8094/gatling-with-gradle")
    .acceptHeader("application/json")

  val testScn = scenario("test")
    .repeat(10) {
        exec(http("hello world").get("/"))
    }

  setUp(testScn.users(2).protocolConfig(httpProtocol))
}