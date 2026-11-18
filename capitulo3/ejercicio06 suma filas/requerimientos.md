# Ejercicio 3.6 – Sumar los elementos de cada fila de una matriz

## 1. Enunciado
Dada una matriz de N filas por M columnas, sumar los elementos de cada fila e imprimir la suma de cada una.

## 2. Análisis

**Entradas**
- N: número de filas.
- M: número de columnas.
- A[1..N,1..M]: elementos de la matriz.

**Proceso**
1. Leer N, M y la matriz.
2. Para cada fila I = 1…N: S = 0; para J = 1…M: S = S + A[I,J].
3. Mostrar S al terminar cada fila.

**Salidas**
- La suma de cada una de las N filas.

## 3. Requerimientos funcionales
- **RF-01** Debe leer una matriz de N×M.
- **RF-02** Debe reiniciar el acumulador S al empezar cada fila.
- **RF-03** Debe mostrar la suma de cada fila.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- N y M son enteros positivos.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
2 3
1 2 3
4 5 6
```

**Salida del programa**

```
Número de filas (N) y de columnas (M): Digite los elementos fila por fila:
Suma de la fila 1: 6
Suma de la fila 2: 15
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `SumaFilas.java`

**Cómo ejecutarlo:** `javac SumaFilas.java` y luego `java SumaFilas`
