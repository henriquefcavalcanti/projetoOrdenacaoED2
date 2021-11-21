package projetoOrdenacao;

public class SeletionSort {

	int[] sort(int[] numberList) {
		System.out.println("Seletion Sort");
		ordenarVetor(numberList);
		int[] newList = ordenarVetor(numberList);
		return newList;
	}

	public int[] ordenarVetor(int[] vetor) {

		for (int i = 0; i < vetor.length; i++) {
			int indiceMenorElemento = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indiceMenorElemento]) {
					indiceMenorElemento = j;
				}
			} // FOR MENOR ELEMENTO

			if (indiceMenorElemento != i) {
				int menorElemento = vetor[indiceMenorElemento];

				vetor[indiceMenorElemento] = vetor[i];
				vetor[i] = menorElemento;
			}
		} // FOR ELEMENTOS

		return vetor;
	}

}
