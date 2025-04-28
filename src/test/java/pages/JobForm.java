package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class JobForm {

    public void checkJob() {
        $("a[href='/vacancies']").click();
        $(".tensor_ru-Vacancies-head__h1")
                .shouldBe(visible).shouldHave(text("Вакансии"));
    }
}
