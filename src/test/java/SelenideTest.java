import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest extends BaseTest {
    @Test
    void selenideTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");
        $("[name ='q']").setValue("junit").pressEnter();
        $$(".f4.text-normal").first().click();
        $(By.partialLinkText("Issues")).click();
        $("#issue_1703_link").shouldHave(text ("Don't convert assumption"));
    }
}
