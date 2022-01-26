package beanpojo;

public class pattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3 && j==3)
				{
					System.out.print(" * ");
				}
				if(j==3 && i==3)
				{
					System.out.print(" + ");
				}
				if(j==3 && i== 3)
				{
					System.out.print(" * ");
				}
				if(i==3 && j==4)
				{
					System.out.print(" + ");
				}
				if(i==3  && j==5)
				{
					System.out.print(" * ");
				}
				if(j==3 && i==1)
				{
					System.out.print(" * ");
				}
				if(j==3 && i==2)
				{
					System.out.print(" + ");
				}
				if(j==3 && i==4)
				{
					System.out.print(" + ");
				}
				if(j==3 && i==5)
				{
					System.out.print(" * ");
				}
				
			}
			System.out.println("");
			
			
		}
	}
}
