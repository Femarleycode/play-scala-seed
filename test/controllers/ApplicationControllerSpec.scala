package controllers

import models.DataModel
import org.scalatest.mockito.MockitoSugar
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.mvc.ControllerComponents
import uk.gov.hmrc.play.test.UnitSpec
import play.api.test.FakeRequest
import play.api.http.Status
import repositories.DataRepository
import org.mockito.ArgumentMatchers._
import org.mockito.Mockito._
import play.api.libs.json.{JsObject, Json}
import reactivemongo.api.commands.{LastError, WriteResult}

import scala.concurrent.{ExecutionContext, Future}

class ApplicationControllerSpec extends UnitSpec with GuiceOneAppPerSuite with MockitoSugar{
  val controllerComponents: ControllerComponents = app.injector.instanceOf[ControllerComponents]
  implicit val ec: ExecutionContext = app.injector.instanceOf[ExecutionContext]
  val mockDataRepository: DataRepository = mock[DataRepository]

    object TestApplicationController extends ApplicationController(
      controllerComponents,
      mockDataRepository,
      ec
    )

  val dataModel: DataModel = DataModel(
  "abcd",
  "test name",
  "test description",
  100
  )

  "ApplicationController .create" when {
    "the json body is valid" should {
      val jsonBody: JsObject = Json.obj(
        "_id" -> "abcd",
        "name" -> "test name",
        "description" -> "test description",
        "numSales" -> 100
      )
      val writeResult: WriteResult = LastError(ok = true, None, None, None, 0, None, updatedExisting = false, None, None, wtimeout = false, None, None)

      when(mockDataRepository.create(any()))
        .thenReturn(Future(writeResult))

      val result = TestApplicationController.create()(FakeRequest().withBody(jsonBody))

      "return CREATED" in {
        status(result) shouldBe Status.CREATED
      }
    }
  }



  "ApplicationController .index()" should {
  val result = TestApplicationController.index()(FakeRequest())
    "return OK" in{
      status(result) shouldBe Status.OK
    }
  }

  "ApplicationController .create()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.OK
    }
  }

  "ApplicationController .read()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.OK
    }
  }

  "ApplicationController .update()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.OK
    }
  }

  "ApplicationController .delete()" should {
    val result = TestApplicationController.index()(FakeRequest())
    "return TODO" in{
      status(result) shouldBe Status.OK
    }
  }


}
