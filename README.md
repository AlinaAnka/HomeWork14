# Проект по автоматизации тестовых сценариев для сайта компании <a href="https://tensor.ru"> <img src="images/logo_tensor.png" width="200" >

## 📔 Содержание:

## 🛠 Технологии и инструменты: 

| Java | IntelliJ <br> Idea | GitHub | JUnit <br> 5 | Gradle | Selenide | Selenoid | Alurre <br> Report | Jenkins | Telegram |  
|------|--------------------|--------|--------------|--------|----------|----------|--------------------|---------|----------|
| <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="50" height="50" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="50" height="50" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="50" height="50" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50" /> | <img src="images/Selenide.svg" width="50" height="50" /> | <img src="images/Selenoid.svg" width="50" height="50" /> | <img src="images/Allure_Report.svg" width="50" height="50" /> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" /> | <img src="images/Telegram.svg" width="50" height="50" /> |
          
## ☑️ Реализованные проверки:

- Проверка заголовка на главной странице  
- Проверка раздела "О компании"
- Проверка раздела "Разработка ПО"
- Проверка раздела "Работа у нас"
- Проверка вакансии "Тестировщик ПО"
- Проверка раздела "Филиалы"
- Проверка филиала "Москва"

## ▶️ Запуск автотестов

### Запуск тестов из терминала

```bash
gradle clean test
```

### Запуск тестов на удаленном браузере

```bash
-Dbrowser=${BROWSER}
-Dscreen_resolution=${SCREEN_RESOLUTION}
-Dbrowser_version=${BROWSER_VERSION}
```

## <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" /> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/HomeWork14/)
<img src="images/screenshot_jenkins.png">


### Параметры сборки в Jenkins:
- browser (браузер chrome)
- browser_version (версия браузера 127.0)
- screen_resolution (разрешение экрана 1920x1080)


## Allure Report

### Overview

### Тест-кейсы

## Уведомления в Telegram с использованием бота

## Примеры видео выполнения тестов на Selenoid

