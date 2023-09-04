import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class AnswerTest {
    @Test
    public void answerTest(){
        MainPage mainPage = new MainPage();

        open("https://qa-scooter.praktikum-services.ru/");

        mainPage.clickQuestionOne();
        mainPage.comparisonAnswerOne();

        mainPage.clickQuestionTwo();
        mainPage.comparisonAnswerTwo();

        mainPage.clickQuestionTree();
        mainPage.comparisonAnswerTree();

        mainPage.clickQuestionFour();
        mainPage.comparisonAnswerFour();

        mainPage.clickQuestionFive();
        mainPage.comparisonAnswerFive();

        mainPage.clickQuestionSix();
        mainPage.comparisonAnswerSix();

        mainPage.clickQuestionSeven();
        mainPage.comparisonAnswerSeven();

        mainPage.clickQuestionEight();
        mainPage.comparisonAnswerEight();
    }
}
