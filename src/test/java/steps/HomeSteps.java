package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.UtilsPage;


import static utils.utils.driver;

public class HomeSteps {

    HomePage hp = new HomePage(driver);
    UtilsPage up = new UtilsPage(driver);



    @Dado("que esteja na tela inicial do orangeHRM logado")
    public void queEstejaNaTelaInicialDoOrangeHRMLogado() {

    }

    @Dado("que esteja na tela inicial do Serverest logado")
    public void queEstejaNaTelaInicialDoServerestLogado() {
    }
}
