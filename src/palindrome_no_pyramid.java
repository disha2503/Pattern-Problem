
public class palindrome_no_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//first half no
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			//sec half no
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}


	}


