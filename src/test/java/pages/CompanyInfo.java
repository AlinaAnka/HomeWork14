package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CompanyInfo {

    public void checkInfoCompany() {
        $("a[href='/about']").click();
        $(".tensor_ru-About__Banner-title").shouldBe(visible)
                .shouldHave(text("О компании"));
    }
}
