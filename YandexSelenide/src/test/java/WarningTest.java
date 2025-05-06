import org.junit.Test;
import pages.OrderPage;

import static com.codeborne.selenide.Selenide.open;

public class WarningTest {

    @Test
    public void warningTest(){
        OrderPage orderPage = new OrderPage();
        open("https://qa-scooter.praktikum-services.ru/order/");

        orderPage.nameClick();
        orderPage.surnameClick();
        orderPage.addressClick();
        orderPage.numberClick();
        orderPage.pageClick();

        orderPage.warningEqualsName();
        orderPage.warningEqualsSurname();
        orderPage.warningEqualsAddress();
        orderPage.warningEqualsNumber();
    }
}
