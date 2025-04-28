package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class QaVacancies {

    public void checkVacancies() {
        $$(".tensor_ru-Vacancies-list__item-link__title")
                .findBy(text("Тестировщик ПО")).shouldBe(visible);
    }
}
