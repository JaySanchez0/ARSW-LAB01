package edu.eci.arsw.primefinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		
		//pft.start();
		PrimeFinderThread p1=new PrimeFinderThread(0, 10000000);
		p1.start();
		PrimeFinderThread p2=new PrimeFinderThread(10000001, 20000000);
		p2.start();
		PrimeFinderThread p3=new PrimeFinderThread(20000001, 30000000);
		p3.start();
		//Espera 5 segundos
		Thread.sleep(5000);
		//Detiene los hilos
		p1.pause();
		p2.pause();
		p3.pause();
		Scanner sc = new Scanner(System.in);
		System.out.println("Presiona enter para continuar");
		//Lee el salto de linea
		String str = sc.nextLine();
		//Continua los hilos
		p1.restart();
		p2.restart();
		p3.restart();
	}
	
}
