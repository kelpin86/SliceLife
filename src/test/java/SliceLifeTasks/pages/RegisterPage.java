package SliceLifeTasks.pages;

import SliceLifeTasks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div/div[2]/div/div[1]/div[3]")
    public WebElement Register;

    @FindBy(name="firstName")
    public WebElement FirstNameInput;

   @FindBy(name="lastName")
    public WebElement LastNameInput;

   @FindBy(name="phoneNumber")
    public WebElement PhoneNumberInput;

   @FindBy(name="email")
    public WebElement EmailInput;

   @FindBy(name="password")
    public WebElement PasswordInput;

   @FindBy(name="passwordConfirmation")
    public WebElement PasswordConfirmationInput;

  @FindBy(css="button[tabindex='0']")
    public WebElement RegisterBtn;




}
