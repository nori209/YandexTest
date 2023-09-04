package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class StatusPage {

    private final SelenideElement button = $x("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    private final SelenideElement png = $x("//img[@src='/assets/not-found.png']");

    public void clickButton(){
        button.click();
    }

    public void checkPicture() {
        SelenideElement s = png.shouldBe(Condition.exist);
        //Assert.assertEquals( , s);
    }
}
