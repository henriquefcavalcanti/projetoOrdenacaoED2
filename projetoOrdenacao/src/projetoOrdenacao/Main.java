package projetoOrdenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean menuControl = true;
		Random randomGenerator = new Random();
		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();

		int[] numberList = new int[10];

		for (int i = 0; i < 10; i++) {
			numberList[i] = randomGenerator.nextInt(100);
		}

		System.out.println("A entrada de números será:");
		printArray(numberList);
		

		do {
			showMenu();
			int selection = scanner.nextInt();
			
			switch (selection) {
			case 1:
				int[] newList = bubbleSort.sort(numberList);
				printArray(newList);
				break;
			case 2:
				int[] newList1 = insertionSort.sort(numberList);
				printArray(newList1);
				break;
			default:
				System.out.println("Escolha um item do menu!!");
				break;
			}
			
		} while (menuControl);
		
	}
	
	static void showMenu() {

		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Escolha uma forma de ordenação:");
		System.out.println("1 - Bubble Sort");
		System.out.println("2 - Insertion Sort");
		System.out.println("3 - Merge Sort");
		System.out.println("4 - Quick Sort");
		System.out.println("5 - Seletion Sort");

	}
	
	static void printArray(int [] numberList) {
		for (int i : numberList) {
			System.out.print(i + " ");
		}
	}

}








