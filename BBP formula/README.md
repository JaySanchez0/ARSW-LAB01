# Laboratorio

> [Ver](https://eci.gitbook.io/workshops/parallelism-and-concurrency/bbp-formula)

**Compilar**

~~~
mvn -U package
~~~

**Ejecutar:**

~~~
mvn exec:java -Dexec.mainClass="edu.eci.arsw.math.Main"
~~~

## Solucion:

#### Parte 1: Introduccion a los Threads
- Cambie start() por run? cambia la salida? por que?
 
 **Al ejecutar run**
 
 ![run](img/run.jpg)
 
 Podemos ver que el codigo se ejecuta secuencial
 
 **Al ejecutar start**
 
 ![start](img/start.jpg)
 
 Podemos evidenciar que el codigo se ejecuta en paralelo

#### Parte 2: BBP formula ejercicio 
 
 
#### Parte 3: Evaluacion de rendimiento

   Para la siguiente secuencia de experimentos calcular un millon de digitos 

- Un solo Thread

 **Threads**
 
 ![img](img/hilos1.PNG)
 
 
 **Monitor de recursos**
 
 
 ![img](img/recursos1.PNG)
 
- Tantos hilos como cores tenga el equipo
 
 **Threads**
 
 ![img](img/threads_cores.PNG)
 
 **Monitor de recursos**
 
 ![img](img/recursos_cores.PNG)
 
 - Que tenga tantos Threads como el doble de cores
 
 **Threads**
 
 ![img](img/double_threads.PNG)
 
 **Monitor de recursos**
 
  ![img](img/double_recursos.PNG)
  
  - Que tenga 200 threads
  
  **Threads**
  
  ![img](img/200threads.PNG)
  
  **Monitor de recursos**
  
  ![img](img/200threadsProcesos.PNG)
  
  - Que tenga 500 threads
  
 **Threads**
 
 ![img](img/500Threads.PNG)
 
 **Monitor de recursos**
 
 ![img](img/500Monitor.PNG)
