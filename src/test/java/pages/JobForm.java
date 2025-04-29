package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JobForm {

    public void checkJob() {
        $("a[href='/vacancies']").click();
        $(".tensor_ru-Vacancies-head__h1")
                .shouldBe(visible).shouldHave(text("Вакансии"));
    }
    public void checkVacancies() {
        $$(".tensor_ru-Vacancies-list__item-link__title")
                .findBy(text("Тестировщик ПО")).shouldBe(visible);
    }
}
