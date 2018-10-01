# UNIVERSIDAD SAN FRANCISCO DE QUITO

# COLEGIO: POLITÉCNICO

# CURSO: CMP 0211 - PROGRAMACIÓN 3

# Semestre: Primer Semestre 201 8 /201 9 NRC: 1157

# Deber # 2

## Bibliografía:

## • Java : How to program / P.J. Deitel, H.M. Deitel, 10th Ed.

## • Introduction to Java Programming - Daniel Liang, 10th Ed.

## Objetivos

## • Identificar clases definiendo sus datos y responsabilidades.

## • Modelar clases en UML.

## • Implementar clases en Java.

## • Hacer uso de las colecciones.

## 1. Desarrollo

En una empresa de generación eléctrica se monitorea constantemente el estado de los generadores.
De un generador se conoce el fabricante, el modelo y un código que lo identifica. Para cada
generador se controlan una serie de parámetros los cuales son monitoreados constantemente por
un sistema automático. De cada parámetro se conoce el nombre, el rango de valores donde opera
(mínimo y máximo), el valor actual, el tipo de alarma que genera en caso de que el valor actual salga
del rango válido y un código que lo identifica. Para cada parámetro se lleva además un histórico de
valores fuera de rango alcanzado por éste.
De un generador se tiene además las posibles alarmas que este puede generar en caso de que
alguno de sus parámetros se dispare. De cada alarma se conoce el tipo (numérico) que la identifica
y además está conectada a una interfaz de hardware de modo que una vez activada se emita la
señal configurada para la misma. Estas señales pueden ser un sonido intermitente, sonido fuerte y
prolongado, luz intermitente, etc.
El sistema de monitoreo cada cierto tiempo realiza el chequeo de los parámetros de un generador.
En este momento se verifica, para un generador, el estado de cada uno de sus parámetros y si
alguno de estos esta fuera del rango valido, se almacena el valor actual en el histórico y se activa la
alarma correspondiente para el mismo. Si más de un parámetro se va de rango, deben dispararse,
sucesivamente, las alarmas para cada uno de estos de modo que el operador quede informado de
la magnitud del problema existente.

```
a) Modele la situación anterior utilizando diagramas de clases de UML.
b) Implemente los métodos necesarios para realizar el monitoreo del estado de un generador.
c) Implementar los métodos que permitan calcular la alteración media que suelen sufrir los
parámetros de un generador. Este dato es útil para conocer en qué medida suelen alterarse
los parámetros de un generador antes de que esto suceda y tomar alguna decisión de
carácter preventivo. Esto se calcula como :
fORMULA
```
```
'
```
```
#()
donde i se refiere a cada parámetro y n es el total de parámetros de un generador; 푀# es el
promedio de los valores históricos para el parámetro i ; 푚# es la semisuma de los valores
máximo y mínimo para el parámetro i.
d) Implemente dichas clases en Java y con una interfaz de usuario gráfica (GUI) que soporte
la entrada (entrada de los datos) y salida de la información (solución del ejercicio).
```
**Nota** : Es obligatorio el uso de colecciones numéricas a través de las clases **_IntArray, FloatArray_** ,
**_IntMatrix_** y **_FloatMatrix_** en la medida que sea posible y la construcción de la interfaz gráfica

## haciendo uso de Java FX


