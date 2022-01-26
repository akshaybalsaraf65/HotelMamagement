package beanpojo;

import java.util.ArrayList;
import java.util.List;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<>();
		List<Integer> arr1= new ArrayList<>();
		
		arr1.add(1);
		arr1.add(3);
		arr1.add(13);
		arr1.add(3);
		arr1.add(5);
		arr1.add(5);
		
		for(int i=1;i<arr1.size();i++)
		{
			if(!arr.contains(arr1.get(i)))
			{
				arr.add(arr1.get(i));
			}
			System.out.println(arr);
		}
	}

}
