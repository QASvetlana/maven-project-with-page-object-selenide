package com.scooter;


import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageFaqTest extends BaseTest {
    public String expected_answer_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String expected_answer_2 = "Пока что у нас так: один заказ — один самокат. " +
            "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String expected_answer_3 = "Допустим, вы оформляете заказ на 8 мая. " +
            "Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, " +
            "когда вы оплатите заказ курьеру. " +
            "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String expected_answer_4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String expected_answer_5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String expected_answer_6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String expected_answer_7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String expected_answer_8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test
    public void checkTextOfAnswerToQuestion1() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(0);
        Assert.assertEquals(expected_answer_1, actualAnswer);
    }

    @Test
    public void checkTextOfAnswerToQuestion2() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(1);
        Assert.assertEquals(expected_answer_2, actualAnswer);
    }

    @Test
    public void checkTextOfAnswerToQuestion3() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(2);
        Assert.assertEquals(expected_answer_3, actualAnswer);

    }

    @Test
    public void checkTextOfAnswerToQuestion4() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(3);
        Assert.assertEquals(expected_answer_4, actualAnswer);
    }

    @Test
    public void checkTextOfAnswerToQuestion5() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(4);
        Assert.assertEquals(expected_answer_5, actualAnswer);
    }

    @Test
    public void checkTextOfAnswerToQuestion6() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(5);
        Assert.assertEquals(expected_answer_6, actualAnswer);
    }

    @Test
    public void checkTextOfAnswerToQuestion7() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(6);
        Assert.assertEquals(expected_answer_7, actualAnswer);
    }

    @Test
    public void checkTextOfAnswerToQuestion8() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        String actualAnswer = mainPage.getAnswerText(7);
        Assert.assertEquals(expected_answer_8, actualAnswer);
    }
}
