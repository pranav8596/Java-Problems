package programs;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 7, 9, 10, 12, 15 };
		int n = 16;
		int l = 0;
		int h = arr.length - 1;
		int mid;
	
		while (l <= h) {
			mid = (l + h) / 2;
			if (arr[mid] == n) {
				System.out.println("element found at index no " + mid);
				break;
			} else if (arr[mid] > n) {
				h = mid - 1;
			}
			if (arr[mid] < n) {
				l = mid + 1;
			}
			// mid = (l+h)/2;
		}
		if (l > h) {
			System.out.println("Element not found");
		}
	}

}
