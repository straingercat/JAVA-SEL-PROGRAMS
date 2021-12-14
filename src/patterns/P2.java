package patterns;

public class P2 {

	public static void main(String[] args) {
		int n=5;
		int p;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("4");
			}
			System.out.println();
	}

}
}