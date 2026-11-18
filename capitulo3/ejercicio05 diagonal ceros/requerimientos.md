# Ejercicio 3.5 – Poner a ceros la diagonal de una matriz cuadrada

## 1. Enunciado
Dada una matriz cuadrada N×N, poner su diagonal principal a ceros.

## 2. Análisis

**Entradas**
- N: orden de la matriz.
- M[1..N,1..N]: los elementos de la matriz.

**Proceso**
1. Leer N y la matriz.
2. Para I = 1…N: M[I,I] = 0.
3. Mostrar la matriz resultante.

**Salidas**
- La matriz con su diagonal principal en cero.

## 3. Requerimientos funcionales
- **RF-01** Debe leer una matriz cuadrada.
- **RF-02** Debe recorrer la diagonal con un único ciclo.
- **RF-03** Debe mostrar la matriz final.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- La diagonal principal son los elementos con fila = columna.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
3
1 2 3
4 5 6
7 8 9
```

**Salida del programa**

```
Orden de la matriz (N): Digite los elementos fila por fila:
Matriz resultante:
0	2	3	
4	0	6	
7	8	0	
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `DiagonalCeros.java`

**Cómo ejecutarlo:** `javac DiagonalCeros.java` y luego `java DiagonalCeros`
