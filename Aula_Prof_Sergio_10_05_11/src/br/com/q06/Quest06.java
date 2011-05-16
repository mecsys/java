package br.com.q06;

import br.com.q03.Quest03;

public class Quest06 {

	/**
	 * @param args
	 *  6) Execute o algoritmo de desenvolvido no exercicio anterior 5 vezes para 
	 *     cada um dos dois m�todos de ordena��o para vetores de tamanhos:
	 *     10, 100, 200, 500, 2000, 5000 e 10000.
	 */ 
	private int[] A;
	private int[] result = new int[7];
	private int heap_size;
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
	
	public void tempOdernacao() {
		System.out.println("Tempo de ordenação: " + (stopTime - startTime) + " msecs."  );
	}
	
	public void initA(int n) {
		Quest03 q03 = new Quest03();
		this.A = q03.popVetor(n + 1);
		this.heap_size = this.A.length - 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quest06 q06 = new Quest06();		
				
		q06.initA(10);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();
		
		q06.initA(100);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();

		q06.initA(200);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();
		
		q06.initA(500);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();
		
		q06.initA(2000);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();
		
		q06.initA(5000);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();
		
		q06.initA(10000);		
		q06.chamaHeapSort();		
		q06.tempOdernacao();
	}

}