numPessoas = int(input('Quantas pessoas vc pretende mostrar as idades: '))
idades = []

for i in range(numPessoas):
    idade = int(input(f'Idade da Pessoa {i + 1}: '))
    idades.append(idade)

maior18 = []
menor18 = []
for c in idades:
    if c >= 18:
        maior18.append(c)
    else:
        menor18.append(c)

print(f'A menor Idade são os com {menor18} anos')
print(f'A maior Idade são os com {maior18} anos')
