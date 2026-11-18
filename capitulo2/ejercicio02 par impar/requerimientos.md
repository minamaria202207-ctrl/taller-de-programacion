# Ejercicio 2.2 – Par o impar

## 1. Enunciado
Dado un número entero por pantalla, contestar si es par o impar.

## 2. Análisis

**Entradas**
- N: número entero (positivo, negativo o cero).

**Proceso**
1. Leer N.
2. Calcular el residuo R = N mod 2.
3. Si R = 0 el número es par; en caso contrario es impar.

**Salidas**
- Mensaje indicando si N es PAR o IMPAR.

## 3. Requerimientos funcionales
- **RF-01** El programa debe leer un número entero.
- **RF-02** Debe usar el residuo de la división entre 2 para decidir.
- **RF-03** Debe mostrar el mensaje PAR o IMPAR.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- El cero se considera par.
- Los negativos funcionan igual (en Java -3 % 2 = -1, que es distinto de 0).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
7
```

**Salida del programa**

```
Ingrese un número entero: 7 es IMPAR
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `ParImpar.java`

**Cómo ejecutarlo:** `javac ParImpar.java` y luego `java ParImpar`
