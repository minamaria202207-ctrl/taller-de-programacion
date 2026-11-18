# Ejercicio 4.6 – Control de existencias: insertar, modificar y eliminar registros

## 1. Enunciado
Con un fichero de existencias (código, nombre, cantidad), construir un programa con menú que permita insertar, modificar la cantidad, eliminar y listar registros. Al salir, los cambios se guardan en el fichero.

## 2. Análisis

**Entradas**
- OPC: opción del menú (1 insertar, 2 modificar, 3 eliminar, 4 listar, 0 salir).
- Datos del registro según la opción.
- Fichero `existencias.txt`.

**Proceso**
1. Cargar el fichero en una lista.
2. Mostrar el menú y leer OPC.
3. Según OPC: insertar, modificar, eliminar o listar sobre la lista.
4. Repetir hasta que OPC = 0.
5. Guardar la lista completa en el fichero.

**Salidas**
- Mensajes de cada operación.
- Fichero `existencias.txt` actualizado.

## 3. Requerimientos funcionales
- **RF-01** Debe cargar el fichero al iniciar (si no existe, empieza vacío).
- **RF-02** Debe impedir códigos duplicados al insertar.
- **RF-03** Debe avisar cuando el código a modificar o eliminar no existe.
- **RF-04** Debe permitir listar el contenido actual.
- **RF-05** Debe grabar los cambios al salir.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.
- **RNF-05** Los ficheros son de texto plano (UTF-8), un registro por línea y campos separados por `;`.
- **RNF-06** El programa debe ejecutarse desde la carpeta del ejercicio (ruta relativa de los ficheros).

## 5. Restricciones y supuestos
- Las operaciones se hacen en memoria y se graban al salir (opción 0).
- Si se cierra el programa sin pasar por la opción 0, los cambios se pierden.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
4
1
P03
Clavo
50
1
P01
Duplicado
5
2
P01
120
3
P02
9
4
0
```

**Salida del programa**

```
Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir ->   CODIGO  NOMBRE      CANTIDAD
  P01     Tornillo    100
  P02     Tuerca      80

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir -> Código: Nombre: Cantidad:   Registro insertado.

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir -> Código: Nombre: Cantidad:   Ese código ya existe.

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir -> Código a modificar: Nueva cantidad:   Cantidad modificada.

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir -> Código a eliminar:   Registro eliminado.

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir ->   Opción inválida.

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir ->   CODIGO  NOMBRE      CANTIDAD
  P01     Tornillo    120
  P03     Clavo       50

Menú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir -> Cambios guardados en existencias.txt
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `ControlExistencias.java`
- `existencias.txt` (datos de ejemplo)

**Cómo ejecutarlo:** `javac ControlExistencias.java` y luego `java ControlExistencias`
