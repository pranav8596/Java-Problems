package ArrayPrograms;

public class MoveZeros {
	public static void moveZeros(int a[]) {
		int count = 0;
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[count] = a[i];
				count++;
			}
		}
		System.out.println("No. of non zeros element: " + count);
		while (count < a.length) {
			a[count] = 0;
			count++;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 5, 0, 1, 0, 0, 1, 2, 3, 4, 7 };
		moveZeros(a);
	}
}