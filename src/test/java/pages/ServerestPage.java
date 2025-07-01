package pages;

import cucumber.api.java.sl.In;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import utils.utils;


import java.io.File;

import static org.junit.Assert.assertTrue;
import static utils.utils.clicarElemento;

public class ServerestPage {
    protected static WebDriver driver;

    public ServerestPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    static String gerarNome5 = utils.gerarNome(5);

    @FindBy(xpath = "//input[@name='email']")
    public static WebElement campoEmail;

    @FindBy(xpath = "//input[ @name= 'password']")
    public static WebElement campoSenha;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement btnEntrar;

    @FindBy(xpath = "//h1[text()='Bem Vindo  ']")
    public static WebElement mensagemBemVindo;

    @FindBy(xpath = "//a[@data-testid='cadastrarUsuarios']")
    public static WebElement btnCadastrar;

    @FindBy(xpath = "//input[@name='nome']")
    public static WebElement campoNome;

    @FindBy(xpath = "//input[@Type='email']")
    public static WebElement campoCadastrarEmail;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement campoCadastrarSenha;

    @FindBy(xpath = "//input[@id='administrador']")
    public static WebElement btnAdm;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement btnCadastrarUsuario;

    @FindBy(xpath = "//div[@id='root']//h1")
    public static WebElement mensagemValidarCadastro;

    @FindBy(xpath = "//a[@data-testid='listarUsuarios']")
    public static WebElement btnNovoLu;

    @FindBy(xpath = "//table/tbody/tr[1]/td[5]//button[1]")
    public static WebElement btnNovoEditar;

    @FindBy(xpath = "//a[@data-testid='cadastrarProdutos']")
    public static WebElement btnNovoCadastrarProduto;

    @FindBy(xpath = "//input[@data-testid='nome']")
    public static WebElement campoNomeDoProduto;

    @FindBy(xpath = "//input[@id='price']")
    public static WebElement campoPreço;

    @FindBy(xpath = "//*[@id='description']")
    public static WebElement campoDescriçao;

    @FindBy(xpath = "//*[@id='quantity']")
    public static WebElement campoQuantidade;

    @FindBy(xpath = "//*[@id='imagem']")
    public static WebElement btnNovoEscolherArquivo;

    @FindBy (xpath = "//button[@type='submit']")
    public static WebElement btnNovoCadastrar;

    @FindBy (xpath = "//*[@id='root']/div/div/h1")
    public static WebElement apresentarAMensagemListaDosProdutos9;




    public static void preencherEmail() {
        campoEmail.sendKeys("hemyllin21@gmail.com");
    }

    public static void aoPreencherOCampoSenha() {
        campoSenha.sendKeys("teste123");
    }

    public static void clicarNoBotãoEntrar() {
        btnEntrar.click();
    }

    public static void apresentaMensagemBemVindo() {
        assertTrue(mensagemBemVindo.isDisplayed());
    }

    public static void clicarNoBotãoCadastrar() {
        btnCadastrar.click();

    }

    public static void aoPreencherOCampoNome() {
        campoNome.sendKeys("Jeferson");
    }

    public static void aoPreencherOCampoEmail() {
        campoCadastrarEmail.sendKeys(gerarNome5 + "@gmail.com");
        System.out.println(gerarNome5);
    }

    public static void preenchaOCampoSenha() {
        campoCadastrarSenha.sendKeys("teste123");
    }

    public static void selecioneAOpçãoCadastrarComoAdm() {
        btnAdm.click();
    }

    public static void clicarEmCadastrar() {
        btnCadastrarUsuario.click();
    }

    public static void apresentaAMensagemListaDosUsuarios() {
        assertTrue(mensagemValidarCadastro.isDisplayed());
    }

    public static void apresentarAMensagemListaDosProdutos9(){
        assertTrue(apresentarAMensagemListaDosProdutos9.isDisplayed());
    }

    public static void clicarNoBotao(String botao) {
        switch (botao) {

            case "Listar Usuarios":
                clicarElemento(btnNovoLu);
                break;

            case "Editar":
                clicarElemento(btnNovoEditar);
                break;

            case "Cadastrar Produto":
                clicarElemento(btnNovoCadastrarProduto);
                break;

            case "Escolher Arquivo":
                clicarElemento(btnNovoEscolherArquivo);
                break;

            case "Cadastrar":
                clicarElemento(btnNovoCadastrar);
                break;

            default:
                System.out.println("botao nao mapeado");

        }

    }

    public static void preencherCampo(String campo) {
        switch (campo) {


            case "Nome do Produto":
                campoNomeDoProduto.sendKeys("Produto " + gerarNome5);
                break;

            case "Preço":
                campoPreço.sendKeys("10,00");
                break;

            case "Descriçao":
                campoDescriçao.sendKeys("Produto para Limpeza de escritório.");
                break;

            case "Quantidade":
                campoQuantidade.sendKeys("1");
                break;



            default:
                System.out.println("botao nao mapeado");

        }

    }

    public static void anexarArquivo(String arquivo) {
        String JPG = "arquivos/limpeza.jpg";
        File file = new File(JPG);
        String caminhoAbsolutoJPG = file.getAbsolutePath();

        switch (arquivo) {

            case "Escolher Arquivo":
                btnNovoEscolherArquivo.sendKeys(caminhoAbsolutoJPG);
                break;

            default:
                System.out.println("Campo nao encontrado");
        }
    }


}

