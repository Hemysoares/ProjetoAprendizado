package steps;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ServerestPage;

import static org.junit.Assert.assertTrue;
import static utils.utils.driver;

public class ServerestSteps {

    ServerestPage sp = new ServerestPage(driver);

    @Quando("preencher o campo Email")
    public void preencher_o_campo_Email() {
        sp.preencherEmail();
    }

    @E("ao preencher o campo Senha")
    public void aoPreencherOCampoSenha() {
        sp.aoPreencherOCampoSenha();
    }

    @E("clicar no botão Entrar")
    public void clicarNoBotãoEntrar() {
        sp.clicarNoBotãoEntrar();

    }


    @Então("apresenta mensagem Bem Vindo")
    public void apresentaMensagemBemVindo() {
        sp.apresentaMensagemBemVindo();


    }

    @Quando("clicar no botão cadastrar")
    public void clicarNoBotãoCadastrar() {
        sp.clicarNoBotãoCadastrar();
    }

    @E("ao preencher o campo nome")
    public void aoPreencherOCampoNome() {
        sp.aoPreencherOCampoNome();

    }

    @E("ao preencher o campo Email")
    public void aoPreencherOCampoEmail() {
        sp.aoPreencherOCampoEmail();
    }

    @E("preencha o campo senha")
    public void preenchaOCampoSenha() {
        sp.preenchaOCampoSenha();

    }

    @E("selecione a opção Cadastrar como Adm")
    public void selecioneAOpçãoCadastrarComoAdm() {
        sp.selecioneAOpçãoCadastrarComoAdm();
    }

    @Então("clicar em Cadastrar")
    public void clicarEmCadastrar() {
        sp.clicarEmCadastrar();
    }

    @Então("apresenta a mensagem Lista dos Usuarios")
    public void apresentaAMensagemListaDosUsuarios() {
        sp.apresentaAMensagemListaDosUsuarios();
    }

    @Quando("clicar no botao {string}")
    public void clicarNoBotao(String botao) throws InterruptedException {
        sp.clicarNoBotao(botao);
    }

    @Quando("preencher o campo {string}")
    public void preencherOCampo(String campo) {
        sp.preencherCampo(campo);
    }


    @E("realizar o anexo do arquivo {string}")
    public void realizarOAnexoDoArquivo(String arquivo) {
        sp.anexarArquivo(arquivo);
    }

    @Entao("apresentar a mensagem lista dos Produtos")
    public void apresentarAMensagemListaDosProdutos() {
        sp.apresentarAMensagemListaDosProdutos9();
    }

    @Entao("apresentar mensagem Bem de Vindo")
    public void apresentarMensagemBemDeVindo() {
        sp.apresentarMensagemBemDeVindo();
    }

    @Dado("que esteja na tela inicial do Serverest")
    public void queEstejaNaTelaInicialDoServerest() {
    }
}

