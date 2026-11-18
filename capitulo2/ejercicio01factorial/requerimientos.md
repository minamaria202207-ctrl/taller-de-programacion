# Ejercicio 2.1 – Factorial de un número

## 1. Enunciado
Dado un número entero N, calcular e imprimir su factorial: N! = N·(N-1)·(N-2)·…·3·2·1 (con 0! = 1).

## 2. Análisis

**Entradas**
- N: número entero (0 ≤ N ≤ 20).

**Proceso**
1. Leer N y validar que esté entre 0 y 20.
2. Inicializar el acumulador F = 1.
3. Repetir para I desde 1 hasta N: F = F · I.
4. Mostrar F.

**Salidas**
- El factorial de N.

## 3. Requerimientos funcionales
- **RF-01** El programa debe pedir N por teclado.
- **RF-02** Debe rechazar valores negativos o mayores a 20.
- **RF-03** Debe calcular el factorial mediante un ciclo.
- **RF-04** Debe mostrar el resultado.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Se usa `long`; a partir de 21! el resultado desborda, por eso N ≤ 20.
- 0! = 1 (el ciclo no se ejecuta).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
5
```

**Salida del programa**

```
Ingrese un número entero N (0 a 20): El factorial de 5 es: 120
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `Factorial.java`

**Cómo ejecutarlo:** `javac Factorial.java` y luego `java Factorial`
