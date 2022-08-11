import com.codeborne.selenide.Selenide.{$, open}
import com.codeborne.selenide.Condition._
import org.scalatest.funsuite.AnyFunSuite

class DuckDuckGoSpec extends AnyFunSuite {

  test("Should open Duckduckgo page") {
    open("https://duckduckgo.com")
    $("#logo_homepage_link").shouldBe(visible)
  }

}
