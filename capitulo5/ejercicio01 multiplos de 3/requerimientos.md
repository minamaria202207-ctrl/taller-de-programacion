# Ejercicio 5.1 – Los N primeros múltiplos de 3

## 1. Enunciado
Hallar e imprimir los N primeros múltiplos de 3.

## 2. Análisis

**Entradas**
- N: cantidad de múltiplos a obtener (N ≥ 1).

**Proceso**
1. Leer N y validar N ≥ 1.
2. Para I = 1…N: M = 3·I y mostrar M.

**Salidas**
- Los N primeros múltiplos de 3.

## 3. Requerimientos funcionales
- **RF-01** Debe pedir N por teclado.
- **RF-02** Debe rechazar N menor que 1.
- **RF-03** Debe generar cada múltiplo como 3 por el contador del ciclo.
- **RF-04** Debe mostrar los N múltiplos.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Los múltiplos son 3, 6, 9, … (se excluye el 0).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
10
```

**Salida del programa**

```
¿Cuántos múltiplos de 3 desea? (N): 3 6 9 12 15 18 21 24 27 30 
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `MultiplosDeTres.java`

**Cómo ejecutarlo:** `javac MultiplosDeTres.java` y luego `java MultiplosDeTres`
