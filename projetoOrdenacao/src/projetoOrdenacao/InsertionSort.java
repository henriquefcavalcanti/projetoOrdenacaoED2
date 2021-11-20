package projetoOrdenacao;

public class InsertionSort {

	int[] sort(int[] numberList) {
		System.out.println("Insertion Sort");
		ordenarVetor(numberList);
		int[] newList = ordenarVetor(numberList);
		return newList;
	}

	public int[] ordenarVetor(int[] vetor) {
		for (int i = 1; i < vetor.length; i++) {

			int aux = vetor[i];
			int indiceJ = i - 1;

			while (indiceJ >= 0 && aux < vetor[indiceJ]) {
				vetor[indiceJ + 1] = vetor[indiceJ];
				indiceJ = indiceJ - 1;
			}

			vetor[indiceJ + 1] = aux;

		}
		return vetor;
	}

}
