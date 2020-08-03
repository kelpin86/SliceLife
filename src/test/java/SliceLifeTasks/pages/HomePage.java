package SliceLifeTasks.pages;


import SliceLifeTasks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(css = "span[data-show='true']")
    public WebElement SignIn ;


}
