import java.util.Scanner;

public class RecursiveSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("Enter five numbers:");
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
			
		}
		
		int sum = calculateSum(numbers, 0);
		System.out.println("The sum of the numbers is: " + sum);
		
		scanner.close();
				

	}
	
	public static int calculateSum(int[] numbers, int index) {
		if (index == numbers.length - 1) {
			return numbers[index];
		} else {
			return numbers[index] + calculateSum(numbers, index + 1);
		}
	}

}
