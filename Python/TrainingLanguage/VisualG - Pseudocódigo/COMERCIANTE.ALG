Algoritmo "comerciante"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/05/2026
Var
Num, i:inteiro
Produtos: vetor[0..9] de caractere
Custo: vetor[0..9] de real
Venda: vetor[0..9] de real
somaCusto, somaVenda, lucro, menor10, maior20, entre1020, Percentual: real


Inicio
      escreva("Quantos Produtos Deseja Colocar?:  ")
      leia(Num)
      
      para i de 0 ate Num-1 faca
           escreval("Produto ",i+1,":")
           escreva("Nome:  ")
           leia(Produtos[i])
           escreva("Custo:  ")
           leia(Custo[i])
           escreva("Venda:  ")
           leia(Venda[i])
      fimpara
      
      
      menor10 <- 0
      entre1020 <- 0
      maior20 <- 0
      para i de 0 ate Num-1 faca
           Percentual <- Venda[i]/Custo[i]
           se Percentual < 1.10 entao
              menor10 <- menor10 + 1
              senao
               se Percentual <= 20 entao
                  entre1020 <- entre1020 + 1
                  senao
                   maior20 <- maior20 + 1
               fimse
           fimse
      fimpara
      
      somaCusto <- 0
      somaVenda <- 0
      para i de 0 ate Num-1 faca
           somaCusto <- somaCusto + Custo[i]
           somaVenda <- somaVenda + Venda[i]
           lucro <- somaVenda - somaCusto
      fimpara
      
      escreval("RELATÓRIO:")
      escreval("Lucro abaixo de 10%: ",menor10)
      escreval("Lucro entre 10% e 20%: ",entre1020)
      escreval("Lucro maior de 10%: ",maior20)
      escreval("Valor do Custo das Mercadorias: R$ ",somaCusto:3:2)
      escreval("Valor de Venda das Mercadorias: R$ ",somaVenda:3:2)
      escrevaL("Lucro: R$ ",lucro:3:2)

Fimalgoritmo