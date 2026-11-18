# Ejercicio 2.4 – Descuento con tanto por ciento

## 1. Enunciado
Dado un número (precio) y un tanto por ciento de descuento, mostrar el número, el tanto por ciento, la cantidad descontada y la cantidad a pagar.

## 2. Análisis

**Entradas**
- N: número o precio inicial.
- T: tanto por ciento de descuento (0 a 100).

**Proceso**
1. Leer N y T y validar 0 ≤ T ≤ 100.
2. C = N · T / 100 (cantidad descontada).
3. P = N − C (cantidad a pagar).

**Salidas**
- N, T, la cantidad descontada C y la cantidad a pagar P.

## 3. Requerimientos funcionales
- **RF-01** Debe pedir N y T por teclado.
- **RF-02** Debe rechazar porcentajes fuera de 0–100.
- **RF-03** Debe calcular C y P.
- **RF-04** Debe mostrar los cuatro valores.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Los decimales se escriben con punto (por ejemplo 12.5).
- Se muestran dos decimales.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
200000
15
```

**Salida del programa**

```
Ingrese el número (precio): Ingrese el tanto por ciento de descuento (0-100): Número: 200000.00
Tanto por ciento: 15.00%
Cantidad descontada: 30000.00
Cantidad a pagar: 170000.00
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `Descuento.java`

**Cómo ejecutarlo:** `javac Descuento.java` y luego `java Descuento`
