package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DevelopmentForm {

    public void checkDevelopment() {
        $("a[href='/about/dev']").click();
        $(".tensor_ru-Dev__Banner-title").shouldBe(visible)
                .shouldHave(text("Разработка, тестирование"));
    }
}
