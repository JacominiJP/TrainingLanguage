Algoritmo "par_impar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/03/2026
Var
   i, Num1, Num2, parImpar:inteiro


Inicio

       escreva("Digite a Quantidade De Números Quer queira escrever: ")
       leia(Num1)
       
       para i de 1 até Num1 faca
           escreval("Digite Um Número:")
           leia(Num2)
              parImpar <- Num2%2
              
           se (parImpar <> 0) e (Num2 < 0) entao
            escreval("IMPAR NEGATIVO")
            senao
             se (parImpar <> 0) e (Num2 > 0) entao
              escreval("IMPAR POSITIVO")
              senao
               se (parImpar = 0) e (Num2 < 0) entao
                escreval("PAR NEGATIVO")
                senao
                 se (parImpar = 0) e (Num2 > 0) entao
                  escreval("PAR POSITIVO")
                  senao
                   escreval("NULO")
                 fimse
               fimse
             fimse
           fimse
                   
                   
       fimpara

Fimalgoritmo