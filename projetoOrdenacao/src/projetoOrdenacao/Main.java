package projetoOrdenacao;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean menuControl = true;
		Random randomGenerator = new Random();
		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		SeletionSort seletionSort = new SeletionSort();

		int[] numberList = new int[10];

		for (int i = 0; i < 10; i++) {
			numberList[i] = randomGenerator.nextInt(100);
		}

		System.out.println("A entrada de números será:");
		printArray(numberList);

		int newList[];
		do {
			showMenu();
			int selection = scanner.nextInt();

			switch (selection) {
			case 1:
				newList = bubbleSort.sort(numberList);
				printArray(newList);
				break;
			case 2:
				newList = insertionSort.sort(numberList);
				printArray(newList);
				break;
			case 3:
				newList = mergeSort.sort(numberList);
				printArray(newList);
				break;
			case 4:
				newList = quickSort.sort(numberList);
				printArray(newList);
				break;
			case 5:
				newList = seletionSort.sort(numberList);
				printArray(newList);
				break;
			default:
				System.out.println("Escolha um item do menu!!");
				break;
			}

		} while (menuControl);
		scanner.close();

	}

	static void showMenu() {

		System.out.println();
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Escolha uma forma de ordenação:");
		System.out.println("1 - Bubble Sort");
		System.out.println("2 - Insertion Sort");
		System.out.println("3 - Merge Sort");
		System.out.println("4 - Quick Sort");
		System.out.println("5 - Seletion Sort");

	}

	static void printArray(int[] numberList) {
		for (int i : numberList) {
			System.out.print(i + " ");
		}
	}

}
