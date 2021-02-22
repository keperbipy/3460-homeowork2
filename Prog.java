import java.lang.Integer;
import java.util.Random;

public class Prog {

	public static void main(String [] args) {
		
		
		if (args.length != 2) {
			System.out.println("Please execute: java Prog <n> <p>");
			System.out.println("n is the input size, and p is the program number.");
			System.exit(0);
		}

		int n = Integer.parseInt(args[0]);
		int p = Integer.parseInt(args[1]);
		
		switch(p) {
			case 1: prog1(n);
							break;
			case 2: prog2(n);
							break;
			case 3: prog3(n);
							break;
			case 4: prog4(n);
							break;
			default: System.out.println("Invalid program number. Only 1-4.");
		}
	}

	private static void prog1(int n) {
		//hash1(k) = k mod n
		HashFunctions hasher = new HashFunctions(n);
		for(int i = 1; i <= n; i++) {
			System.out.println(i*100);
		}

	}

	private static void prog2(int n) {
		//(n/C) *K where C is n^2
		HashFunctions hasher = new HashFunctions(n);
		for(int i = 0; i < n; i++) {
			System.out.println(i);
		}
		
		
	}

	private static void prog3(int n) {
		
		
	}

	private static void prog4(int n) {
		// TODO: Code to generate n keys that all get hashed to the same index using hash4.	
	}
}

