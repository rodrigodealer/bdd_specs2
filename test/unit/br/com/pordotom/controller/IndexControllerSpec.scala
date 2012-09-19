package br.com.atlantico.controller

import org.specs2.mutable.Specification
import br.com.caelum.vraptor.util.test.MockSerializationResult
import br.com.pordotom.controller.IndexController

class IndexControllerSpec extends Specification {

  "IndexController" should {

    "GET '/'" in {
      val result = new MockSerializationResult()
      val controller = new IndexController(result)
      controller.index()
      result.included().containsKey("variable") must beTrue
    }

    "GET '/hello/world'" in {
      val result = new MockSerializationResult()
      val controller = new IndexController(result)
      controller.helloWorld()
      val expected = "{\"message\": {\"success\": true,\"message\": \"Hello World!\"}}"
      result.serializedResult() must be equalTo (expected)
    }

    "GET '/hello/world/{params}' with params" in {
      val result = new MockSerializationResult()
      val controller = new IndexController(result)
      controller.helloWorldWithParams("hi")
      val expected = "{\"message\": {\"success\": true,\"message\": \"hi\"}}"
      result.serializedResult() must be equalTo (expected)
    }
  }
}
