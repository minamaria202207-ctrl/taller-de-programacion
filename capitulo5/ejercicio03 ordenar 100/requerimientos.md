# Ejercicio 5.3 – Ordenar una tabla de 100 elementos (método de selección)

## 1. Enunciado
Dada una tabla en memoria de 100 elementos, ordenarla de menor a mayor.

## 2. Análisis

**Entradas**
- Ninguna: la tabla se llena con 100 números enteros aleatorios entre 1 y 999 para la demostración.

**Proceso**
1. Generar T[1..100] con valores aleatorios y mostrarla.
2. Para I = 1…99: MIN = I.
3. Para J = I+1…100: si T[J] < T[MIN], MIN = J.
4. Intercambiar T[I] con T[MIN].
5. Mostrar la tabla ordenada.

**Salidas**
- La tabla original.
- La tabla ordenada de menor a mayor.

## 3. Requerimientos funcionales
- **RF-01** Debe crear una tabla de 100 elementos.
- **RF-02** Debe ordenarla con el método de selección (buscar el menor y colocarlo en su posición).
- **RF-03** Debe mostrar la tabla antes y después de ordenar.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Los valores son aleatorios, por eso la salida cambia en cada ejecución (la del ejemplo es solo una muestra).
- Para digitar los 100 datos a mano, basta con reemplazar el llenado por una lectura con `Scanner`.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
(ninguno)
```

**Salida del programa**

```
Tabla original:
 581 657  44 601 649 419 882 226 557 562
 307 995 669 260 505 661 735 609 354 515
  25 119 680 859 338 464 452 633 286 882
 569 314 375 221 762 508  13 761 571 997
 737 711 476  38  61 236 282 579 120 365
 687  98 744  91 284 119  57 203 750 877
 444 364 418 120 830   4 166 352 107 814
 662 631 941 522 431 890 270  91 426 284
 445 678 216 907 652 414  13 768 841 625
 611  73 858 487 188 606 683 558 537 150

Tabla ordenada:
   4  13  13  25  38  44  57  61  73  91
  91  98 107 119 119 120 120 150 166 188
 203 216 221 226 236 260 270 282 284 284
 286 307 314 338 352 354 364 365 375 414
 418 419 426 431 444 445 452 464 476 487
 505 508 515 522 537 557 558 562 569 571
 579 581 601 606 609 611 625 631 633 649
 652 657 661 662 669 678 680 683 687 711
 735 737 744 750 761 762 768 814 830 841
 858 859 877 882 882 890 907 941 995 997
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `Ordenar100.java`

**Cómo ejecutarlo:** `javac Ordenar100.java` y luego `java Ordenar100`
