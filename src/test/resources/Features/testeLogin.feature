#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Login

  Contexto:
    Dado que esteja na tela inicial do orangeHRM logado

  @OK
  Cenario: Teste Login
    Quando preencher o campo Usuario
    E preencher o campo Senha
    E clicar no botão Login
    Entao devera validar pagina inicial


  @testeAtual
  Cenario: Acessar Menu admin
    Quando preencher o campo Usuario
    E preencher o campo Senha
    E clicar no botão Login
    E clicar no botão Admin
    E clicar no botão Add



