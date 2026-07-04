print("##### !VAMOS MONTAR UM PEQUENO LANCHE! #####")
print()
print("##### !PRIMEIRO O HAMBÚRGUER! #####")

#CÓDIGO DO PEDIDO
codPedido = []
def criacaoCod(tipoItem):
    if tipoItem == meuHamburguer:
        if valorHamburguer < 8:
            codPedido.append("BAR")
        elif valorHamburguer >= 8 and valorHamburguer < 12:
            codPedido.append("MED")
        else:
            codPedido.append("CAR")
    elif tipoItem == Bebidas:
        [dado] = minhaBebida
        if dado == "Suco Natural":
            codPedido.append("SN")
        elif dado == "Cerveja":
            codPedido.append("CJ")
        elif dado == "Refrigerante":
            codPedido.append("RF")
        elif dado == "Água":
            codPedido.append("AG")
        elif dado == "Creme":
            codPedido.append("CR")
    elif tipoItem == Sobremesa:
        [dado] = minhaSobremesa
        if dado == "Brownie":
            codPedido.append("BR")
        elif dado == "Sorvete":
            codPedido.append("SR")
        elif dado == "Petit Gateau":
            codPedido.append("PG")
        elif dado == "Açai":
            codPedido.append("AC")
        elif dado == "Pudim":
            codPedido.append("PD")
#-----------------

#Receita do Hamburguer
meuHamburguer = []
paes = [
    {"itens" : "Pão Brioche" , "preco" : 2.50},
    {"itens" : "Pão Australiano", "preco" : 3.00},
    {"itens": "Pão de Batata", "preco": 2.00},
    {"itens": "Pão Pretzel Bun", "preco": 4.50},
    {"itens": "Pão Francês", "preco": 0.80},
    ("PÃO")
]

Saladas = [
    {"itens": "Salada de Alface, Tomate, Cebola", "preco": 2.00},
    {"itens": "Salada de Batata c/Maionese", "preco": 3.50},
    {"itens": "Salada de Batata, Pepino e Cebola Roxa", "preco": 4.00},
    {"itens": "Salada de Repolho", "preco": 3.00},
    {"itens": "Sem Salada", "preco": 0.00},
    ("SALADA")
]

queijoHamburguer = [
    {"itens": "Queijo Cheddar", "preco": 1.20},
    {"itens": "Queijo Muçarela", "preco": 0.80},
    {"itens": "Queijo Gorgonzola", "preco": 2.50},
    {"itens": "Queijo Provolone", "preco": 1.80},
    {"itens": "Queijo de Leite de Amêndoas", "preco": 2.50},
    ("QUEIJO")
]

carneHamburguer = [
    {"itens": "Carne Picanha", "preco": 9.00},
    {"itens": "Carne Costela", "preco": 3.00},
    {"itens": "Carne Peito De Frango", "preco": 2.25},
    {"itens": "Carne Fraldinha", "preco": 5.70},
    {"itens": '"Carne Vegana" (Tofu)', "preco": 4.20},
    ("CARNE")
]

molhoHamburguer = [
    {"itens": "Molho Maionese", "preco": 0.50},
    {"itens": "Molho Ketchup", "preco": 0.40},
    {"itens": "Molho Barbecue", "preco": 0.50},
    {"itens": "Molho Verde", "preco": 0.80},
    {"itens": "Molho Cream Cheese Temperado", "preco": 2.00},
    ("MOLHO")
]

valorHamburguer = 0

def mostrar_menu(tipoItem):
    print(f"#ESCOLHA A(O) {tipoItem[5]}#")
    print(f"0 - {tipoItem[0]["itens"]} - R$ {tipoItem[0]['preco']:.2f}")
    print(f"1 - {tipoItem[1]["itens"]} - R$ {tipoItem[1]['preco']:.2f}")
    print(f"2 - {tipoItem[2]["itens"]} - R$ {tipoItem[2]['preco']:.2f}")
    print(f"3 - {tipoItem[3]["itens"]} - R$ {tipoItem[3]['preco']:.2f}")
    print(f"4 - {tipoItem[4]["itens"]} - R$ {tipoItem[4]['preco']:.2f}")

#-----------------------------#
#MONTANDO O HAMBÚRGUER#

