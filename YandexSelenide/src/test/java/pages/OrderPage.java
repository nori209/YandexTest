package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {

    /**
     * Xpath анкеты
     */

    private final SelenideElement nameXpath = $x("//input[@placeholder='* Имя']");
    private final SelenideElement surnameXpath = $x("//input[@placeholder='* Фамилия']");
    private final SelenideElement addressXpath = $x("//input[@placeholder='* Адрес: куда привезти заказ']");
    private final SelenideElement numberXpath = $x("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final SelenideElement pageXpath = $x("//div[@class='Order_Content__bmtHS']");

    /**
     * Xpath предупреждений
     */

    private final SelenideElement warningNameXpath = $x("//div[@class='Input_InputContainer__3NykH'][1]//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");
    private final SelenideElement warningSurnameXpath = $x("//div[@class='Input_InputContainer__3NykH'][2]//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");
    private final SelenideElement warningAddressXpath = $x("//div[@class='Input_InputContainer__3NykH'][3]//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");
    private final SelenideElement warningNumberXpath = $x("//div[@class='Input_InputContainer__3NykH'][4]//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");

    public void warningEqualsName(){
        String st = warningNameXpath.getText();
        Assert.assertEquals("Введите корректное имя", st);
    }
    public void warningEqualsSurname(){
        String st = warningSurnameXpath.getText();
        Assert.assertEquals("Введите корректную фамилию", st);
    }
    public void warningEqualsAddress(){
        String st = warningAddressXpath.getText();
        Assert.assertEquals("Введите корректный адрес", st);
    }
    public void warningEqualsNumber(){
        String st = warningNumberXpath.getText();
        Assert.assertEquals("Введите корректный номер", st);
    }

    public void nameClick(){
        nameXpath.setValue("1").click();
    }
    public void surnameClick(){
        surnameXpath.setValue("1").click();
    }
    public void addressClick(){
        addressXpath.setValue("1").click();
    }
    public void numberClick(){
        numberXpath.setValue("1").click();
    }
    public void pageClick(){
        pageXpath.click();
    }

}
