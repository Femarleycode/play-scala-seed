package controllers

import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.mvc.ControllerComponents
import uk.gov.hmrc.play.test.UnitSpec
import play.api.test.FakeRequest
import play.api.http.Status

class ApplicationControllerSpec extends UnitSpec with GuiceOneAppPerSuite{
  val controllerComponents: ControllerComponents = app.injector.instanceOf[ControllerComponents]
    object TestApplicationController extends ApplicationController(
      controllerComponents
    )
  "ApplicationController .index()" should {
  val result = TestApplicationController.index()(FakeRequest())
    "return OK" in{
      status(result) shouldBe Status.OK
    }
  }

  "ApplicationController .create()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }
  }

  "ApplicationController .read()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }
  }

  "ApplicationController .update()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }
  }

  "ApplicationController .delete()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }
  }


}
