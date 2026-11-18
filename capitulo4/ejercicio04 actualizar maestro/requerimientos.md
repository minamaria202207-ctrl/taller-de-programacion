# Ejercicio 4.4 – Actualizar un fichero maestro con un fichero de movimientos

## 1. Enunciado
Se tiene un fichero maestro con dos campos (n.º de artículo, existencias) y un fichero de movimientos con dos campos (n.º de artículo, cantidad). Ambos están ordenados por artículo en forma ascendente. Actualizar las existencias sumando los movimientos (positivos = entradas, negativos = salidas) y generar un nuevo maestro.

## 2. Análisis

**Entradas**
- `maestro.txt`: `articulo;existencias` (ordenado).
- `movimientos.txt`: `articulo;cantidad` (ordenado).

**Proceso**
1. Abrir los dos ficheros de entrada y el nuevo maestro.
2. Leer el primer registro de cada uno.
3. Mientras haya maestro: avisar y descartar los movimientos de artículos menores (inexistentes); sumar los movimientos del mismo artículo; grabar el maestro actualizado; leer el siguiente maestro.
4. Avisar de los movimientos sobrantes y cerrar los ficheros.

**Salidas**
- `maestro_nuevo.txt` actualizado.
- Avisos de movimientos sobre artículos inexistentes.

## 3. Requerimientos funcionales
- **RF-01** Debe recorrer ambos ficheros una sola vez (mezcla secuencial).
- **RF-02** Debe sumar todos los movimientos de cada artículo.
- **RF-03** Debe grabar cada artículo en el nuevo maestro, tenga o no movimientos.
- **RF-04** Debe avisar de movimientos cuyo artículo no existe en el maestro.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.
- **RNF-05** Los ficheros son de texto plano (UTF-8), un registro por línea y campos separados por `;`.
- **RNF-06** El programa debe ejecutarse desde la carpeta del ejercicio (ruta relativa de los ficheros).

## 5. Restricciones y supuestos
- Ambos ficheros deben venir ordenados por artículo.
- El maestro original no se modifica: se genera `maestro_nuevo.txt`.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
(ninguno)
```

**Salida del programa**

```
Aviso: el artículo 5 no existe en el maestro.
Aviso: el artículo 35 no existe en el maestro.
Aviso: el artículo 50 no existe en el maestro.
Nuevo maestro (maestro_nuevo.txt):
  10;65
  20;30
  30;12
  40;12
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `ActualizarMaestro.java`
- `maestro.txt` (datos de ejemplo)
- `movimientos.txt` (datos de ejemplo)

**Cómo ejecutarlo:** `javac ActualizarMaestro.java` y luego `java ActualizarMaestro`
