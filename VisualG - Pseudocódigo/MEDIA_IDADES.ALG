Algoritmo "media_idades"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2026
Var
    idades, somaid, rep : inteiro
    media : real


Inicio

 rep <- 0
 somaid <- 0


           escreval("Digite as Idades: ")
           leia(idades)
           
           se idades >= 0 entao
           
            enquanto idades >= 0 faca
              rep <- rep + 1
              somaid <- somaid + idades
              leia(idades)
            fimenquanto
            
            media <- somaid/rep
            escreva("Media das Idades = ",media:4:2)
            
             senao
              escreva("Impossível Calcular")
           fimse
            
Fimalgoritmo