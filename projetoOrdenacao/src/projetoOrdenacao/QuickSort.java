package projetoOrdenacao;

public class QuickSort {

	int[] sort(int[] numberList) {
		System.out.println("Quick Sort");
		int[] newList = ordenarVetor(numberList);
		return newList;
	}

	public int[] ordenarVetor(int[] vetor) {
		this.quickSort(vetor, 0, (vetor.length - 1));
		return vetor;
	}

	public void quickSort(int[] vetor, int p, int r) {
		int q;

		if (p < r) {
			q = this.particao(vetor, p, r);
			this.quickSort(vetor, p, q);
			this.quickSort(vetor, q + 1, r);
		}
	}

	private int particao(int vetor[], int p, int r) {

		int pivo, i, j;

		pivo = vetor[(p + r) / 2];
		i = p - 1;
		j = r + 1;

		while (i < j) {
			do {
				j--;
			} while (vetor[j] > pivo);

			do {
				i++;
			} while (vetor[i] < pivo);
			if (i < j) {
				this.troca(vetor, i, j);
			}
		} // WHILE

		return j;
	}

	private void troca(int vetor[], int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
