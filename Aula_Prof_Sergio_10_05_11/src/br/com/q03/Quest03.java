package br.com.q03;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quest03 {

	/**
	 * @param args
	 *  3) Crie um método (em C ou Java) que, dado como parametros um vetor e 
	 *  seu tamanho n, popular o vetor com numeros entre 1...n
	 */
	
	Random random = new Random();
				
	public int[] popVetor(int n) {
		
		int vet[] = new int[n];		
				
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) random.nextInt(n);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Vetor indice " + i + " conteudo " + vet[i]);			
			if(vet[i] > n)
				JOptionPane.showMessageDialog(null, "Vetor " + i + " inicializado com valor acima de" + n, "Atenção!", JOptionPane.WARNING_MESSAGE);
		}		
		return vet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aux;
		
		Quest03 q03 = new Quest03();
		aux = q03.popVetor(100);
		
		System.out.println("Vetor inicializado com tamanho " + aux.length);
	}

}
