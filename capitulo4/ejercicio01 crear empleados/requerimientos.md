# Ejercicio 4.1 – Crear un fichero secuencial de empleados

## 1. Enunciado
Crear un fichero secuencial de empleados. Cada registro contiene código, nombre y salario. La captura termina cuando se digita el código 0.

## 2. Análisis

**Entradas**
- CODIGO: código del empleado (0 = fin de datos).
- NOMBRE: nombre del empleado.
- SALARIO: salario del empleado.

**Proceso**
1. Abrir `empleados.txt` para escritura (se crea vacío).
2. Leer CODIGO.
3. Mientras CODIGO ≠ 0: leer NOMBRE y SALARIO, grabar el registro `CODIGO;NOMBRE;SALARIO` y leer el siguiente CODIGO.
4. Cerrar el fichero.

**Salidas**
- Fichero `empleados.txt` con un registro por línea.
- Mensaje de confirmación.

## 3. Requerimientos funcionales
- **RF-01** Debe crear (o reemplazar) el fichero `empleados.txt`.
- **RF-02** Debe leer registros hasta que el código sea 0.
- **RF-03** Debe grabar un registro por línea con campos separados por `;`.
- **RF-04** Debe cerrar el fichero al terminar.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.
- **RNF-05** Los ficheros son de texto plano (UTF-8), un registro por línea y campos separados por `;`.
- **RNF-06** El programa debe ejecutarse desde la carpeta del ejercicio (ruta relativa de los ficheros).

## 5. Restricciones y supuestos
- Si el fichero ya existe, su contenido se reemplaza.
- El código 0 no se graba, solo marca el fin.
- El salario usa punto decimal.

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
101
Ana Torres
2500000
102
Luis Pérez
1800000.5
103
María Gómez
3200000
0
```

**Salida del programa**

```
Código del empleado (0 para terminar): Nombre: Salario: Código del empleado (0 para terminar): Nombre: Salario: Código del empleado (0 para terminar): Nombre: Salario: Código del empleado (0 para terminar): Fichero empleados.txt creado.
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `CrearEmpleados.java`

**Cómo ejecutarlo:** `javac CrearEmpleados.java` y luego `java CrearEmpleados`
