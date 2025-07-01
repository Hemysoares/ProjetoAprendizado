$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/loginServerest.feature");
formatter.feature({
  "name": "Login Serverest",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@end2End"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "que esteja na tela inicial do Serverest logado",
  "keyword": "Dado "
});
formatter.match({
  "location": "HomeSteps.queEstejaNaTelaInicialDoServerestLogado()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Teste Login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@end2End"
    },
    {
      "name": "@OK1"
    }
  ]
});
formatter.step({
  "name": "preencher o campo Email",
  "keyword": "Quando "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});