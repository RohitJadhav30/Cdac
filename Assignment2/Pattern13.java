class Pattern13{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=i;z++)
			{
				System.out.print((char)(i+64)+" ");
			
			}
			System.out.println(); 
		
		}
	}
}