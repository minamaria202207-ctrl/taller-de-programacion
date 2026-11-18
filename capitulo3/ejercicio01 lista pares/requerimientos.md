# Ejercicio 3.1 – Tabla de 200 elementos con los números pares

## 1. Enunciado
Crear una tabla en memoria para 200 elementos y rellenarla con los números pares (2, 4, 6, …, 400). Luego imprimirla.

## 2. Análisis

**Entradas**
- Ninguna.

**Proceso**
1. Para I = 1…200: T[I] = 2·I.
2. Para I = 1…200: mostrar T[I].

**Salidas**
- La tabla con los 200 primeros números pares (10 por línea).

## 3. Requerimientos funcionales
- **RF-01** Debe crear un arreglo de 200 posiciones.
- **RF-02** Debe llenarlo con los pares usando un ciclo.
- **RF-03** Debe imprimir todo el contenido de la tabla.

## 4. Requerimientos no funcionales
- **RNF-01** Lenguaje Java (JDK 8 o superior), ejecución por consola y sin librerías externas.
- **RNF-02** Código comentado, con nombres de variables significativos y una sola clase pública.
- **RNF-03** Mensajes claros al usuario (qué dato se pide y qué resultado se muestra).
- **RNF-04** El diagrama de flujo (`diagrama.drawio`) debe corresponder con el algoritmo programado.

## 5. Restricciones y supuestos
- En el diagrama los subíndices van de 1 a 200; en Java van de 0 a 199 (misma lógica).

## 6. Ejemplo de ejecución (prueba real del programa)

**Datos que se escriben por teclado**

```
(ninguno)
```

**Salida del programa**

```
2 4 6 8 10 12 14 16 18 20 
22 24 26 28 30 32 34 36 38 40 
42 44 46 48 50 52 54 56 58 60 
62 64 66 68 70 72 74 76 78 80 
82 84 86 88 90 92 94 96 98 100 
102 104 106 108 110 112 114 116 118 120 
122 124 126 128 130 132 134 136 138 140 
142 144 146 148 150 152 154 156 158 160 
162 164 166 168 170 172 174 176 178 180 
182 184 186 188 190 192 194 196 198 200 
202 204 206 208 210 212 214 216 218 220 
222 224 226 228 230 232 234 236 238 240 
242 244 246 248 250 252 254 256 258 260 
262 264 266 268 270 272 274 276 278 280 
282 284 286 288 290 292 294 296 298 300 
302 304 306 308 310 312 314 316 318 320 
322 324 326 328 330 332 334 336 338 340 
342 344 346 348 350 352 354 356 358 360 
362 364 366 368 370 372 374 376 378 380 
382 384 386 388 390 392 394 396 398 400 
```

## 7. Archivos del ejercicio
- `requerimientos.md` (este documento)
- `diagrama.drawio` (abrir en Draw.io)
- `ListaPares.java`

**Cómo ejecutarlo:** `javac ListaPares.java` y luego `java ListaPares`
