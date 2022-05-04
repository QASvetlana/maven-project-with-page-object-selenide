package com.scooter;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class OrderCreateTest extends BaseTest {


    @Test
    public void checkDataOrder() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.clickBtnOrder();
        OrderPage orderPage = open(OrderPage.URL, OrderPage.class);
        orderPage.enterFirstName();
        orderPage.enterSurname();
        orderPage.enterAdress();
        orderPage.inputMetro();
        orderPage.inputPhone();
        orderPage.btnNext();
        orderPage.chooseTime();
        orderPage.chooseTerm();
        orderPage.chooseColor();
        orderPage.inputComment();
        orderPage.buttonOrder();
        orderPage.buttonConfirmOrder();
        assertThat(orderPage.confirmationMessage(), containsString("Заказ оформлен"));


    }

    @Test
    public void checkDataOrderSecondCustomer() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.clickBtnOrder();
        OrderPage orderPage = open(OrderPage.URL, OrderPage.class);
        orderPage.enterFirstNameSecondCustomer();
        orderPage.enterSurnameSecondCustomer();
        orderPage.enterAdressSecondCustomer();
        orderPage.inputMetro();
        orderPage.inputPhoneSecondCustomer();
        orderPage.btnNext();
        orderPage.chooseTime();
        orderPage.chooseTerm();
        orderPage.chooseColor();
        orderPage.inputCommentSecondCustomer();
        orderPage.buttonOrder();
        orderPage.buttonConfirmOrder();
        assertThat(orderPage.confirmationMessage(), containsString("Заказ оформлен"));


    }
}



