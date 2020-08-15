public class Exercise2 {

	public static void main(String[] args) {
		int N = 0; 
		System.out.println(foo(N));
	}

	static int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++) // Higher loop is O(N)
			result++;
		for (int j = 0; j < 1000000; j++) // Lower loop is O(1)
			result += j;

		return result;
		// Time complexity is 0(N) 
	}
}