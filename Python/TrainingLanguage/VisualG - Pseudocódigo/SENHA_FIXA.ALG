Algoritmo "senha_fixa"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2026
Var
    senhaReal, senhaTentadas: inteiro



Inicio

//Teste com a Estrutura "Repita-ate"
       senhaReal <- 2002
       escreva("Digite A Senha: ")
       leia(senhaTentadas)
       
       se senhaTentadas = senhaReal entao
          escreva("Acesso Liberado")
          senao
               repita
                escreva("Digite Novamente: ")
                leia(senhaTentadas)
               ate senhaTentadas = senhaReal
               
               escreva("Acesso Liberado")
       fimse
       
       //Pode se Utilizar a Estrutura "Enquanto"


Fimalgoritmo