package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import static com.codeborne.selenide.Selenide.$x;

/**
 * PageObject главной страницы сайта: https://qa-scooter.praktikum-services.ru/
 */

public class MainPage {

    /**
     * Xpath кнопка статуса заказа, ввода номера и кнопки Go
     */
    private final SelenideElement go = $x("//button[@class='Button_Button__ra12g Header_Button__28dPO']");
    private final SelenideElement status = $x("//button[@class='Header_Link__1TAG7']");
    private final SelenideElement inputNumber = $x("//input[@placeholder='Введите номер заказа']");

    /**
     * Xpath Кнопок логотипов
     */

    private final SelenideElement scooterLogo = $x("//img[@alt='Scooter']");
    private final SelenideElement yandexLogo = $x("//img[@alt='Yandex']");

    /**
     * Xpath кнопок с вопросом
     */

    private final SelenideElement questionOne = $x("//div[@class='accordion__item'][1]");
    private final SelenideElement questionTwo = $x("//div[@class='accordion__item'][2]");
    private final SelenideElement questionTree = $x("//div[@class='accordion__item'][3]");
    private final SelenideElement questionFour = $x("//div[@class='accordion__item'][4]");
    private final SelenideElement questionFive = $x("//div[@class='accordion__item'][5]");
    private final SelenideElement questionSix = $x("//div[@class='accordion__item'][6]");
    private final SelenideElement questionSeven = $x("//div[@class='accordion__item'][7]");
    private final SelenideElement questionEight = $x("//div[@class='accordion__item'][8]");

    /**
     * Xpath ответов на вопросы
     */

    private final SelenideElement answerOne = $x("//div[@aria-labelledby='accordion__heading-0']//p");
    private final SelenideElement answerTwo = $x("//div[@aria-labelledby='accordion__heading-1']//p");
    private final SelenideElement answerTree = $x("//div[@aria-labelledby='accordion__heading-2']//p");
    private final SelenideElement answerFour = $x("//div[@aria-labelledby='accordion__heading-3']//p");
    private final SelenideElement answerFive = $x("//div[@aria-labelledby='accordion__heading-4']//p");
    private final SelenideElement answerSix = $x("//div[@aria-labelledby='accordion__heading-5']//p");
    private final SelenideElement answerSeven = $x("//div[@aria-labelledby='accordion__heading-6']//p");
    private final SelenideElement answerEight = $x("//div[@aria-labelledby='accordion__heading-7']//p");

    /**
     *  методы клика на кнопку статуса заказа, ввода номера и клика по кнопке Go
     */

    public void statusClick(){
        status.click();
    }
    public void inputNum(){
        inputNumber.setValue("1234");
    }
    public void goClick(){
        go.click();
    }

    /**
     *  методы клика по лого
     */

    public void scooterLogoClick(){
        scooterLogo.click();
    }
    public void yandexLogoClick(){
        yandexLogo.click();
    }

    /**
     * сравнение ожидаемого результата с существующим
     */

    public void comparisonAnswerOne() {
        String string = answerOne.getText();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", string);
    }
    public void comparisonAnswerTwo() {
        String string = answerTwo.getText();
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", string);
    }
    public void comparisonAnswerTree() {
        String string = answerTree.getText();
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", string);
    }
    public void comparisonAnswerFour() {
        String string = answerFour.getText();
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", string);
    }
    public void comparisonAnswerFive() {
        String string = answerFive.getText();
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", string);
    }
    public void comparisonAnswerSix() {
        String string = answerSix.getText();
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", string);
    }
    public void comparisonAnswerSeven() {
        String string = answerSeven.getText();
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", string);
    }
    public void comparisonAnswerEight() {
        String string = answerEight.getText();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", string);
    }

    /**
     * методы клика по кнопкам вопросов
     */

    public void clickQuestionOne(){
        questionOne.scrollTo().click();
    }
    public void clickQuestionTwo(){
        questionTwo.click();
    }
    public void clickQuestionTree(){
        questionTree.click();
    }
    public void clickQuestionFour(){
        questionFour.click();
    }
    public void clickQuestionFive(){
        questionFive.click();
    }
    public void clickQuestionSix(){
        questionSix.click();
    }
    public void clickQuestionSeven(){
        questionSeven.click();
    }
    public void clickQuestionEight(){
        questionEight.click();
    }
}

