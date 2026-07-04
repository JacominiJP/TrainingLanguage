Algoritmo "aprovados"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/05/2026
Var
   Alunos: vetor[0..9] de caractere
   pSemestre: vetor[0..9] de real
   sSemestre: vetor[0..9] de real
   mediaSemestre: vetor[0..9] de real
   i, Num: inteiro
   media: real

Inicio

      escreva("Quantos Alunos Serão Selecionados?: ")
      leia(Num)
      
      para i de 0 ate (Num - 1) faca
      
           escreval("Digite o nome, a primeira e a segunda nota do ",i+1,"a aluno")
           leia(Alunos[i])
           leia(pSemestre[i])
           leia(sSemestre[i])
      
      fimpara
      
      para i de 0 ate (Num - 1) faca
      
           media <- (pSemestre[i] + sSemestre[i])/2
           mediaSemestre[i] <- media
           
      fimpara
      
      
      escreval("Alunos Aprovados:")
      para i de 0 ate (Num - 1) faca
      
           se mediaSemestre[i] > 6 entao
              escreval(Alunos[i])
           
           fimse
      
      fimpara


Fimalgoritmo