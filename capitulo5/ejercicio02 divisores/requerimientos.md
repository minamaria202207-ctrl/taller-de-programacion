# Ejercicio 5.2 – Divisores de varios números y su cantidad

## 1. Enunciado
Dados K números enteros positivos, calcular todos los divisores de cada uno e indicar cuántos divisores tiene.

## 2. Análisis

**Entradas**
- K: cantidad de números a analizar.
- N: cada número entero positivo.

**Proceso**
1. Leer K.
2. Para cada número (I = 1…K): leer N, poner C = 0.
3. Para D = 1…N: si N mod D = 0, mostrar D y C = C + 1.
4. Mostrar C.

**Salidas**
- Los divisores de cada número.
- La cantidad de divisores de cada número.

## 3. Requerimientos funcionales
- **RF-01** Debe procesar K números.
- **RF-02** Debe probar todos los posibles divisores de 1 a N.
- **RF-03** Debe mostrar cada divisor encontrado.
- **RF-04** Debe contar y mostrar cuántos divisores tiene cada número.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Los números deben ser positivos; con N ≤ 0 no se encuentran divisores (C = 0).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
3
12
7
30
```

**Salida del programa**

```
¿Cuántos números va a analizar? (K): Número 1:   Divisores de 12: 1 2 3 4 6 12
  Cantidad de divisores: 6
Número 2:   Divisores de 7: 1 7
  Cantidad de divisores: 2
Número 3:   Divisores de 30: 1 2 3 5 6 10 15 30
  Cantidad de divisores: 8
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `Divisores.java`

**Cómo ejecutarlo:** `javac Divisores.java` y luego `java Divisores`
