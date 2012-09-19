package br.com.atlantico.model

import org.specs2.mutable.Specification
import br.com.pordotom.model.Message

class MessageSpec extends Specification {

  "The 'Hello world'" should {
    "return the given value" in {
      val hw = new Message(true, "oi")
      hw.getMessage must be equalTo ("oi")
      hw.isSuccess must beTrue
    }
    "return the default value" in {
      val hw = new Message()
      hw.getMessage must be equalTo ("Hello")
    }
  }
}
