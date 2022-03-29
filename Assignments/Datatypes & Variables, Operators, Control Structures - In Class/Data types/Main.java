import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner in = new Scanner(System.in);
                      int a = in.nextInt();
                      long b = in.nextLong();
                      float c = in.nextFloat();
                      double d = in.nextDouble();
                      char e = in.next().charAt(0);

                      System.out.println(a);
                      System.out.println(b);
                      System.out.println(c);
                      System.out.println(d);
                      System.out.println(e);
	}
}
