import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchSelenideOnGitHubTest extends BaseTest {

    @Test
    void searchTest() {
        Selenide.open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("Soft");
        $(byText("SoftAssertions")).click();
        $("#wiki-wrapper").shouldHave(Condition.text("Using JUnit5 extend test class"));
    }
}
