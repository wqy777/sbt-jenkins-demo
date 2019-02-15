package software.purpledragon.jenkins.demo

import org.scalatest._

class GreeterSpec extends FlatSpec with Matchers {
  val sbtJenkinsDemo = new Greeter()

  "greet" should "greet bob" in {
    sbtJenkinsDemo.greet("bob") shouldBe "hello, bob"
  }
}
