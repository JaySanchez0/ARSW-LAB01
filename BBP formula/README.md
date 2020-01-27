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
  1. De acuerdo con la ley de Amdahls, donde S (n) es la mejora teórica del rendimiento, P es la fracción paralela del algoritmo y n el número de hilos, cuanto mayor sea n, mayor será la mejora. ¿Por qué no se logra el mejor rendimiento con los 500 hilos? ¿Cómo se compara este rendimiento cuando se usan 200?
  
  ``` Si bien la ley de Ahmdal muestra una sustancial mejora en el desempeño y velocidad del programa a medida que aumentamos la cantidad de Threads utilizados (n), hay un momento en el cual el algoritmo es el que decide la mejora en  velocidad no el numero de procesadores, es por esto que podemos observar un comportamiento casi identico entre usar 200 Threads y 500 Threads ```
  
  2. ¿Cómo se comporta la solución usando tantos subprocesos de procesamiento como núcleos en comparación con el resultado de usar el doble?
  
  ```La velocidad al utilizar el doble de nucleos (16) se reduce en 3 segundos, la memoria Cpu tuvo un incremento de un 88% a a un 94%,mientras que la memora usada no tuvo un mayor incremento```
  
  3. De acuerdo con lo anterior, si para este problema en lugar de 500 hilos en una sola CPU, se pudiera usar 1 cable en cada una de las 500 máquinas hipotéticas, ¿se aplicaría mejor la ley de Amdahls? Si, en cambio, se usaran c hilos en  500 / c  máquinas distribuidas  (donde c es el número de núcleos de dichas máquinas), ¿se mejoraría? Explica tu respuesta.
  
  ``` Si corremos un thread por cada una de las 500 maquinas el tiempo de ejcución segun el algoritmo corresponde a 1 minuto 28 segundos, que deberia ser igual para cada uno de los PC  sin presentar mejora alguna en el rendimiento de la Ley de Ahmdal,por otro lado si utilizaramos (500 / 8) maquinas  cada una ejcutando 8 Threads todas demorarian un tiempo x mas grande al obtenido al correr 500 Threads en una sola maquina```

