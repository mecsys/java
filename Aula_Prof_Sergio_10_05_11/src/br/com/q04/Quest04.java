package br.com.q04;

public class Quest04 {

	/**
	 * @param args
	 * 
	 * 4) Selecione um algoritmo de ordena��o com tempo de execu��o O(n�) e um com O(n log n).
	 *    Implemente este algoritmo, em C ou Java.
	 */
	
	private int[] A = {0, 5, 8, 3, 1, 15, 9, 12, 7, 6, 12, 4};
	private int heap_size = this.A.length - 1;
	private long startTime;
	private long stopTime;
	
	
	public void mostraVet() {
		System.out.println("===========================================================");
		for (int i = 1; i < this.A.length; i++) {
			System.out.printf("A[%2d] = %3d", i, this.A[i]);
			System.out.println();
		}
		System.out.println("===========================================================");
	}
	
	public void troca(int troca, int maior) {
		int temp;
		
		temp = this.A[maior];
		this.A[maior] = this.A[troca];
		this.A[troca] = temp;
		mostraVet();
	}
	
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
		
		if(l <= this.heap_size && A[l] > A[i])
			maiorElemento = l;
		else
			maiorElemento = i;
		
		if(r <= this.heap_size && A[r] > A[maiorElemento])
			maiorElemento = r;
		
		if(maiorElemento != i) {
			troca(i, maiorElemento);
			maxHeapify(this.A, maiorElemento);
		}
			
	}
	
	public void buildMaxHeap(int[] A) {		
		
		System.out.println(heap_size);
		
		for (int i = ((this.A.length -1) / 2); i >= 1; i--) {
			maxHeapify(this.A, i);
		}
		
		System.out.println(heap_size);
		
	}
	
	public void heapSort(int[] A) {
		buildMaxHeap(this.A);		
		
		for (int i = (this.A.length -1) ; i >= 2; i--) {
			troca(1, i);
			this.heap_size = this.heap_size - 1; 
			maxHeapify(this.A, 1);
		}
	}
	
	public void chamaHeapSort() {
		//heapSort(this.A);
		startTime = System.currentTimeMillis();
		heapSort(this.A);
		stopTime = System.currentTimeMillis();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quest04 q04 = new Quest04();		
				
		q04.mostraVet();
		q04.chamaHeapSort();
		q04.mostraVet();

	}

}
