package test02;

public class Palindrome {
	public boolean isPalinDrome(String s) {
		char[] arr = s.toLowerCase().toCharArray();
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] == ' ' || 
				arr[left] < '0' ||
				(arr[left] > '9' &&	arr[left] < 'a') || arr[left] > 'z') {
				left++;
				continue;
			}
			if (arr[right] == ' ' ||
				arr[right] < '0' ||
				(arr[right] > '9' && arr[right] < 'a') || arr[right] > 'z') {
				right--;
				continue;
			}
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "Was it a car or a cat I saw?";
		
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.isPalinDrome(str));
	}
}
