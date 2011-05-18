package br.com.q01;

public class Quest01 {

	/**
	 * @param args
	 * 1) Implemente (em C ou Java) o algoritmo da Torre de Hanoi.
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
	
	public Quest01() {
		// TODO Auto-generated constructor stub
		System.out.println("Quest01 Construtor VOID.");
		this.hanoi(16, 1, 3, 2);
		System.out.println("Quest01 Construtor VOID.");
	}
	
	public Quest01(int n, int i, int f, int t) {
		// TODO Auto-generated constructor stub
		System.out.println("Quest01 Construtor parametrizado..");
		this.hanoi(n, i, f, t);
		System.out.println("Construtor parametrizado..");
	}
		
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
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Quest01 q01 = new Quest01(16, 1, 3, 2);
	}

}
