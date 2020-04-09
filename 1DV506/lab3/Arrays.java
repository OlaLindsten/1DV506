package ol222es_lab3;

public class Arrays {

	private static int sum(int[] arr) {
		
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		return total;
	}
	
	private static String toString(int[] arr) {
		
		String newStr = "";
		for (int i = 0; i < arr.length; i++) {
			newStr = newStr + arr[i];
		}
		
		return newStr;
	}
	
	private static int[] addN(int[] arr, int n) {
		
		int[] nArray = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			nArray[i] = arr[i] + 1;
		}
		return nArray;
	}
	
	private static int[] reverse(int[] arr) {
		int [] reverseArray = new int[arr.length];
		
		int length = arr.length;
		for (int i = 1; i <= length; i++) {
			reverseArray[i - 1] = arr[length - i];
		}		
		return reverseArray;
	}
	
	private static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}

	private static void replaceAll(int[] arr, int old, int nw) {
		for (int i = 0; i < arr.length; i++) {
			if (old == arr[i]) {
				arr[i] = nw;
			}
		}
	}

	private static int[] sort(int[] arr) {
		
		int[] sortedA = new int[arr.length];
		int temp = 0;
		
		for (int i = 0; i < sortedA.length; i++) {
			sortedA[i] = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < sortedA.length; j++) {
				if (sortedA[i] < sortedA[j]) {
					temp = sortedA[i];
					sortedA[i] = sortedA[j];
					sortedA[j] = temp;
				}
				
			}
		}
		return sortedA;
	}
	
	private static boolean hasSubsequence(int[] arr, int[] sub) {
				
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < sub.length; j++) {
				if (arr[i] == sub[j]) {
					counter++;
				}
			}
		}
		if (counter == sub.length) {
			return true;
		}

		return false;
	}
	
	public static void main(String[] args) {
		
	    int[] arr = {3,4,5,6,7};
	    int[] sequence = {8,4,5};
	     
		System.out.println("Summan av arrayn: " + sum(arr));
		
	    System.out.println("Arrayns innehåll: " + Arrays.toString(arr));
		
		System.out.println("Efter n är tillagt: " + toString(addN(arr, 1)));
		
		System.out.println("Omvänd ordning: " + Arrays.toString(reverse(arr)));
		
		System.out.println("Innehåller: " + hasN(arr, 7));
		
		replaceAll(arr, 3, 8);
		System.out.println("Nya arrayn: " + Arrays.toString(arr));
		
		System.out.println("Sorted: " + Arrays.toString(sort(arr)));
		
		System.out.println("Sekvensen: " + hasSubsequence(arr, sequence));
		
	}

}
