package edu.eci.arsw.primefinder;

public class Main {

	public static void main(String[] args) {
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		
		//pft.start();
		PrimeFinderThread p1=new PrimeFinderThread(0, 10000000);
		p1.start();
		PrimeFinderThread p2=new PrimeFinderThread(10000001, 20000000);
		p2.start();
		PrimeFinderThread p3=new PrimeFinderThread(20000001, 30000000);
		p2.start();
		
	}
	
}
