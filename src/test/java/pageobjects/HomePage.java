package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class HomePage extends Base {

    @FindBy(css = "h1")
    private WebElement header;


    public HomePage(WebDriver driver) {
        super(driver);
        visit("/");
    }

    public String getHeader(){
        return header.getText();
    }
}
