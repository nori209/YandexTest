import org.junit.Test;
import pages.MainPage;
import pages.StatusPage;

import static com.codeborne.selenide.Selenide.open;

public class CheckTest {
    @Test
    public void checkTest(){

        MainPage mainPage = new MainPage();
        StatusPage statusPage = new StatusPage();

        open("https://qa-scooter.praktikum-services.ru/");

        mainPage.statusClick();
        mainPage.inputNum();
        mainPage.goClick();

        statusPage.clickButton();
        statusPage.checkPicture();

    }
}
