# Ejercicio 2.3 – Positivo o negativo para N números

## 1. Enunciado
Dados N números por pantalla, contestar para cada uno si es positivo o negativo (o cero).

## 2. Análisis

**Entradas**
- N: cantidad de números a evaluar.
- V: cada uno de los N números (se piden de a uno).

**Proceso**
1. Leer N.
2. Repetir N veces con I = 1…N: leer V.
3. Si V > 0 es positivo; si V < 0 es negativo; si no, es cero.

**Salidas**
- Una línea por número indicando si es positivo, negativo o cero.

## 3. Requerimientos funcionales
- **RF-01** Debe pedir la cantidad N.
- **RF-02** Debe leer N números en un ciclo.
- **RF-03** Debe clasificar cada número y mostrar el resultado.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- El cero no es positivo ni negativo, por eso se informa aparte.
- Si N ≤ 0 no se evalúa ningún número.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
4
5
-3
0
8
```

**Salida del programa**

```
¿Cuántos números va a evaluar? Número 1:   -> positivo
Número 2:   -> negativo
Número 3:   -> es cero
Número 4:   -> positivo
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `PositivosNegativos.java`

**Cómo ejecutarlo:** `javac PositivosNegativos.java` y luego `java PositivosNegativos`
