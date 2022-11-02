import java.io.*;
class prime
{
	public static void main(String args[]) throws IOException
	{
		int i,j,n,m;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the limit: ");
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		System.out.println("prime nos are: ");
		for(i=n;i<=m;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				break;
			}
			if(i==j)
			System.out.println("   "+i);
		}
	}
}
