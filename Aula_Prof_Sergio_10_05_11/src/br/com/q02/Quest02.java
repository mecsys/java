package br.com.q02;

import br.com.q02.Quest02;

public class Quest02 {

	/**
	 * @param args
	 * 2) Altere o algoritmo para contabilizar o numero de movimentos realizados.
	 *	  Execute e guarde o valor para torres com 1, 3, 4, 5, 8 e 10.
	 *	  
	 *	Respostas:
	 *
	 *    1 = 	1.
	 *    3 = 	7.	    
	 *    4 = 	15.
	 *    5 = 	31.
	 *    8 = 	255.
	 *    10 = 	1023.    
	 * 
	 * hanoi( n, i, f, t )
	 * 	se n == 1
	 * 		move( n, i, f)
	 * 	senao
	 * 		hanoi( n-1, i, t, f)
	 * 		move( n, i, f)
	 * 		hanoi( n-1, t, f, i)
	 * 
	 * Obs.: 	n => numero de discos
	 * 			i => haste inicial
	 * 			t => haste temporaria
	 * 			f => haste final
	 */	
	
	static int count = 0;
	
	public void hanoi(int n, int i, int f, int t) {
		if(n == 1)
				move(n, i, f);			
	
		else {
			hanoi(n -1, i, t, f);
			move(n, i, f);
			hanoi(n -1, t, f, i);			
		}	                                                                   
	}
	
	public void move(int n, int i, int f) {		
		System.out.println("Move disco " + n + " da haste " + i + " para haste " + f);
		count++;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nExercicio Torre de Hanoi:\n");
		Quest02 q01 = new Quest02();
		q01.hanoi(10, 1, 3, 2);
		System.out.println("Numeros de movimentos realizados: " + count);		
	}

}
