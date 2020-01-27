## Laboratorio
**Compilar:**
~~~
mvn -U package
~~~
**Ejecutar**
~~~
mvn exec:java -Dexec.mainClass="edu.eci.arsw.primefinder.Main"
~~~


Revise el programa "primos concurrentes" (en la carpeta part1), provisto en el paquete edu.eci.arsw.primefinder. Este es un programa que calcula los números primos entre dos intervalos, distribuyendo su búsqueda entre hilos independientes. Por ahora, tiene un solo hilo que busca primos entre 0 y 30,000,000. Ejecútelo, abra el administrador de procesos del sistema operativo y verifique cuántos núcleos utiliza.

![1Hilo](img/DogRace1.jpg)

``` Se utilizaron 2 nucleos de core```


Modifique el programa para que, en lugar de resolver el problema con un solo hilo, hágalo con tres, donde cada uno de ellos constituirá la primera parte del problema original. Verifique nuevamente la operación, y nuevamente verifique el uso de los núcleos del equipo.

![3Hilos](img/DogRace3.jpg)

``` Se siguien usando 2 nucleos de core```
