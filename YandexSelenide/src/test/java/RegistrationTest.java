import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest {
    @Test
    public void registrationTest() {

        /**
         * ShadowDom не дает получить Xpath выбора станций
         */

        open("https://qa-scooter.praktikum-services.ru/order");
        $x("//div[@class='select-search']").click();
        //$x("") setValue("Сокольники");

    }
}