package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;
import ru.geekbrains.main.site.at.page.AuthorizationPage;

import static ru.geekbrains.main.site.at.block.NavigationBlock.NameButton;
//        Дополнительное задание
//        Реализовать тест:
//        1. Перейти на страницу авторизация https://geekbrains.ru/login
//        2. Ввести логин : hks47018@eoopy.com
//        3. Пароль: hks47018
//        4. Нажать кнопку войти
//        5. Проверить что отобразилась страница "Главная"
//        6. Нажать в навигации "Курсы"
//        7. Нажать в шапке сайта "Курсы"
//        8. Выбрать в фильтрах чекбокс "Бесплатные"
//        9. Выбрать в фильтрах чекбокс "Тестирование"
//        10. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
//        11. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"
@DisplayName("Дополнительное задание")
@Execution(ExecutionMode.CONCURRENT)
public class SearchWebTestTwo extends BaseSettingsTest {
    @DisplayName("Проверка отоброжения контента")
    @Test
    void SearchTestTwo() {
        new AuthorizationPage(driver)
                .openURL()
                .singIn("hks47018@eoopy.com", "hks47018")
                .checkPageName(NameButton.HOME)
                .getNavigationBlock()
                .clickButton(NameButton.COURSES)
                .getHeaderCoursesBlock()
                .clickButton("Курсы")
                .getFiltersBlock()
                .clickButton("Бесплатные")
                .getFiltersBlock()
                .clickButton("Тестирование")
                .getSampleBlock()
                .searchContent("Тестирование ПО. Уровень 1")
                .getSampleBlock()
                .searchContent("Тестирование ПО. Уровень 2");
    }
}
