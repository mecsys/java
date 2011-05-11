package br.com.q04;

public class Quest04 {

	/**
	 * @param args
	 * 
	 * 4) Selecione um algoritmo de ordenação com tempo de execução O(n²) e um com O(n log n).
	 *    Implemente este algoritmo, em C ou Java.
	 */
	
	public int pai(int i) {
		return i/2;
	}
	
	public int filhoEsquerdo(int i) {
		return 2*i;
	}
	
	public int filhoDireito(int i) {
		return 2*i + 1;
	}
	
	public void maxHeapify(int[] A, int i) {		
		int l;
		int r;
		int maiorElemento;
		
		l = this.filhoEsquerdo(i);
		r = this.filhoDireito(i);
		
		if(l <= A.length && A[l] > A[i])
			maiorElemento = l;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
