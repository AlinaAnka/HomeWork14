# Проект по автоматизации тестовых сценариев для сайта компании Tensor
111

**Технологии**:  
![Java](https://img.shields.io/badge/Java-11-red?logo=openjdk)
![Selenide](https://img.shields.io/badge/Selenide-6.12.2-blue?logo=selenium)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?logo=jenkins)

## 🔍 Описание
Автоматизированные тесты для сайта [Tensor.ru](https://tensor.ru), включающие:
- Проверку раздела "Вакансии"
- Тестирование контактных данных
- Интеграцию с Allure, Jenkins и Telegram

## 🛠 Установка
```bash
git clone https://github.com/ваш-логин/H0mework14.git
cd H0mework14
mvn clean install
```

## 📸 Скриншоты
| Компонент       | Изображение                  |
|----------------|-----------------------------|
| Allure Report  | ![Allure](screenshots/allure.png) |
| Jenkins        | ![Jenkins](screenshots/jenkins.png) |

## 📂 Структура проекта
```
H0mework14/
├── src/
│   ├── test/java/      # Тесты
│   └── main/resources/ # Конфиги
├── Jenkinsfile        # CI/CD
└── README.md          # Этот файл
```
