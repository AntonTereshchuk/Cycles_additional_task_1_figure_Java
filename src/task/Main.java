package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int figureHeight;
		int j = 1;
		
		System.out.println("Enter figure height: ");
		figureHeight = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i <= figureHeight; i++) {
			
			System.out.print("*");
			
			if (j <= i && j < figureHeight) {
				System.out.println();
				i = 0;
				j++;
			}
			
			if (i == figureHeight) {
				System.out.println();
				i = 0;
				figureHeight --;
			}
			
		}
	
	}

}
