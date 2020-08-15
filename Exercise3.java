public class Exercise3 {
	
	public static void main(String[] args) {
		int N = 0; 
		System.out.println(bar(N));
		}
	static int bar(int N) {
		 int result = 1;
		 for (int i=1; i< N; i*=2) // Loop is O(logN)
			 result+=2;
		 return result;
		 //Time Complexity is 0(logN)
	}
}