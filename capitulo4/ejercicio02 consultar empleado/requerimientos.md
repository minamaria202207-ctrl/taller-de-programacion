# Ejercicio 4.2 – Consultar un empleado por su código

## 1. Enunciado
Dado un fichero de empleados, buscar por código y mostrar los datos correspondientes. Se pueden hacer varias consultas; termina con el código 0.

## 2. Análisis

**Entradas**
- CODIGO: código a buscar (0 = terminar).
- Fichero `empleados.txt`.

**Proceso**
1. Leer CODIGO.
2. Mientras CODIGO ≠ 0: abrir el fichero y leer registros hasta encontrar el código o llegar al fin.
3. Si se encuentra, mostrar nombre y salario; si no, informar que no existe.
4. Leer el siguiente CODIGO.

**Salidas**
- Datos del empleado, o el mensaje de que no existe.

## 3. Requerimientos funcionales
- **RF-01** Debe permitir varias consultas seguidas.
- **RF-02** Debe recorrer el fichero secuencialmente.
- **RF-03** Debe mostrar los datos si hay coincidencia.
- **RF-04** Debe informar cuando el código no existe.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.
- **RNF-05** Los ficheros son de texto plano (UTF-8), un registro por línea y campos separados por `;`.
- **RNF-06** El programa debe ejecutarse desde la carpeta del ejercicio (ruta relativa de los ficheros).

## 5. Restricciones y supuestos
- Los códigos son únicos dentro del fichero.
- Requiere `empleados.txt` en la carpeta (se incluye uno de ejemplo, también puede crearse con el ejercicio 4.1).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
102
999
0
```

**Salida del programa**

```
Código a consultar (0 para terminar):   Nombre: Luis Pérez | Salario: 1800000.5
Código a consultar (0 para terminar):   El código 999 no existe.
Código a consultar (0 para terminar): 
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `ConsultarEmpleado.java`
- `empleados.txt` (datos de ejemplo)

**Cómo ejecutarlo:** `javac ConsultarEmpleado.java` y luego `java ConsultarEmpleado`
