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
 
 - **Preguntas:**
  1. De acuerdo con la ley de Amdahls, donde S (n) es la mejora teórica del rendimiento, P es la fracción paralela del algoritmo yn el número de hilos, cuanto mayor sea n, mayor será la mejora. ¿Por qué no se logra el mejor rendimiento con los 500 hilos? ¿Cómo se compara este rendimiento cuando se usan 200?
  2. ¿Cómo se comporta la solución usando tantos subprocesos de procesamiento como núcleos en comparación con el resultado de usar el doble?
  3. De acuerdo con lo anterior, si para este problema en lugar de 500 hilos en una sola CPU, se pudiera usar 1 cable en cada una de las 500 máquinas hipotéticas, ¿se aplicaría mejor la ley de Amdahls? Si, en cambio, se usaran hilos c en máquinas distribuidas 500 / c (donde c es el número de núcleos de dichas máquinas), ¿se mejoraría? Explica tu respuesta.
