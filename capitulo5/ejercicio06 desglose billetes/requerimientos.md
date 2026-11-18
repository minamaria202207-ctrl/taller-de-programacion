# Ejercicio 5.6 – Desglose de una cantidad en billetes y monedas

## 1. Enunciado
Dada una cantidad de dinero, obtener cuántos billetes o monedas de 5000, 1000, 500, 100, 50, 25, 10, 5 y 1 se necesitan para pagarla usando la menor cantidad posible.

## 2. Análisis

**Entradas**
- CANTIDAD: valor entero a desglosar (CANTIDAD ≥ 1).

**Proceso**
1. Leer CANTIDAD y validar.
2. Recorrer la tabla DEN = [5000, 1000, 500, 100, 50, 25, 10, 5, 1] de mayor a menor.
3. Para cada denominación: N = CANTIDAD div DEN[I]; CANTIDAD = CANTIDAD mod DEN[I].
4. Si N > 0, mostrar N y la denominación.

**Salidas**
- Número de piezas de cada denominación utilizada.

## 3. Requerimientos funcionales
- **RF-01** Debe validar que la cantidad sea positiva.
- **RF-02** Debe usar una tabla con las denominaciones ordenadas de mayor a menor.
- **RF-03** Debe usar la división entera y el residuo.
- **RF-04** Debe mostrar solo las denominaciones que se usan.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- La tabla de denominaciones puede cambiarse sin tocar el algoritmo (por ejemplo para pesos colombianos).
- La cantidad es un número entero.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
13786
```

**Salida del programa**

```
Cantidad a desglosar: 2 x 5000
3 x 1000
1 x 500
2 x 100
1 x 50
1 x 25
1 x 10
1 x 1
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `DesgloseBilletes.java`

**Cómo ejecutarlo:** `javac DesgloseBilletes.java` y luego `java DesgloseBilletes`
