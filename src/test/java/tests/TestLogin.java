package tests;

import org.junit.Before;
import org.junit.Test;
import pageobjects.HomePage;

import static org.junit.Assert.assertEquals;

public class TestLogin extends Base {

    private HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage(driver);
    }

    @Test
    public void whenPageDisplayed_thanHeaderShouldBeVisible() {
        homePage.getHeader();
        assertEquals("Example Headline 1", homePage.getHeader());
    }

}
