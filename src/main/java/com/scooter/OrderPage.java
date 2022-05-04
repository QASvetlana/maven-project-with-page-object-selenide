package com.scooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static datamodel.Customer.*;


public class OrderPage {
    // адрес страницы заказа
    protected final static String URL = "https://qa-scooter.praktikum-services.ru/order";


    // Поле ввода "Имя"
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Имя']")
    private SelenideElement enterName;

    //Поле ввода "Фамилия"
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Фамилия']")
    private SelenideElement enterSurname;

    //Поле ввода "Адрес"
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement enterAdress;

    //Поле ввода "Станция метро"
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Станция метро']")
    private SelenideElement inputMetro;


    //Выбор первой станции метро
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Circle__3uWFr']")
    private SelenideElement chooseMetro;


    //Поле ввода телефона
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement inputPhone;


    //Кнопка Далее
    @FindBy(how = How.XPATH, using = "//button[text()='Далее']")
    private SelenideElement btnNext;

    //Когда привезти самокат
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement inputWhatTime;

    //Выбор даты когда привезти самокат
    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__day")
    private SelenideElement chooseWhatTime;

    //Поле на какой срок
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    private SelenideElement inputTerm;


    //Выбор на какой срок
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-option")
    private SelenideElement chooseTerm;

    //Выбор цвета самоката
    @FindBy(how = How.ID, using = "black")
    private SelenideElement chooseColor;

    //Комментария для курьера
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Комментарий для курьера']")
    private SelenideElement inputComment;

    //Кнопка "Заказать"
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonOrder;

    //Кнопка "да" на попапе "Хотите оформить заказ?"
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Да']")
    private SelenideElement buttonConfirmOrder;

    //Сообщение "Заказ оформлен"
    @FindBy(how = How.XPATH, using = "//div[text()='Заказ оформлен']")
    private SelenideElement confirmationMessage;

    //Кнопка "да все привыкли" - согласие на cookie
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement btnAddCookie;

    public void enterFirstName() {
        enterName.setValue(firstNameFirstCustomer);
    }

    public void enterSurname() {
        enterSurname.setValue(lastNameFirstCustomer);
    }

    public void enterAdress() {
        enterAdress.setValue(addressFirstCustomer);
    }

    public void inputMetro() {
        inputMetro.setValue(chooseMetroStation);
        chooseMetro.click();

    }

    public void inputPhone() {
        inputPhone.setValue(phoneFirstCustomer);
    }

    public void btnNext() {
        btnAddCookie.click();
        btnNext.shouldBe(visible).click();

    }

    public void chooseTime() {
        inputWhatTime.click();
        chooseWhatTime.click();

    }

    public void chooseTerm() {
        inputTerm.click();
        chooseTerm.click();

    }

    public void chooseColor() {
        chooseColor.click();

    }

    public void inputComment() {
        inputComment.setValue(comentFirstCustomer);
    }

    public void buttonOrder() {
        buttonOrder.shouldBe(visible).click();

    }

    public void buttonConfirmOrder() {
        buttonConfirmOrder.shouldBe(visible).click();

    }

    public String confirmationMessage() {
        String confirmationMessage = $(byText("Заказ оформлен")).shouldBe(Condition.visible).getText();

        return confirmationMessage;
    }


    public void enterFirstNameSecondCustomer() {
        enterName.setValue(firstNameSecondCustomer);
    }

    public void enterSurnameSecondCustomer() {
        enterSurname.setValue(lastNameSecondCustomer);
    }

    public void enterAdressSecondCustomer() {
        enterAdress.setValue(addressSecondCustomer);
    }


    public void inputPhoneSecondCustomer() {
        inputPhone.setValue(phoneSecondCustomer);
    }


    public void inputCommentSecondCustomer() {
        inputComment.setValue(comentSecondCustomer);
    }


}
