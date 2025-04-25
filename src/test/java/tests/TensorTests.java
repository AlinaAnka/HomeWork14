package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainTensorPage;
import static io.qameta.allure.Allure.step;

public class TensorTests extends TestBase {

    MainTensorPage mainPage = new MainTensorPage();

    @Test
    @DisplayName("Проверяем главную страницу")
    public void checkMainPage() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Разработка программного обеспечения'", () -> {
            mainPage.checkHeader();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'О компании'")
    public void checkInfoAboutCompany() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'О компании'", () -> {
            mainPage.checkInfoCompany();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'Разработка ПО' ")
    public void checkDevelopmentForm() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Разработка, тестирование'", () -> {
            mainPage.checkDevelopment();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'Работа у нас' ")
    public void checkJobForm() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Вакансии'", () -> {
            mainPage.checkJob();
        });
    }

    @Test
    @DisplayName("Проверяем вакансию 'Тестировщик ПО' ")
    public void checkQaVacancies() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Открываем страницу Вакансии", () -> {
            mainPage.checkJob();
        });
        step("Проверяем наличие вакансии 'Тестировщик ПО'", () -> {
            mainPage.checkVacancies();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'Филиалы'")
    public void checkBranchForm() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Филиалы'", () -> {
            mainPage.checkBranch();
        });
    }

    @Test
    @DisplayName("Проверяем филиал 'Москва'")
    public void checkMoscowOffice() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Открываем страницу Филиалы", () -> {
            mainPage.checkBranch();
        });
        step("Проверяем наличие филиала 'Москва'", () -> {
            mainPage.checkOffice();
        });
    }
}



