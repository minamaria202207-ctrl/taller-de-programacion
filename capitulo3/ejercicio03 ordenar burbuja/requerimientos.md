# Ejercicio 3.3 – Ordenar una tabla de menor a mayor (método de la burbuja)

## 1. Enunciado
Dada una tabla en memoria de N elementos, ordenarla de menor a mayor.

## 2. Análisis

**Entradas**
- N: cantidad de elementos.
- T[1..N]: elementos de la tabla.

**Proceso**
1. Leer N y los elementos.
2. Para I = 1…N−1 y para J = 1…N−I: si T[J] > T[J+1], intercambiarlos usando AUX.
3. Mostrar la tabla ordenada.

**Salidas**
- La tabla ordenada de menor a mayor.

## 3. Requerimientos funcionales
- **RF-01** Debe leer la tabla.
- **RF-02** Debe compararla por pares adyacentes e intercambiar cuando estén desordenados.
- **RF-03** Debe mostrar la tabla ordenada.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Se acepta que haya valores repetidos.
- Es el método de ordenamiento por intercambio (burbuja).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
6
9 3 7 1 8 2
```

**Salida del programa**

```
Cantidad de elementos N: Elemento 1: Elemento 2: Elemento 3: Elemento 4: Elemento 5: Elemento 6: Tabla ordenada: 1 2 3 7 8 9
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `OrdenarBurbuja.java`

**Cómo ejecutarlo:** `javac OrdenarBurbuja.java` y luego `java OrdenarBurbuja`
