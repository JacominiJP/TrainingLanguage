Algoritmo "Crescente"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2026
Var
  valor1, valor2 : real


Inicio

      escreval("Digite Dois Valores: ")
      leia(valor1)
      leia(valor2)

          enquanto (valor1 <> valor2) faca
              se (valor1 < valor2) entao
               escreval("Crescente!")
                senao
                 escreval("Decrescente!")
              fimse
              escreval("Digite Outros Números:")
              leia(valor1)
              leia(valor2)
          fimenquanto

          escreva("IGUAIS!")




Fimalgoritmo