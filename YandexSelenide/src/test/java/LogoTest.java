import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.conditions.webdriver.Url;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class LogoTest {
    private final String urlScooter = "https://qa-scooter.praktikum-services.ru/";
    private final String urlYandex = "https://dzen.ru/?yredirect=true";

    @Test
    public void logoTest(){
        MainPage mainPage = new MainPage();

        open("https://qa-scooter.praktikum-services.ru/");

        mainPage.scooterLogoClick();
        String scooterUrl = WebDriverRunner.url();
        Assert.assertEquals(scooterUrl, urlScooter);


        mainPage.yandexLogoClick();
        switchTo().window(1);
        String yandexUrl = WebDriverRunner.url();
        Assert.assertEquals(yandexUrl, urlYandex);
    }
}
