Objetivo
Que el estudiante comprenda el concepto de pila y su estructura, y que sea capaz de aplicarlo en un simulador de deshacer/rehacer (Undo/Redo) en un editor de texto simple, implementado en Java, trabajando en equipo y utilizando buenas prácticas de control de versiones con GitHub.

Resumen del Código

Este programa es un editor de texto que permite escribir, deshacer, rehacer y mostrar el último texto ingresado.

¿Qué es una pila?
Una pila es una estructura de datos donde los elementos se guardan en orden, pero solo se puede trabajar con el que está en la cima (el último que se ingresó).

El programa usa dos pilas:
Pila Principal → guarda los textos escritos.
Pila Rehacer → guarda los textos que se han deshecho para poder recuperarlos después.

Construcción:
Se creó una clase Pila que maneja los textos con un arreglo.
Dentro de la clase, se programaron los métodos push, pop, peek y isEmpty.
En el main, se declararon dos pilas:
pilaPrincipal para los textos escritos.
pilaRehacer para los textos eliminados (deshacer).
Se hizo un menú con condicionales if-else para que el usuario pueda elegir la opción que quiera.
Se añadieron mensajes en consola para guiar al usuario y mostrar los resultados de cada operación.

Screenshot de ejecución:
<img width="370" height="675" alt="ejecucion" src="https://github.com/user-attachments/assets/ff680383-9405-4c8c-b919-fa99c5df5e10" />

Integrantes:
Sebastian Camilo Jimenez Villa.
