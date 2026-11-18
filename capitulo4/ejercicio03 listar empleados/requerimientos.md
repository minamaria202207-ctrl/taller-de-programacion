# Ejercicio 4.3 – Listar un fichero de empleados con su total

## 1. Enunciado
Leer el fichero de empleados de principio a fin, listar todos sus registros y mostrar al final el número de empleados y la suma de los salarios.

## 2. Análisis

**Entradas**
- Fichero `empleados.txt`.

**Proceso**
1. Abrir el fichero y poner T = 0, N = 0.
2. Mientras haya registros: leer, mostrar, T = T + SALARIO, N = N + 1.
3. Cerrar y mostrar N y T.

**Salidas**
- Listado de empleados.
- Número de empleados y total de salarios.

## 3. Requerimientos funcionales
- **RF-01** Debe leer todo el fichero de forma secuencial.
- **RF-02** Debe listar código, nombre y salario de cada registro.
- **RF-03** Debe acumular el total de salarios y contar los registros.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.
- **RNF-05** Los ficheros son de texto plano (UTF-8), un registro por línea y campos separados por `;`.
- **RNF-06** El programa debe ejecutarse desde la carpeta del ejercicio (ruta relativa de los ficheros).

## 5. Restricciones y supuestos
- Requiere `empleados.txt` (se incluye uno de ejemplo).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
(ninguno)
```

**Salida del programa**

```
CODIGO  NOMBRE             SALARIO
101     Ana Torres         2,500,000.00
102     Luis Pérez         1,800,000.50
103     María Gómez        3,200,000.00
Empleados: 3
Total de salarios: 7,500,000.50
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `ListarEmpleados.java`
- `empleados.txt` (datos de ejemplo)

**Cómo ejecutarlo:** `javac ListarEmpleados.java` y luego `java ListarEmpleados`
