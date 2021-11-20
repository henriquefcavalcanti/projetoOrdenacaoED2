package projetoOrdenacao;

public class BubbleSort {
	int[] sort(int[] numberList) {
		System.out.println("Bubble Sort");
		ordenarVetor(numberList);
		int[] newList = ordenarVetor(numberList);
		return newList;
	}

	public int[] ordenarVetor(int[] vetor) {
		boolean isTroca;
		int tamanhoVetorMenosUm = vetor.length - 1;

		do {
			isTroca = false;
			for (int i = 0; i < tamanhoVetorMenosUm; i++) {
				if (vetor[i] > vetor[i + 1]) {
					int aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					isTroca = true;
				}
			}
		} while (isTroca);
		
		return vetor;
	}
}
