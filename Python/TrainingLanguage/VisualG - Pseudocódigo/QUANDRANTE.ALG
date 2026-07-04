Algoritmo "Quandrante"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2026
Var
   CoorX, CoorY :inteiro


Inicio

      repita
       escreval("Digite as Coordenadas X e Y:")
       escreva("X: ")
       leia(CoorX)
       escreva("Y: ")
       leia(CoorY)
       
       se (CoorX > 0) e (CoorY > 0) entao
        escreval("Pertence ao Q1")
         senao
          se (CoorX > 0) e (CoorY < 0) entao
           escreval ("Pertence ao Q4")
            senao
             se (CoorX < 0) e (CoorY < 0) entao
              escreval("Pertence ao Q3")
               senao
                se (CoorX < 0) e (CoorY > 0) entao
                 escreval("Pertence ao Q2")
                fimse
             fimse
          fimse
       fimse

      
      ate (CoorX = 0) ou (CoorY = 0)


Fimalgoritmo