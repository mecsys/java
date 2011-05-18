package br.com.q07;

import javax.swing.JOptionPane;

import br.com.q03.Quest03;

public class Quest07 {

	/**
	 * @param args
	 *  7) Faca um grafico mostrando media tempo x tamanho vetor para os dois algoritmos.
	 *     Discuta sobre o resultado encontrado.
	 *     
	 *     enviar por e-mail.
	 */
	private int[] A;
	@SuppressWarnings("unused")
	private int[] result = new int[7];
	private int heap_size;
	private long startTime;
	private long stopTime;
	
	
	public void mostraVet() {
		System.out.printf("================================================================================\nA");
		for (int i = 1; i < this.A.length; i++) {
			System.out.printf("[%2d] ", i);

		}
		System.out.printf("\n");
		for (int i = 1; i < this.A.length; i++) {
			System.out.printf("%4d ", this.A[i]);
		}
		System.out.printf("\n");
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
		for (int i = ((this.A.length -1) / 2); i >= 1; i--) {
			maxHeapify(this.A, i);
		}		
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
		System.out.println("Tempo de ordenaÃ§Ã£o: " + (stopTime - startTime) + " msecs."  );
	}
	
	public void setA(int n) {
		Quest03 q03 = new Quest03();
		this.A = q03.getVetor(n + 1);
		this.heap_size = this.A.length - 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quest07 q07 = new Quest07();		
			
		q07.setA(10);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();		
		
		q07.setA(100);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();

		q07.setA(200);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();
		
		q07.setA(500);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();
		
		q07.setA(2000);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();
		
		q07.setA(5000);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();
		
		q07.setA(10000);		
		q07.chamaHeapSort();		
		q07.tempOdernacao();
		
		JOptionPane.showMessageDialog(null, "Execução Finalizada!", "Execução Finalizada!", JOptionPane.WARNING_MESSAGE );
				
	}

}