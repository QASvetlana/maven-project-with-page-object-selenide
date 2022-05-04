package com.scooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    // адрес главной страницы сайта
    protected final static String URL = "https://qa-scooter.praktikum-services.ru/";


    // Кнопка "Статус заказа"
    @FindBy(how = How.XPATH, using = "//button[@class='Header_Link__1TAG7'][text()='Статус заказа']")
    private SelenideElement btnShowInputField;

    //Поле ввода номера заказа
    @FindBy(how = How.XPATH, using = "//button[@placeholder='Введите номер заказа']")
    private SelenideElement inputOrderNum;

    //Кнопка "GO!" - поиск заказа
    @FindBy(how = How.XPATH, using = "//button[text()='Go!']")
    private SelenideElement btnFindOrder;

    //Кнопка "да все привыкли" - согласие на cookie
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton")
    private SelenideElement btnAddCookie;

    //popup с cookie
    @FindBy(how = How.CLASS_NAME, using = "App_CookieConsent")
    private SelenideElement popupCookies;

    //текст - И здесь Cookies
    @FindBy(how = How.CLASS_NAME, using = "App_CookieText")
    private SelenideElement textCookies;

    //Кнопка "Заказать" - в хедере
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g'][text()='Заказать']")
    private SelenideElement btnOrder;

    //Кнопка "Заказать" - в нижней части страницы
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Заказать']")
    private SelenideElement clickBtnOrder;

    //Картинка - логотип самокат
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter")
    private SelenideElement logoScooter;

    //Картинка - логотип Яндекс
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex")
    private SelenideElement logoYandex;

    //текст:"Учебный тренажер"
    @FindBy(how = How.XPATH, using = "//div[text()='Учебный тренажер']")
    private SelenideElement textTrainingSimulator;

    //картинка - самокат
    @FindBy(how = How.XPATH, using = "//img[@src='/assets/scooter.png']")
    private SelenideElement imgScooter;

    //текст - Самокат на пару дней
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX']")
    private SelenideElement textAboutScooterACoupleOfDays;

    //текст - Привезём его прямо к вашей двери,а когда накатаетесь — заберём
    @FindBy(how = How.XPATH, using = "//div[text()='Привезём его прямо к вашей двери,']")
    private SelenideElement textSubScooterACoupleOfDays;

    //текст - Он легкий и с мощными колесами
    @FindBy(how = How.XPATH,
            using = "//div[text()='Он лёгкий и с мощными колёсами— самое то, " +
                    "чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
    private SelenideElement textSubScooterlightWithPowerfulWheels;


    //скрол вниз
    @FindBy(how = How.CLASS_NAME, using = "Home_ArrowDown")
    private SelenideElement scrollDown;

    //элемент-блок с параметрами самоката (скорость, расстояние, вес)
    @FindBy(how = How.CLASS_NAME, using = "Home_Table")
    private SelenideElement scooterTable;

    // текст "Модель Toxic PRO"
    @FindBy(how = How.XPATH, using = "//div[text()='Модель Toxic PRO']")
    private SelenideElement scooterModel;

    // максимальная скорость
    @FindBy(how = How.XPATH, using = "//div[text()='Максимальная скорость']")
    private SelenideElement textScooterMaxSpeed;

    // 40 км/ч
    @FindBy(how = How.XPATH, using = "//div[text()='40 км/ч']")
    private SelenideElement scooterMaxSpeed;

    // проедет без поздарядки
    @FindBy(how = How.XPATH, using = "//div[text()='Проедет без поздарядки']")
    private SelenideElement textScooterRightWithoutCharge;

    // 80 км
    @FindBy(how = How.XPATH, using = "//div[text()='80 км']")
    private SelenideElement ScooterRightWithoutCharge;

    // выдерживает вес
    @FindBy(how = How.XPATH, using = "//div[text()='Выдерживает вес']")
    private SelenideElement textScooterWeight;

    // 120 кг
    @FindBy(how = How.XPATH, using = "//div[text()='120 кг']")
    private SelenideElement ScooterWeight;

    // элемент Кружок с цифрой 1 внутри
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='1']")
    private SelenideElement circleOne;

    // элемент Кружок с цифрой 2 внутри
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='2']")
    private SelenideElement circleTwo;

    // элемент Кружок с цифрой 3 внутри
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='3']")
    private SelenideElement circleThree;

    // элемент Кружок с цифрой 4 внутри
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='4']")
    private SelenideElement circleFour;

    //текст - Как это работает
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Как это работает')]")
    private SelenideElement textHowThisWorking;

    // шаг 1 "Заказываете самокат"
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Заказываете самокат')]")
    private SelenideElement stepOne;

    // описание шага 1 – Выбираете когда и куда привести
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Выбираете, когда')]")
    private SelenideElement descriptionStepOne;

    // шаг 2 "Курьер привозит самокат"
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Курьер привозит самокат')]")
    private SelenideElement stepTwo;

    // описание шага 2 – А вы оплачиваете аренду
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'А вы — оплачиваете аренду')]")
    private SelenideElement descriptionStepTwo;

    // шаг 3 "Катаетесь"
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Катаетесь')]")
    private SelenideElement stepThree;

    // описание шага 3 – Сколько часов аренды осталось – видно на сайте
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Сколько часов аренды осталось — видно на сайте')]")
    private SelenideElement descriptionStepThree;

    // шаг 4 "Курьер забирает самокат"
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Курьер забирает самокат')]")
    private SelenideElement stepFour;

    // описание шага 4 – Когда аренда заканчивается
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Когда аренда заканчивается')]")
    private SelenideElement descriptionStepFour;

    //текст "Вопросы о важном"
    @FindBy(how = How.XPATH, using = "//div[text()='Вопросы о важном']")
    private SelenideElement textQuestionsAboutImportant;

    // коллекция всех элементов вопрос-ответ
    @FindBy(how = How.CLASS_NAME, using = "accordion__item")
    private ElementsCollection faqCollection;

    // коллекция вопросов
    @FindBy(how = How.CLASS_NAME, using = "accordion__heading")
    private ElementsCollection question;

    // коллекция ответов
    @FindBy(how = How.CLASS_NAME, using = "accordion__panel")
    private ElementsCollection answer;


    //Кликнуть по вопросу i
    public MainPage clickOnQuestion(int i) {
        question.get(i).scrollTo().click();
        return this;

    }

    //Получить текст ответа на вопрос i
    public String getAnswerText(int i) {
        clickOnQuestion(i);
        return answer.get(i).shouldBe(Condition.visible).getText();
    }


    public void clickBtnOrder() {

        SelenideElement clickBtnOrder = $(byId("//button[@class='Button_Button__ra12g'][text()='Заказать']"));
        btnOrder.click();

    }


    public void clickBtnSecondOrder() {
        btnAddCookie.click();
        SelenideElement clickBtnSecondOrder = $(byXpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Заказать']")).scrollTo();
        clickBtnOrder.click();
    }

}



