package beanpojo;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 1;i<5;i++)
		{
			for(int j= 1;j<5;j++)
			{
				System.out.print(" ");
				if((i+j)%2 == 0)
				{
					System.out.print("*");
				}
				System.out.print("+");
			}
			
			
		}

	}

}
