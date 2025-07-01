package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static utils.utils.clicarElemento;


public class UtilsPage {

    protected static WebDriver driver;

    public UtilsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static HomePage hp = new HomePage(driver);
    public static UtilsPage up = new UtilsPage(driver);


    static boolean isMockEnabled = System.getenv("USE_MOCK") != null && System.getenv("USE_MOCK").equalsIgnoreCase("true");


    @FindBy(xpath = "//input[@name='username']")
    public static WebElement campoUsuario;

    @FindBy(xpath = "//input[@name='password']")
    public static WebElement campoSenha;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement btnLogin;

    @FindBy(xpath = "(//span[contains(.,'Admin')])[1]")
    public static WebElement menuAdmin;

    @FindBy(xpath = "//button[contains(.,'Add')]")
    public static WebElement btnAdd;


    public static void preencherUsuario() {
        campoUsuario.sendKeys("Admin");
    }

    public static void preencherSenha() {

        campoSenha.sendKeys("admin123");
    }

    public static void clicarLogin() {

        btnLogin.click();
    }

    public static void clicarMenuAdmin (){
        menuAdmin.click();
    }
    public static void clicarAdd (){
        btnAdd.click();
    }

    public static void validarPaginaInicial() {
        assertTrue(menuAdmin.isDisplayed());
    }

    public static void preencherCampo(String campo) {
        switch (campo) {

            case "Usuario":

                break;

            case "1":

                break;

            case "2":

                break;

            case "3":

                break;


            default:
                System.out.println("Campo não encontrado");

        }


    }


}











