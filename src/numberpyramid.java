
public class numberpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(i);
//			}
//			
//			System.out.println(" ");
//		}
//
//	}
//}
		int n = 5;
		for(int i=1; i<=n; i++) {
		//spaces
		for(int j=1; j<=n-i; j++) {
		System.out.print(" ");
		}
		//numbers
		for(int j=1; j<=i; j++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}
		}
		}

