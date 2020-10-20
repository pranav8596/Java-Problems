package programs;

public class NullPractice {
	public static String getName() {
		String name = null;
		try {
			name.concat(name);
			System.out.println("Hii");
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return name;
	}

	public static void main(String[] args) {
		String names = NullPractice.getName();
		System.out.println(names);
	}

}
