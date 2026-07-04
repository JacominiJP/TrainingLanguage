Algoritmo "alturas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/04/2026
Var
  nPessoas, i, menor16, topo:inteiro
  somaAltura, Media, porcentagemMenores:real
  Name: vetor[0..99] de caractere
  Menores: vetor[0..99] de caractere
  Idade: vetor[0..99] de inteiro
  Altura: vetor[0..99] de real

Inicio

      escreva("Quantas Pessoas Serão Escritas?: ")
      leia(nPessoas)

      somaAltura <- 0
      para i de 0 ate (nPessoas-1) faca
           escreval("Dado da ",(i+1),"a pessoa")
           escreva("Nome: ")
           leia(Name[i])
           escreval("")
           escreva("Idade: ")
           leia(Idade[i])
           escreval("")
           escreva("Altura: ")
           leia(Altura[i])
           somaAltura <- somaAltura + Altura[i]
       fimpara
       
         topo <- 0
         menor16 <- 0
       para i de 0 ate (nPessoas-1) faca
       
          se Idade[i] < 16 entao
             menor16 <- menor16 + 1
             Menores[topo] <- Name[i]
             topo <- topo + 1
          fimse
      fimpara
      
      Media <- somaAltura/nPessoas
      porcentagemMenores <- (menor16/nPessoas)*100
      escreval("A Altura média é de ",Media:1:2," metros")
      escreval("Pessoas com menos de 16 ",porcentagemMenores:1:1,"%")

      se (menor16 > 0) entao
         escreval("São eles: ")
         para i de 0 ate topo faca
              escreval(Menores[i])
         fimpara
      fimse
          
Fimalgoritmo