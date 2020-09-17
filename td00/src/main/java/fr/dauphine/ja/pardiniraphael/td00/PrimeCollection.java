package fr.dauphine.ja.pardiniraphael.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers = new ArrayList<>();
	}
	
	public void initRandom(int n, int m){
		for(int i = 0; i < n; i++) {
			int nombreAleatoire = (int)(Math.random() * (m + 1));
			numbers.add(nombreAleatoire);
		}
	}
	private boolean isPrime(int p) {
		for(int i = 2; i < (int)Math.sqrt(p)+1; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private void printPrimes() {
		for (int i : numbers) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		PrimeCollection liste = new PrimeCollection();
		liste.initRandom(100, 1000);
		liste.printPrimes();
		
	}
}