# Ejercicio 2.5 – Salario semanal de operarios con horas extra

## 1. Enunciado
Una empresa paga a sus operarios semanalmente según las horas trabajadas, a razón de D por hora y de 1,5·D por cada hora que exceda de 40. Indicar el salario a percibir por cada operario y el total de la nómina.

## 2. Análisis

**Entradas**
- N: número de operarios (el libro usa 100).
- D: valor de la hora normal.
- H: horas trabajadas por cada operario.

**Proceso**
1. Leer N y D.
2. Para cada operario I = 1…N: leer H.
3. Si H > 40: S = 40·D + (H − 40)·1,5·D; si no: S = H·D.
4. Mostrar S y acumular T = T + S.
5. Al final mostrar T.

**Salidas**
- Salario de cada operario.
- Total de la nómina.

## 3. Requerimientos funcionales
- **RF-01** Debe pedir N y D una sola vez.
- **RF-02** Debe leer las horas de cada operario.
- **RF-03** Debe pagar las horas sobre 40 con recargo del 50 %.
- **RF-04** Debe mostrar cada salario y el total acumulado.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- Para reproducir el enunciado original basta con digitar N = 100.
- Las horas pueden ser decimales (punto como separador).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
3
10000
38
45
40
```

**Salida del programa**

```
Número de operarios: Valor de la hora normal: Horas trabajadas por el operario 1:   Salario operario 1: 380000.00
Horas trabajadas por el operario 2:   Salario operario 2: 475000.00
Horas trabajadas por el operario 3:   Salario operario 3: 400000.00
Total a pagar: 1255000.00
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `SalarioOperarios.java`

**Cómo ejecutarlo:** `javac SalarioOperarios.java` y luego `java SalarioOperarios`
