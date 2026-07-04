#Tela
def mostrarTela():
    print('\n 1 - Cadastrar Aluno \n 2 - Listar Alunos \n 3 - Mostrar Média de um Aluno \n 4 - Sair\n')
    escolha = int(input('Escolha uma Opção '))
    match escolha:
        case 1:
            cadastrarAluno()
        case 2:
            mostrarAlunos()
        case 3:
            mostrarMedia()
        case 4:
            Tchau()

#Array dos Alunos
Alunos = []
#Função de Cadastro de Chaves e Valores de novos alunos - Ação 1
def cadastrarAluno():
    #Informações de Entrada e Calculo da Média e Aprovação
    nome = input('Informe o nome do aluno: ')
    nota1 = float(input('Informe a 1º nota do aluno: '))
    nota2 = float(input('Informe a 2º nota do aluno: '))
    nota3 = float(input('Informe a 3º nota do aluno: '))
    notaMedia = aprovacaoMedia(nota1, nota2, nota3)
#Descobrir a situação de aprovação do Aluno
    if notaMedia >= 7:
        situacao = 'Aprovado'
    elif notaMedia >= 5:
        situacao = 'Recuperação'
    else:
        situacao = 'Reprovado'
    #Armazenamento de Dados em um Dicionário
    infoAluno = {
        'Nome' : nome,
        'Media': notaMedia,
        'Situacao': situacao,
    }
    Alunos.append(infoAluno)
    print('Aluno Cadastrado com sucesso!')
    mostrarTela()
#Aq Calculará a média e mostrar se a situação do aluno é aprovado, recuperação ou reprovado
def aprovacaoMedia(a, b, c):
    media = (a + b + c)/3
    return media

#Mostra Os Alunos Que Estão Cadastrados - Ação 2
def mostrarAlunos():
    if len(Alunos) == 0:
        print('Sua Lista Esta Vazia')
        mostrarTela()
    else:
        print(f'Você Possui {len(Alunos)} Aluno(s) Cadastrado(s).')
        confirmacao = input('Deseja Visualizar? S|N ')
        while confirmacao != 'S' and confirmacao != 'N':
            confirmacao = input('Digite Somente "S" ou "N" ')

        if confirmacao == 'N':
            mostrarTela()
        elif confirmacao == 'S':
            for aluno in Alunos:
                print(f'{aluno['Nome']}')
            mostrarTela()

#Mostrar a Media do Aluno Escolhido - Ação 3
def mostrarMedia():
    for i, aluno in enumerate(Alunos):
        print(f'{i} - {[aluno['Nome']]}')
    escolha = int(input('Escolha Um Aluno'))
    while escolha < 0 or escolha >= len(Alunos):
        for i, aluno in enumerate(Alunos):
            print(f'{i} - {aluno['Nome']}')
        escolha = int(input('Não Possui esse aluno escolhe outro'))
    print(f'O Aluno {Alunos[escolha]['Nome']}\nTem uma média de {Alunos[escolha]['Media']:.2f} Pontos\nE sua Situação é: {Alunos[escolha]['Situacao']} ')
    mostrarTela()
#Finalizar Painel - Ação 4
def Tchau():
    print('Painel Finalizado')

mostrarTela()