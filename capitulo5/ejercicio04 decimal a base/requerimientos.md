# Ejercicio 5.4 – Pasar un número decimal a cualquier base (2 a 16)

## 1. Enunciado
Hacer un programa que convierta un número decimal a una base cualquiera entre 2 y 16.

## 2. Análisis

**Entradas**
- N: número decimal entero (N ≥ 0).
- B: base de destino (2 a 16).

**Proceso**
1. Leer N y B y validar los rangos.
2. Si N = 0, el resultado es 0.
3. Mientras N > 0: R = N mod B; guardar el dígito de R; N = N div B.
4. Mostrar los dígitos guardados en orden inverso.

**Salidas**
- El número expresado en la base B (con letras A–F para valores 10–15).

## 3. Requerimientos funcionales
- **RF-01** Debe validar que B esté entre 2 y 16 y que N no sea negativo.
- **RF-02** Debe aplicar divisiones sucesivas entre la base.
- **RF-03** Debe mostrar el resultado leyendo los residuos de atrás hacia adelante.
- **RF-04** Debe usar letras A–F para los dígitos 10 a 15.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Solo se convierten enteros no negativos.
- El 0 se trata aparte porque el ciclo no se ejecutaría.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
255
16
```

**Salida del programa**

```
Número decimal (N >= 0): Base de destino (2 a 16): 255 en base 16 = FF
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `DecimalABase.java`

**Cómo ejecutarlo:** `javac DecimalABase.java` y luego `java DecimalABase`
