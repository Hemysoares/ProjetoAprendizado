#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Login Serverest

  Contexto:
    Dado que esteja na tela inicial do Serverest

  @OK1
  Cenario: Login com usuario cadastrado
    Quando preencher o campo Email
    E ao preencher o campo Senha
    E clicar no botão Entrar
    Então apresenta mensagem Bem Vindo
