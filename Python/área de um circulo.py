raio = float(input('DIGITE O RAIO DO CÍRCULO!: '))
def calcular_area(raio):
    return raio**2 * 3.14

resultado = calcular_area(raio)
print(f'A área do círculo é {resultado}')