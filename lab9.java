

public class lab9 {
	public static void main(String args[]) {
		int[] intArray = new int[] {1, 3, 5, 7, 9};

		for (int a : intArray) {
			System.out.println(factorial(a)+ " ");
			System.out.println(" ");
			fibonacci(a);
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
			

		} else {

			return n * factorial(n - 1);

		}
	}



	public static void fibonacci(int n) {
		int current =1;
		int previous=0;
		System.out.print(previous+" ");
		System.out.print(current+" ");
		while (current<=n) {
			System.out.print(current+" ");
			previous = current;
			current= previous+current;
		}
	}

}
