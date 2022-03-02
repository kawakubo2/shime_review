package array1;

public class NumberFormat1 {
	public static void main(String[] args) {
		String strNum = "1234";
		int result = 0;
		for (int i = 0; i <  strNum.length(); i++) {
			int n = strNum.charAt(i) - '0';
			result = result * 10 + n;
		}
		System.out.println(result * 100);
	}
}
