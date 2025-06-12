class Animal:
    def __init__(self, name):
        self.name = name

    def hacer_sonido(self):
        return "sonido genérico"

class Perro(Animal):
    def hacer_sonido(self):
        return "guau"
    
class Gato(Animal):
    def __init__(self, name, vidas, marcaAtun):
        super().__init__(name)
        self.vidas= vidas
        self.marcaAtun= marcaAtun

    def hacer_sonido(self):
        return "Miau Miau"
    
    def mostrarVidas(self):
        return f"{self.name} tiene {self.vidas} vidas."

    def comerAtun(self):
        return f"{self.name} come atún {self.marcaAtun}."

'''mi_perro = Perro("Firulais")
print(mi_perro.name)  
print(mi_perro.hacer_sonido())'''

mi_gato = Gato("Paco", 9, "Real")
print(mi_gato.name)
print(mi_gato.mostrarVidas())
print(mi_gato.hacer_sonido())
print(mi_gato.comerAtun())
