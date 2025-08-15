import sqlite3

def conectar_db():
    return sqlite3.connect('user.db')

def ejecutar_query(conexion, query, parametros=()):
    cursor = conexion.cursor()
    cursor.execute(query, parametros)
    conexion.commit()
    return cursor

def crear_tabla_personas(conexion):
    ejecutar_query(conexion, "CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT,nombre TEXT NOT NULL,edad INTEGER NOT NULL)")

def agregar_persona(conexion, nombre_persona, edad_persona):
    ejecutar_query(conexion, "INSERT INTO personas (nombre, edad) VALUES (?, ?)", (nombre_persona, edad_persona))
    print(f"Persona '{nombre_persona}' agregada.")

def mostrar_personas(conexion):
    cursor = ejecutar_query(conexion, "SELECT * FROM personas")
    print("Personas registradas:")
    for id_persona, nombre_persona, edad_persona in cursor.fetchall():
        print(f"ID: {id_persona}, Nombre: {nombre_persona}, Edad: {edad_persona}")

def modificar_persona(conexion, id_persona, nuevo_nombre, nueva_edad):
    cursor = ejecutar_query(conexion, "UPDATE personas SET nombre=?, edad=? WHERE id=?", (nuevo_nombre, nueva_edad, id_persona))
    if cursor.rowcount:
        print(f"Persona con ID {id_persona} actualizada.")
    else:
        print(f"No se encontró persona con ID {id_persona}.")

def borrar_persona(conexion, id_persona):
    cursor = ejecutar_query(conexion, "DELETE FROM personas WHERE id=?", (id_persona,))
    if cursor.rowcount:
        print(f"Persona con ID {id_persona} eliminada.")
    else:
        print(f"No se encontró persona con ID {id_persona}.")

def menu_principal():
    conexion = conectar_db()
    crear_tabla_personas(conexion)
    while True:
        print("""\n1. Crear persona
              \n2. Leer personas
              \n3. Actualizar persona
              \n4. Eliminar persona
              \n5. Salir
              """)
        opcion_menu = input("Seleccione opción: ")
        if opcion_menu == '1':
            agregar_persona(conexion, input("Nombre: "), int(input("Edad: ")))
        elif opcion_menu == '2':
            mostrar_personas(conexion)
        elif opcion_menu == '3':
            modificar_persona(conexion, int(input("ID: ")), input("Nuevo nombre: "), int(input("Nueva edad: ")))
        elif opcion_menu == '4':
            borrar_persona(conexion, int(input("ID: ")))
        elif opcion_menu == '5':
            print("Saliendo...")
            break
        else:
            print("Opción no válida")
    conexion.close()

if __name__ == "__main__":
    menu_principal()