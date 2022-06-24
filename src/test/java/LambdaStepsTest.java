import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest extends BaseTest {

    @Test
    void lambdaStepsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("В инпут поиска вводим junit", () -> {
            $("[name ='q']").setValue("junit").pressEnter();
        });
        step("Выбираем первый элемент в списке", () -> {
            $$(".f4.text-normal").first().click();
        });
        step("Открываем таб Issues", () -> {
            $(By.partialLinkText("Issues")).click();
        });
        step("Проверяем наличие необходимого issue", () -> {
            $("#issue_1703_link").shouldHave(text("Don't convert assumption"));
        });

    }
}