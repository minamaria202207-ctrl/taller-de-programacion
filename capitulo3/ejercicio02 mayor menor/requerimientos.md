# Ejercicio 3.2 – Mayor y menor valor de una tabla

## 1. Enunciado
Dada una tabla en memoria de N elementos, obtener el valor mayor y el valor menor.

## 2. Análisis

**Entradas**
- N: cantidad de elementos (N ≥ 1).
- T[1..N]: los elementos de la tabla.

**Proceso**
1. Leer N y los N elementos.
2. Tomar MAYOR = MENOR = T[1].
3. Recorrer desde I = 2 hasta N: si T[I] > MAYOR, actualizar MAYOR; si no, si T[I] < MENOR, actualizar MENOR.
4. Mostrar MAYOR y MENOR.

**Salidas**
- Valor mayor y valor menor de la tabla.

## 3. Requerimientos funcionales
- **RF-01** Debe leer N y validar N ≥ 1.
- **RF-02** Debe cargar la tabla con los N datos.
- **RF-03** Debe recorrer la tabla una sola vez.
- **RF-04** Debe mostrar el mayor y el menor.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Los elementos son números enteros.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
5
12 7 30 4 18
```

**Salida del programa**

```
Cantidad de elementos N: Elemento 1: Elemento 2: Elemento 3: Elemento 4: Elemento 5: Mayor: 30
Menor: 4
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `MayorMenor.java`

**Cómo ejecutarlo:** `javac MayorMenor.java` y luego `java MayorMenor`
