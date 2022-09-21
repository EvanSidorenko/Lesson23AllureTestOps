package allureTests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureAuthTest {
    @Test
    @AllureId("12236")
    @DisplayName("Проверка авторизации в bookvoed.ru")
    @Owner("allure8")
    @Feature("Авторизация")
    public void authBookboedTest() {
        step("Открываем главную страницу");
        step("Кликаем на иконку Кабинет");
        step("Авторизуемся под ползователем random-user/random-password");
        step("Кликаем на Войти");
    }
}
