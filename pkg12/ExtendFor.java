package pkg12;

public class ExtendFor {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };

		System.out.println("이전 방식");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("확장 for 방식");
		for(int item : arr) {
			System.out.println(item);
		}
		
		String[] fruits = {"apple", "melon", "banana", "orange"};
		System.out.println("확장 for 방식");
		for (String item : fruits) {
			System.out.println(item);
		}
	}
}