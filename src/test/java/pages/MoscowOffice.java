package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MoscowOffice {

    public void checkOffice() {
        $(".tensor_ru-Branches")
                .shouldBe(visible).shouldHave(text("Москва"));
    }
}
