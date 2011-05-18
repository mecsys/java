
package br.com.q03;

import java.util.Random;

public class Quest03 {

	/**
	 * @param args
	 *  3) Crie um m�todo (em C ou Java) que, dado como parametros um vetor e 
	 *  seu tamanho n, popular o vetor com numeros entre 1...n
	 */
	
	private Random random = new Random();
	
	public int[] getVetor(int n) {
		
		int vet[] = new int[n];
		vet[0] = 999;
				
		for (int i = 1; i < vet.length; i++) {				
			vet[i] = (int) random.nextInt(n);
		}		
		
		return vet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aux;
		
		Quest03 q03 = new Quest03();
		aux = q03.getVetor(100);
		
		System.out.println("\nVetor inicializado com tamanho " + aux.length + " unidades.");
	}

}
