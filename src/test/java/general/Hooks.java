package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
    private Base base; // objeto local para a comunicação com o objeto da Classe extendida

    // Construtor para a classe Base (Botão esquerdo / Generate / Constructor)
    public Hooks(Base base) {
        this.base = base;
    }

    // Before
    @Before
    public void setup(){
        // Onde está o driver do browser
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/89/chromedriver.exe");

        // Instanciar o driver do Chrome
        base.driver = new ChromeDriver();

        // Maximizar Tela
        base.driver.manage().window().maximize();

        // Definir a espea implicita do Selenium WebDriver para 1 minuto
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

    }

    // After
    @After
    public void tearDown(){
        base.driver.quit();
    }

}
