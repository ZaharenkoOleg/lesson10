import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StepsWithAnnotations extends BaseTest {

    @Step("Открываем главную страницу")
    void openMainPage() {
        open("https://github.com");
    }

    @Step("В инпут поиска вводим junit")
    void searchRepository() {
        $("[name ='q']").setValue("junit").pressEnter();
    }

    @Step("Выбираем первый элемент в списке")
    void openFirstRepository() {
        $$(".f4.text-normal").first().click();
    }

    @Step("Открываем таб Issues")
    void openIssueTab() {
        $(By.partialLinkText("Issues")).click();
    }

    @Step("Проверяем наличие необходимого issue")
    void checkResult() {
        $("#issue_1703_link").shouldHave(text("Don't convert assumption"));
    }
}
