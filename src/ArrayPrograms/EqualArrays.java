package ArrayPrograms;

public class EqualArrays {
	public void equalArrays(int arr1[], int arr2[]) {
		int flag = 0;
		if (checkLength(arr1, arr2)) {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = 1;
				}
			}
			String result = (flag == 0) ? "Arrays are same" : "Arrays are Not same";
			System.out.println(result);
		}else {
			System.out.println("Arrays Length is NOT same");
		}
		
	}
	
	public static boolean checkLength(int arr1[], int arr2[]) {
		if (arr1.length == arr2.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 1, 2, 3, 4 };

		EqualArrays ea = new EqualArrays();
		ea.equalArrays(arr1, arr2);
		
	}

}
