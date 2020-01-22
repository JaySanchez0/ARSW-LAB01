# Laboratorio

> [Ver](https://eci.gitbook.io/workshops/parallelism-and-concurrency/bbp-formula)

## Solucion:

#### Parte 1: Introduccion a los Threads
- Cambie start() por run? cambia la salida? por que?
 
 ** Al ejecutar run **
 
 ![run](img/run.jpg)
 
 Podemos ver que el codigo se ejecuta secuencial
 
 ** Al ejecutar start **
 
 ![start](img/start.jpg)
 
 Podemos evidenciar que el codigo se ejecuta en paralelo

#### Parte 2: BBP formula ejercicio
 
 
#### Parte 3: Evaluacion de rendimiento

   Para la siguiente secuencia de experimentos calcular un millon de digitos 

- Un solo Thread

 ** Threads **
 
 ![img](img/hilos1.png)
 
 
 ** Monitor de recursos **
 
 
 ![img](img/recursos1.png)
 
- Tantos hilos como cores tenga el equipo
 
 ** Threads **
 
 ![img](img/threads_cores.png)
 
 ** Monitor de recursos **
 
 ![img](img/recursos_cores.png)
 
 - Que tenga tantos Threads como el doble de cores
 
 ** Threads **
 
 ![img](img/double_threads.png)
 
 ** Monitor de recursos **
 
  ![img](img/double_recursos.png)