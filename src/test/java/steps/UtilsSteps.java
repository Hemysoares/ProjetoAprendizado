package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.UtilsPage;


import static pages.UtilsPage.*;
import static utils.utils.driver;

public class UtilsSteps {

    HomePage hp = new HomePage(driver);
    UtilsPage up = new UtilsPage(driver);

    @Quando("preencher o campo Usuario")
    public void preencher_o_campo_Usuario() {
        preencherUsuario();
    }

    @E("preencher o campo Senha")
    public void preencherOCampoSenha() {
        preencherSenha();
    }

    @E("clicar no botão Login")
    public void clicarNoBotãoLogin() {
        clicarLogin();
    }

    @Entao("devera validar pagina inicial")
    public void deveraValidarPaginaInicial() {

        validarPaginaInicial();
    }



    @E("clicar no botão Admin")
    public void clicarNoBotãoAdmin() {
        clicarMenuAdmin();

    }

    @E("clicar no botão Add")
    public void clicarNoBotãoAdd() {
        clicarAdd();
    }
}
