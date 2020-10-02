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
	static boolean isPrime(int p) {
		if(p==0 || p== 1) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(p);i++) {
			if(p%i==0) {
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
		liste.initRandom(100, 2000);
		liste.printPrimes();

	}
}