#PÃO
mostrar_menu(paes)
escolher = ""
#Função para escolher os itens do dicionario nas matrizes
def montar_lanche(escolher, vetorLanche, tipoItem, valorLanche):
    while True:
        try:
            escolher = int(input("ESCOLHA:  "))
            while escolher < 0 or escolher > 4:
                mostrar_menu(tipoItem)
                escolher = int(input("Opção Não reconhecida! Tente Novamente:  "))
            break

        except ValueError:
            mostrar_menu(tipoItem)
            print("Só Aceita Números, Tente Novamente!")

    match escolher:
        case 0:
            vetorLanche.append(tipoItem[0]["itens"])
            valorLanche += tipoItem[0]["preco"]
        case 1:
            vetorLanche.append(tipoItem[1]["itens"])
            valorLanche += tipoItem[1]["preco"]
        case 2:
            vetorLanche.append(tipoItem[2]["itens"])
            valorLanche += tipoItem[2]["preco"]
        case 3:
            vetorLanche.append(tipoItem[3]["itens"])
            valorLanche += tipoItem[3]["preco"]
        case 4:
            vetorLanche.append(tipoItem[4]["itens"])
            valorLanche += tipoItem[4]["preco"]
    return valorLanche
#-----------------------#
valorHamburguer = montar_lanche(escolher, meuHamburguer, paes, valorHamburguer)
#----------------------#
#SALADA
mostrar_menu(Saladas)

valorHamburguer = montar_lanche(escolher, meuHamburguer, Saladas, valorHamburguer)
#---------#

#QUEIJO
mostrar_menu(queijoHamburguer)

valorHamburguer = montar_lanche(escolher, meuHamburguer, queijoHamburguer, valorHamburguer)
#-----------#

#CARNE
mostrar_menu(carneHamburguer)

valorHamburguer = montar_lanche(escolher, meuHamburguer, carneHamburguer, valorHamburguer)
#--------#

#MOLHO
aceitarMolho = input("Aceita Molho? S/N: ")
while True :
    if aceitarMolho == "N" :
        print("OK! Sem Molho")
        break
    elif aceitarMolho == "S" :
        mostrar_menu(molhoHamburguer)

        valorHamburguer = montar_lanche(escolher, meuHamburguer, molhoHamburguer, valorHamburguer)
        break
    else:
        aceitarMolho = input("Opção Inválida, Digite Corretamente | Aceitar Molho? S/N:  ")

criacaoCod(meuHamburguer)
#----------------

#SELEÇÃO DE BEBIDAS#
Bebidas = [
    {"itens": "Suco Natural", "preco": 8.00},
    {"itens": "Cerveja", "preco": 10.00},
    {"itens": "Refrigerante", "preco": 5.00},
    {"itens": "Água", "preco": 3.00},
    {"itens": "Creme", "preco": 12.00},
    ("BEBIDA")
]

minhaBebida = []
valorBebida = 0
#--------------------

#BEBIDAS
mostrar_menu(Bebidas)

valorBebida = montar_lanche(escolher, minhaBebida, Bebidas, valorBebida)
criacaoCod(Bebidas)
#-------------

#SELEÇÃO SOBREMESA
Sobremesa = [
    {"itens": "Brownie", "preco": 10.00},
    {"itens": "Sorvete", "preco": 5.00},
    {"itens": "Petit Gateau", "preco": 18.00},
    {"itens": "Açai", "preco": 12.00},
    {"itens": "Pudim", "preco": 6.00},
    ("SOBREMESA")
]

valorSobremesa = 0
minhaSobremesa = []
#-----------------------

#SOBREMESA
mostrar_menu(Sobremesa)

valorSobremesa = montar_lanche(escolher, minhaSobremesa, Sobremesa, valorSobremesa)
criacaoCod(Sobremesa)
#----------

#Nota Fiscal
contaPagar = 0
def caixa(valorTotal):
    valorTotal = valorHamburguer + valorSobremesa + valorBebida
    return valorTotal

contaPagar = caixa(contaPagar)
print("#################################### PEDIDO FINALIZADO ####################################")
print(f"CÓDIGO DO PEDIDO {codPedido}")
print(f"VALOR POR ITEM: ")
print(f"HAMBÚRGUER: R$ {valorHamburguer:.2f}")
print(f"BEBIDA: R$ {valorBebida:.2f}")
print(f"SOBREMESA: R$ {valorSobremesa:.2f}")
print(f"VALOR TOTAL DO PEDIDO R$ {contaPagar:.2f}")
print("\n # COMO FICOU SEU LANCHE: #")
print("VOCÊ ESCOLHEU OS SEGUINTES ITENS PARA SEU HAMBÚRGUER:")
print(meuHamburguer)
print("PARA BEBER VOCÊ QUIS  UM(A): ")
print(minhaBebida)
print("E DE SOBREMESSA VOCÊ PEDIU UM(A): ")
print(minhaSobremesa)
#-------------