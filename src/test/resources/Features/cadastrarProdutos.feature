#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Cadastrar usuário

  Contexto:
    Dado que esteja na tela inicial do Serverest
    Quando clicar no botao "Cadastrar Login"
    E preencher o campo "Digite Seu Nome"
    E preencher o campo "Digite Seu Email"
    E preencher o campo "Digite Sua Senha"
    E clicar no botao "Cadastrar Como Administrador"
    E clicar no botao "Cadastrar Usuario"


  @cadastrarProduto
  Cenario: Cadastrar Produto
    Quando clicar no botao "Cadastrar Produto"
    E preencher o campo "Nome do Produto"
    E preencher o campo "Preço"
    E preencher o campo "Descriçao"
    E preencher o campo "Quantidade"
    E realizar o anexo do arquivo "Escolher Arquivo"
    E clicar no botao "Cadastrar"
    Entao apresentar a mensagem lista dos Produtos