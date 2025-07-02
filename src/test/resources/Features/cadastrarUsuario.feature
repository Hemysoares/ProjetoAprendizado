#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Cadastrar usuário

  Contexto:
    Dado que esteja na tela inicial do Serverest


  @cadastrarUsuario
  Cenario: Cadastrar usuário para realizar login
    Quando clicar no botao "Cadastrar Login"
    E preencher o campo "Digite Seu Nome"
    E preencher o campo "Digite Seu Email"
    E preencher o campo "Digite Sua Senha"
    E clicar no botao "Cadastrar Como Administrador"
    E clicar no botao "Cadastrar Usuario"
    Entao apresentar mensagem Bem de Vindo