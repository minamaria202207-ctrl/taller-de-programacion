# Ejercicio 5.5 – Matriz de 20×20 con filas pares a unos e impares a ceros

## 1. Enunciado
Generar una matriz de 20 filas y 20 columnas de forma que las filas pares se llenen con unos y las impares con ceros.

## 2. Análisis

**Entradas**
- Ninguna.

**Proceso**
1. Para cada fila I = 1…20 y cada columna J = 1…20:
2.    Si I es par: M[I,J] = 1; si no: M[I,J] = 0.
3. Mostrar la matriz.

**Salidas**
- La matriz de 20×20.

## 3. Requerimientos funcionales
- **RF-01** Debe recorrer la matriz con dos ciclos anidados.
- **RF-02** Debe asignar 1 en las filas pares y 0 en las impares (filas numeradas desde 1).
- **RF-03** Debe mostrar la matriz completa.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- La fila 1 es impar (ceros) y la fila 2 es par (unos); en Java el índice 0 corresponde a la fila 1.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
(ninguno)
```

**Salida del programa**

```
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `Matriz20x20.java`

**Cómo ejecutarlo:** `javac Matriz20x20.java` y luego `java Matriz20x20`
