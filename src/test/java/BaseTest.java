import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void start() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";

    }
}
