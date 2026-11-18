# Ejercicio 3.4 – Búsqueda binaria en una lista ordenada

## 1. Enunciado
Dada una lista ordenada de menor a mayor, realizar una búsqueda binaria de un valor A e indicar en qué posición se encuentra o si no existe.

## 2. Análisis

**Entradas**
- N: cantidad de elementos.
- T[1..N]: lista ya ordenada ascendentemente.
- A: valor a buscar.

**Proceso**
1. Leer N, la lista y A.
2. INF = 1, SUP = N, HALLADO = 0.
3. Mientras INF ≤ SUP y no se haya hallado: MED = (INF+SUP) div 2.
4. Si T[MED] = A → hallado; si T[MED] < A → INF = MED+1; si no → SUP = MED−1.
5. Mostrar la posición o que no existe.

**Salidas**
- La posición de A en la lista, o el mensaje de que no se encuentra.

## 3. Requerimientos funcionales
- **RF-01** Debe leer la lista y el valor a buscar.
- **RF-02** Debe dividir el intervalo de búsqueda a la mitad en cada paso.
- **RF-03** Debe informar la posición (contando desde 1) o que no existe.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Precondición: la lista se digita ya ordenada de menor a mayor.
- En este programa se usan posiciones desde 1 (el índice 0 del arreglo no se usa).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
7
2 5 8 12 16 23 38
16
```

**Salida del programa**

```
Cantidad de elementos N: Digite los elementos ya ordenados de menor a mayor:
Valor a buscar (A): El valor 16 está en la posición 5
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `BusquedaBinaria.java`

**Cómo ejecutarlo:** `javac BusquedaBinaria.java` y luego `java BusquedaBinaria`
