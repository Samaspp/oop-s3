import java.util.Scanner;

class q {
	int partition(String str[], int low, int high) {
		String pivot = str[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (str[j].compareToIgnoreCase(pivot) <= 0) {
				i++;
				String temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
		String temp = str[i + 1];
		str[i + 1] = str[high];
		str[high] = temp;
		return i + 1;
	}

	void sort(String str[], int low, int high) {
		if (low < high) {
			int pi = partition(str, low, high);
			sort(str, low, pi - 1);
			sort(str, pi + 1, high);
		}
	}

	static void printArray(String str[], int n) {
		for (int i = 0; i < n; ++i)
			System.out.println(str[i]);
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[30];
		int n, i;
		System.out.println("Enter the number of strings: ");
		n = sc.nextInt();
		n = n + 1;
		System.out.println("Enter the strings: ");
		for (i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		q ob = new q();
		ob.sort(str, 0, n - 1);
		System.out.println("Sorted array");
		printArray(str, n);
	}
}
