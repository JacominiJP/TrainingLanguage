Algoritmo "soma_vetores"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/05/2026
Var
   vetA: vetor[0..9] de inteiro
   vetB: vetor[0..9] de inteiro
   vetC: vetor[0..9] de inteiro
   valorVet, Num, i:inteiro
   
Inicio

      escreva("Quantos Números Cabera nos seus Vetores?")
      leia(Num)
      
      escreval("Preencha O Vetor A:")
      para i de 0 ate (Num - 1) faca
      
           leia(valorVet)
           vetA[i] <- valorVet
      
      fimpara
      
      escreval("Preencha O Vetor B:")
      para i de 0 ate (Num - 1) faca

           leia(valorVet)
           vetB[i] <- valorVet

      fimpara
      
      escreval("Valores Resultantes: ")
      para i de 0 ate (Num - 1) faca

           vetC[i] <- (vetA[i] + vetB[i])
           escreval(vetC[i])
      fimpara


Fimalgoritmo