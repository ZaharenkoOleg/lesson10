import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class TestAnnotatedSteps {
    @Test
    public void testAnnotatedSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepsWithAnnotations step = new StepsWithAnnotations();
        step.openMainPage();
        step.searchRepository();
        step.openFirstRepository();
        step.openIssueTab();
        step.checkResult();
    }
}
