#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Login Serverest

  Contexto:
    Dado que esteja na tela inicial do Serverest logado
    Quando preencher o campo Email
    E ao preencher o campo Senha
    E clicar no botão Entrar

#  @OK1
#  Cenario: Validar mensagem bem vindo
#    Então apresenta mensagem Bem Vindo

  @ok
  Cenario: Cadatra usuário
    Quando clicar no botão cadastrar
    E ao preencher o campo nome
    E ao preencher o campo Email
    E preencha o campo senha
    E selecione a opção Cadastrar como Adm
    E clicar em Cadastrar
    Então apresenta a mensagem Lista dos Usuarios

  @Ok2
  Cenario: Editar usuário
    Quando clicar no botao "Listar Usuarios"
    E clicar no botao "Editar"

  @Ok3
  Cenario: Cadastrar Produto
    Quando clicar no botao "Cadastrar Produto"
    E preencher o campo "Nome do Produto"
    E preencher o campo "Preço"
    E preencher o campo "Descriçao"
    E preencher o campo "Quantidade"
    E realizar o anexo do arquivo "Escolher Arquivo"
    E clicar no botao "Cadastrar"
    Entao apresentar a mensagem lista dos Produtos


