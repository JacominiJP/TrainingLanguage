#Última Atualização: 11/10/2026
#Projeto Game MineJackPot V0.1
import random
from collections import Counter
# Variáveis
inventory = Counter()
newItens = []
money = 100000
caseRoll = 0

# Função para Criar Tuplas dos Itens das caixas
def lootCases(*itens):
    return itens
# CAIXAS:
commun_case = lootCases('Espada de Madeira',
                        'Picareta de Pedra',
                        'Armadura de Couro',
                        'Poção de Vida - LvL 1',
                        'Espada de Cobre',
                        'Armadura de Cobre',
                        'Espada  de Ferro')
rateCommun = [25, 25, 25, 20, 3, 1.5, 0.5]
# -------------------------
rare_case = lootCases('Espada de Pedra',
                      'Picareta de Cobre',
                      'Armadura de Malha',
                      'Poção de Vida - LvL 2',
                      'Arco',
                      'Flecha',
                      'Picareta de Ferro',
                      'Armadura de Diamante')
rateRare = [20, 20, 20, 20, 6, 6, 6, 2]

# Função Para Dropar Itens
def dropCases(nameCase, rate, typeCase, caseRoll, valueCase, money):
    print(f'Você ira realizar {caseRoll} giro(s) na Caixa {nameCase}')
    newMoney = money - caseRoll*valueCase
    drop = random.choices(
        typeCase,
        weights=rate,
        k=caseRoll)
    dropCounter = Counter(drop) #Conta quantos itens gerou no drop de forma organizada
    print('Saldo Atual: ', money,' Coins')
    for item, qtd in dropCounter.items(): #Organização dos itens
        print('----------------------------')
        print(f'{qtd}x - {item}')
    print('----------------------------\n'
          f'Seu saldo atual é de: {newMoney}')
    return newMoney, dropCounter


# Função do Menu
def showMenu(money):
    print('Escolha as Seguintes Opções: ')
    print('1 - Rodar Caixa\n'
          '2 - Coletar Dinheiro\n'
          '3 - Ver Inventário\n'
          '0 - Sair\n'
          f'Saldo do Player: {money} coins')
    n = int(input('Escolha uma opção: '))
    return n

# Função para Verificar o Dinheiro do Player
def verificationMoney(valueCase, nameCase, money, caseRoll, rate, typeCase):
    if money >= valueCase:
        caseRoll = int(input(f'Quantas giros na Caixa {nameCase} deseja realizar ({valueCase} Coins/Uni)?\n'
                             f'saldo atual: {money}: '))
        if (valueCase * caseRoll) > money:
            print(f'Saldo Insuficiente, faltam {valueCase * caseRoll - money} coins '
                  f'para rodar essa quatia ')
        else:
            newMoney, itensForInventory = dropCases(nameCase, rate, typeCase, caseRoll, valueCase, money)
    else:
        print(f'Você não possui saldo para rodar essa quantia, seu saldo: {money}')
    return newMoney, itensForInventory #Retorno para novo saldo e novos itens no inventário
# Principal
while True:
    choice = showMenu(money)
    match choice:
        case 1:
            print('Qual Caixa deseja Rodar: ')
            print('1 - Caixa Commun -> 10 Coins\n'
                  '2 - Caixa Rara -> 25 Coins\n'
                  '0 - Voltar')
            choice = int(input('Escolha uma opção: '))
            if choice == 1:
                money, newItens = verificationMoney(10, 'Commun', money, caseRoll, rateCommun, commun_case)
                inventory.update(newItens) #Atualização do Inventário
                newItens.clear() #Limpeza da Variávem de novos itens para evitar updates repetidos
            elif choice == 2:
                money, newItens = verificationMoney(25, 'Rare', money, caseRoll, rateRare, rare_case)
                inventory.update(newItens)
                newItens.clear()
            elif choice == 0:
                pass
        case 2:
            # Mina
            minerios = [
                # 25 Comuns
                'Pedra', 'Carvão', 'Cobre', 'Estanho', 'Ferro',
                'Calcário', 'Granito', 'Arenito', 'Quartzo', 'Sal-Gema',
                'Argila', 'Enxofre', 'Sílex', 'Mármore', 'Giz',
                'Basalto', 'Gipsita', 'Mica', 'Feldspato', 'Dolomita',
                'Hematita', 'Magnetita', 'Pirita', 'Fluorita', 'Talco',

                # 15 Raros
                'Prata', 'Ouro', 'Platina', 'Cobalto', 'Níquel',
                'Titânio', 'Tungstênio', 'Cromo', 'Paládio', 'Lítio',
                'Ametista', 'Topázio', 'Opala', 'Granada', 'Turmalina',

                # 6 Épicos
                'Diamante', 'Esmeralda', 'Rubi', 'Safira', 'Adamantita',
                'Minério de Mithril',

                # 3 Lendários
                'Oricalco', 'Cristal Solar', 'Minério de Dragão',

                # 1 Misterioso
                'Minério do Vazio'
            ]
            rateMinerios = [
                # 25 Comuns
                20, 20, 18, 18, 16,
                16, 16, 16, 15, 15,
                15, 14, 14, 14, 14,
                13, 13, 13, 13, 12,
                12, 12, 11, 11, 10,

                # 15 Raros
                8, 7, 6, 6, 6,
                5, 5, 5, 4, 4,
                4, 4, 3, 3, 3,

                # 6 Épicos
                2, 2, 1.8, 1.8, 1.5,
                1.5,

                # 3 Lendários
                0.8, 0.6, 0.4,

                # 1 Misterioso
                0.1
            ]
            print('------------------------------')
            print('Mina para conseguir dinheiro')
            print('1 - Minerar\n'
                  '0 - Voltar')
            choice = int(input('Escolha: '))
            print('------------------------------')
            while choice != 0:
                mina = random.choices(
                    minerios,
                    weights=rateMinerios,
                    k=1
                )[0]
                numMinerio = minerios.index(mina)
                print(f'Você coloteu o minério de: {mina}')
                #Valores de Coins para cada raridade de Minério
                if numMinerio < 25:
                    print('Mais 1 coin')
                    money += 1
                elif numMinerio < 40:
                    print('Mais 2 coins')
                    money += 2
                elif numMinerio < 46:
                    print('Mais 3 coins')
                    money += 3
                elif numMinerio < 49:
                    print('Mais 4 coins')
                    money += 4
                else:
                    print('Mais 5 coins')
                    money += 5
                print(f'Seu novo saldo é de {money} coins')
                choice = int(input('Deseja Minerar Novamente? 1(sim) e 0(não): '))
                print('------------------------------')
        case 3:
            print('#############################')
            print('Inventário do Jogador:')
            if inventory:
                for itens, qtd in inventory.items():#Organização dos Itens do Inventário, ".items()" separa
                    print('#############################')# em " 'chave' : valor "
                    print(f'{qtd}x - {itens}')
            else:
                print('...Nenhum Item no Momento...')
            print('#############################')
        case 0:
            print('Programa Encerrado')
            break
