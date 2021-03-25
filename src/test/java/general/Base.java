package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // objeto do Selenium WebDriver
    // ao usar PageFactory mudar de public para protected

    // criar um construtor e inicializar os elementos da Pagefactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
