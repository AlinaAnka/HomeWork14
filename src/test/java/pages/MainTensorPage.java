package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainTensorPage {

    public void openMainPage() {
        open("/");
    }

    public void checkHeader() {
        $(".tensor_ru-Index__Banner-title").shouldBe(visible)
                .shouldHave(text("Разработка программного обеспечения"));
    }

    public void checkInfoCompany() {
        $("a[href='/about']").click();
        $(".tensor_ru-About__Banner-title").shouldBe(visible)
                .shouldHave(text("О компании"));
    }

    public void checkDevelopment() {
        $("a[href='/about/dev']").click();
        $(".tensor_ru-Dev__Banner-title").shouldBe(visible)
                .shouldHave(text("Разработка, тестирование"));
    }

    public void checkJob() {
        $("a[href='/vacancies']").click();
        $(".tensor_ru-Vacancies-head__h1")
                .shouldBe(visible).shouldHave(text("Вакансии"));
    }

    public void checkVacancies() {
        $$(".tensor_ru-Vacancies-list__item-link__title")
                .findBy(text("Тестировщик ПО")).shouldBe(visible);
    }

    public void checkBranch() {
        $("a[href='/contacts']").click();
        $(".tensor_ru-Branches-head").shouldBe(visible)
                .shouldHave(text("Филиалы"));
    }

    public void checkOffice() {
        $(".tensor_ru-Branches")
                .shouldBe(visible).shouldHave(text("Москва"));
    }

}
