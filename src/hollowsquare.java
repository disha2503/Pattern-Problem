
public class hollowsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    // size of the square
			    int m=4;
			    int n=5;
			    // outer loop rows
			    for (int i = 1; i <= m; i++) {
			      // inner loop columns
			      for (int j = 1; j <= n; j++) {
			        // print only star in first and last row
			        if (i == 1 || j==1 ||i==m ||j==n) {
			          System.out.print("*");
			        }
			        else {
			 
			            System.out.print(" ");
			           }
			        
			        }
			      
			      System.out.println();
			    }
			  

	}

}

