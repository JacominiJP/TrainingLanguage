Algoritmo "dentro_fora"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/03/2026
Var
Num1,Num2,i, dentro, fora:inteiro


Inicio
       escreva("Escreva A Quantidade de Números que Deseja Digitar: ")
       leia(Num1)
       
       dentro <- 0
       fora <- 0
       
       para i de 1 até Num1 faca
       
        escreva("Digite seu número: ")
        leia(Num2)
        
        se (Num2 > 10) e (Num2 < 20) entao
         dentro <- dentro + 1
         senao
          fora <- fora + 1
        fimse
        
       fimpara
       
       escreval(dentro," DENTRO")
       escreva(fora," FORA")



Fimalgoritmo