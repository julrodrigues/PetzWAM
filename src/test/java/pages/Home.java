package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1 - Mapeamento de Elementos
    @FindBy(id = "search")
    private WebElement txtinputSearch;

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;

    // 2 - Construtor
    public Home(WebDriver driver) {
        super(driver);
    }

    // 3 - Ações dos Elementos

    public void search(String product){
        txtinputSearch.click(); // Clicar na caixa de pesquisa
        txtinputSearch.clear(); // Limpar o conteúdo da caixa de pesquisa
        txtinputSearch.sendKeys(product); // Escreve na caida de pesquisa
    }

    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click(); // Clica no botão da Lupa
    }

    public void searchWithEnter(String product){
        search(product);
        txtinputSearch.sendKeys(Keys.ENTER);
    }

}
