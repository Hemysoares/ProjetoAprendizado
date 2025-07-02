#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Cadastrar Novos Usuários

  Contexto:
    Dado que esteja na tela inicial do Serverest
    Quando clicar no botao "Cadastrar Login"
    E preencher o campo "Digite Seu Nome"
    E preencher o campo "Digite Seu Email"
    E preencher o campo "Digite Sua Senha"
    E clicar no botao "Cadastrar Como Administrador"
    E clicar no botao "Cadastrar Usuario"

  @cadastrarNovosUsuarios
  Cenario: Cadastrar Novos Usuários
    Quando clicar no botão cadastrar
    E ao preencher o campo nome
    E ao preencher o campo Email
    E preencha o campo senha
    E selecione a opção Cadastrar como Adm
    E clicar em Cadastrar
    Então apresenta a mensagem Lista dos Usuarios