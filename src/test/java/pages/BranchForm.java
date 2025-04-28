package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BranchForm {

    public void checkBranch() {
        $("a[href='/contacts']").click();
        $(".tensor_ru-Branches-head").shouldBe(visible)
                .shouldHave(text("Филиалы"));
    }
}
