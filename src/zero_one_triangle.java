
public class zero_one_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//outer loop
		for(int i=1;i<=n;i++)
		{
			//inner loop
			for(int j=1;j<=i;j++)
			{
				//even d 1 print appundhu
				int sum=i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			
			System.out.println(" ");
		}
	}

}
