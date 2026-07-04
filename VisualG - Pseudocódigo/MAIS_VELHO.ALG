Algoritmo "mais_velho"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/05/2026
Var
 vetName: vetor[0..9] de caractere
 vetAge: vetor[0..9] de inteiro
 i, Num, maiorIdade, Idade: inteiro
 maisVelho, Nome:caractere

Inicio

      escreva("Quantos Elementos deseja digitar?: ")
      leia(Num)
      
      para i de 0 ate (Num - 1) faca
      
           escreval("Nome: ")
           leia(Nome)
           escreval("Idade: ")
           leia(Idade)
           
           vetName[i] <- Nome
           vetAge[i] <- Idade
           
      fimpara
      
      maiorIdade <- 0
      para i de 0 ate (Num - 1) faca
      
           se vetAge[i] > maiorIdade entao
              maioridade <- vetAge[i]
              maisVelho <- vetName[i]
           fimse
      
      fimpara
      
      escreva("Pessoa mais Velha é a/o ",maisVelho)

Fimalgoritmo