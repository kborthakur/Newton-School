import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner in = new Scanner(System.in);
                      int d = in.nextInt();
                      int q = in.nextInt();

                      if (q == 0){
                          System.out.print("-1");
                      }
                      else{
                          int z = d / q;
                          System.out.print(z);
                      }
	}
}
