# Creación de una lista de estudiantes
'''
estudiantes = ["Juan", "María", "Pedro", "Ana"]


print(estudiantes[0])  # Juan

estudiantes[1] = "Lucía"
print(estudiantes)  # ['Juan', 'Lucía', 'Pedro', 'Ana']


estudiantes.append("Carlos")
print(estudiantes)  # ['Juan', 'Lucía', 'Pedro', 'Ana', 'Carlos']


estudiantes.remove("Pedro")
print(estudiantes)  # ['Juan', 'Lucía', 'Ana', 'Carlos']


def burbuja(arreglo):
    n = len(arreglo)
    for i in range(n):
        for j in range(0, n-i-1):
            if arreglo[j] > arreglo[j+1]:
                arreglo[j], arreglo[j+1] = arreglo[j+1], arreglo[j] 
    return arreglo


datos = [64, 34, 25, 12, 22, 11, 90]
print("Arreglo original:", datos) #[64, 34, 25, 12, 22, 11, 90]
print("Arreglo ordenado (Burbuja):", burbuja(datos)) # [11, 12, 22, 25, 34, 64, 90]


def seleccion(arreglo):
    n = len(arreglo)
    for i in range(n):
        min = i
        for j in range(i+1, n):
            if arreglo[j] < arreglo[min]:
                min = j
        # Intercambia el elemento más pequeño con el primer elemento desordenado
        arreglo[i], arreglo[min] = arreglo[min], arreglo[i]
    return arreglo

datos = [56, 87, 31, 12, 24, 9, 110]+-
print("Arreglo original:", datos) #[56, 87, 31, 12, 24, 9, 110]
print("Arreglo ordenado (Selección):", seleccion(datos)) #[9, 12, 24, 31, 56, 87, 110]
'''

def insercion(arreglo):
    n = len(arreglo)
    for i in range(1, n):
        clave = arreglo[i]
        j = i - 1
        while j >= 0 and clave < arreglo[j]:
            arreglo[j + 1] = arreglo[j]
            j -= 1
            arreglo[j + 1] = clave
            print(arreglo)
    return arreglo

datos = [64, 34, 25, 12, 22, 11, 90]
print("Arreglo original:", datos)
print("Arreglo ordenado (Inserción):", insercion(datos))