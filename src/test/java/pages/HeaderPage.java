package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    public void checkHeader() {
        $(".tensor_ru-Index__Banner-title").shouldBe(visible)
                .shouldHave(text("Разработка программного обеспечения"));
    }
}