import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner in = new Scanner(System.in);
					  int c = in.nextInt();
					  int s = in.nextInt();

					  int p = s - c;
					  System.out.print(p);
	}
}
