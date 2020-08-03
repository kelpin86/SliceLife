package SliceLifeTasks.tests;

import SliceLifeTasks.pages.HomePage;
import SliceLifeTasks.pages.RegisterPage;
import SliceLifeTasks.utilities.TestBase;
import org.testng.annotations.Test;

public class registration extends TestBase {

    @Test
    public void RegisterApplication() {
        //Go to home page and click the signIn button
        HomePage homePage = new HomePage();
        homePage.SignIn.click();

        // Go to register page and click the Register button
        RegisterPage registerPage = new RegisterPage();
        registerPage.Register.click();

        // Register the application and click the Register(submit) button
        registerPage.FirstNameInput.sendKeys("Mustafa");
        registerPage.LastNameInput.sendKeys("Halil");
        registerPage.EmailInput.sendKeys("kelpin86@gmail.com");
        registerPage.PasswordInput.sendKeys("12345");
        registerPage.PasswordConfirmationInput.sendKeys("12345");
        registerPage.RegisterBtn.click();



    }
}