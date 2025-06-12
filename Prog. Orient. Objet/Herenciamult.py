class vehiculo:
    def __init__(self, matricula, modelo, llantas):
        self.matricula = matricula
        self.modelo = modelo
        self.llantas = llantas

    def velocidad_maxima(self,pas):
        if self.llantas >4:
            if pas >=1:
                return "La velocidad máxima del bus es de 40 km/h."
            elif pas ==0:
                return "La velocidad máxima del bus es de 60 km/h."
        elif self.llantas == 4:
            if pas >=1:
                return "La velocidad máxima del taxi es de 70 km/h."
            elif pas ==0:
                return "La velocidad máxima del taxi es de 80 km/h."
        
        return "La velocidad máxima depende del tipo de vehículo."

class bus(vehiculo):
    def __init__(self, matricula, modelo, llantas, capacidad):
        super().__init__(matricula, modelo, llantas)
        self.capacidad = capacidad

    def mostrar_info(self):
        return f"Bus {self.modelo} con matrícula {self.matricula}, {self.llantas} llantas y lleva {self.capacidad} pasajeros."
    

class taxi(vehiculo):
    def __init__(self, matricula, modelo, llantas, licencia, pasajeros):
        super().__init__(matricula, modelo, llantas)
        self.licencia = licencia
        self.pasajeros = pasajeros

    def mostrar_info(self):
        return f"Taxi {self.modelo} con matrícula {self.matricula}, {self.llantas} llantas, licencia {self.licencia} y lleva {self.pasajeros} pasajeros."
    
mi_bus = bus("ABC123", "Mercedes", 6, 12)
print(mi_bus.mostrar_info())
print(mi_bus.velocidad_maxima(mi_bus.capacidad))
print(" ")
mi_taxi = taxi("XYZ789", "Toyota", 4, "LIC12345", 4)
print(mi_taxi.mostrar_info())
print(mi_taxi.velocidad_maxima(mi_taxi.pasajeros))