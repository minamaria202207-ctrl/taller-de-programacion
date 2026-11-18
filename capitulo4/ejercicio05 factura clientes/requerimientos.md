# Ejercicio 4.5 – Factura de clientes a partir de un fichero de pedidos

## 1. Enunciado
Con un fichero de artículos (código, descripción, precio) y un fichero de pedidos ordenado por cliente (cliente, código de artículo, cantidad), emitir la factura de cada cliente con el subtotal de cada línea y el total.

## 2. Análisis

**Entradas**
- `articulos.txt`: `codigo;descripcion;precio`.
- `pedidos.txt`: `cliente;codigo;cantidad` (ordenado por cliente).

**Proceso**
1. Cargar los artículos en una tabla.
2. Leer el primer pedido.
3. Mientras haya pedidos: tomar el cliente, T = 0 e imprimir el encabezado.
4. Mientras el pedido sea del mismo cliente: buscar el precio, SUB = CANT·PRECIO, imprimir la línea y T = T + SUB.
5. Imprimir el total del cliente.

**Salidas**
- Una factura por cliente con sus líneas y el total.

## 3. Requerimientos funcionales
- **RF-01** Debe cargar los precios desde `articulos.txt`.
- **RF-02** Debe agrupar los pedidos consecutivos del mismo cliente.
- **RF-03** Debe calcular el subtotal de cada línea y el total por cliente.
- **RF-04** Debe avisar si un artículo del pedido no está en el fichero de artículos.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.
- **RNF-05** Los ficheros son de texto plano (UTF-8), un registro por línea y campos separados por `;`.
- **RNF-06** El programa debe ejecutarse desde la carpeta del ejercicio (ruta relativa de los ficheros).

## 5. Restricciones y supuestos
- `pedidos.txt` viene ordenado por cliente (corte de control).
- Los precios usan punto decimal o son enteros.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
(ninguno)
```

**Salida del programa**

```
===== FACTURA - Cliente C01 =====
  Cuaderno   x3      13,500.00
  Lápiz      x10     12,000.00
  TOTAL: 25,500.00

===== FACTURA - Cliente C02 =====
  Borrador   x5       4,000.00
  TOTAL: 4,000.00

===== FACTURA - Cliente C03 =====
  Cuaderno   x1       4,500.00
  Borrador   x2       1,600.00
  TOTAL: 6,100.00
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `FacturaClientes.java`
- `articulos.txt` (datos de ejemplo)
- `pedidos.txt` (datos de ejemplo)

**Cómo ejecutarlo:** `javac FacturaClientes.java` y luego `java FacturaClientes`
