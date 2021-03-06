package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Util{
    LoadProp loadPorp = new LoadProp();
    // store gender veriable
    private By _gender = By.xpath("//div[@id=\"gender\"]");
    // store firstname veriable
    private By _firstname = By.xpath("//input[@id =\"FirstName\"]");
    // store last name veriable
    private By _lastname = By.xpath("//input[@id =\"LastName\"]");
    // store dateof birth veriable
    private By _dateOfbirth = By.xpath("//select[@name = \'DateOfBirthDay\']");
    // store monthof birth veriable
    private By _Monthofbirth = By.xpath("//select[@name = \'DateOfBirthMonth\']");
    // store yearOf  birth veriable
    private By _yearOfbirth = By.xpath(("//select[@name = \'DateOfBirthYear\']"));
    //store emailfile veriable
    private By _Emailfield = By.xpath("//input[@id=\"Email\"]");
    // store computernamefirld veriable
    private By _CompanyNameField = By.xpath("//input[@id=\"Company\"]");
    // store newsletter veriable
    private By _NewsLetter = By.xpath(("//input[@id=\"Newsletter\"]"));
    // store password veriable
    private By _Password = By.xpath("//input[@id=\"Password\"]");
    // store confirmpassword veriable
    private By _ConfirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    // store registerbutton veriable
    private By _RegisterButton = By.xpath("//input[@id=\"register-button\"]");


    public void userEnterRegistrationDetails()
    {
        // click on gender
        clickonElement(_gender);
        // send text in firstname as priyan
        sendKeyElement(_firstname,loadPorp.getProperty("firstName"));
        // send text in lastname as hirapara
        sendKeyElement(_lastname,loadPorp.getProperty("lastname"));
        // select dropdown method for dirth of day
        selectFromDropDownByValue(_dateOfbirth, "10");
        // select dropdown method for dirth of month
        selectFromDropDownByVisibleText(_Monthofbirth, "May");
        // select dropdown method for dirth of year
        selectFromDropDownByValue(_yearOfbirth, "1920");
        // by using dropdown method print email
        String Email = loadPorp.getProperty("email1")+"+"+ timestamp()+loadPorp.getProperty("email2");
        // send email
        sendKeyElement(_Emailfield,Email);
        // send company name
        sendKeyElement(_CompanyNameField,loadPorp.getProperty("company"));
        // click on newsletter
        clickonElement(_NewsLetter);
        // send password
        sendKeyElement(_Password,loadPorp.getProperty("password"));
        // send confirmpassword
        sendKeyElement(_ConfirmPassword,loadPorp.getProperty("confirmpassword"));
    }
    //creat userIsClickingonRegistrationButton method
    public void userIsClickingonRegistrationsubmitButton()
    {
        // click on registerbutton
        clickonElement(_RegisterButton);
    }
}



