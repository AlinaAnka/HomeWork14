package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

public class TensorTests extends TestBase {

    MainTensorPage mainPage = new MainTensorPage();
    HeaderPage headerPage = new HeaderPage();
    CompanyInfo companyInfo = new CompanyInfo();
    DevelopmentForm developmentForm = new DevelopmentForm();
    JobForm jobForm = new JobForm();
    QaVacancies qaVacancies = new QaVacancies();
    BranchForm branchForm = new BranchForm();
    MoscowOffice moscowOffice = new MoscowOffice();

    @Test
    @DisplayName("Проверяем главную страницу")
    public void checkMainPageTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Разработка программного обеспечения'", () -> {
            headerPage.checkHeader();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'О компании'")
    public void checkInfoAboutCompanyTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'О компании'", () -> {
            companyInfo.checkInfoCompany();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'Разработка ПО' ")
    public void checkDevelopmentFormTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Разработка, тестирование'", () -> {
            developmentForm.checkDevelopment();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'Работа у нас' ")
    public void checkJobFormTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Вакансии'", () -> {
            jobForm.checkJob();
        });
    }

    @Test
    @DisplayName("Проверяем вакансию 'Тестировщик ПО' ")
    public void checkQaVacanciesTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Открываем страницу Вакансии", () -> {
            jobForm.checkJob();
        });
        step("Проверяем наличие вакансии 'Тестировщик ПО'", () -> {
            qaVacancies.checkVacancies();
        });
    }

    @Test
    @DisplayName("Проверяем раздел 'Филиалы'")
    public void checkBranchFormTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем заголовок страницы 'Филиалы'", () -> {
            branchForm.checkBranch();
        });
    }

    @Test
    @DisplayName("Проверяем филиал 'Москва'")
    public void checkMoscowOfficeTest() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Открываем страницу Филиалы", () -> {
            branchForm.checkBranch();
        });
        step("Проверяем наличие филиала 'Москва'", () -> {
            moscowOffice.checkOffice();
        });
    }
}



