package beanpojo;

import java.util.ArrayList;
import java.util.List;

public class collectionExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		List lit = new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		list.add("pqr");
		list.add("vrc");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		list.add("k");
		list.add("l");
		list.add("m");
		list.add("n");
		list.add("o");
		list.add("p");
		list.add("q");
		list.add("r");
		list.add("s");
		list.add("t");
		list.add("u");
		list.add("v");
		list.add("w");
		list.add("x");
		list.add("y");
		list.add("z");
		list.add("x");
		list.add("y");
		list.add("z");
		list.add("Jackie Chan");
		list.add("Akshay Kumar");
		
		
		
		
		System.out.println(list);
		
	
		for (int i = 0; i < list.size(); i++) {
			if(!lit.contains(list.get(i)))
				lit.add(list.get(i));
			
		}
		System.out.println(lit);
		
		
		//Collections.sort(list);
//		System.out.print(list);
		
		/*Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		/*for(Object str:list)
		{
			System.out.println(str);
		}*/
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}
		int j=list.size();
		//System.out.println(j);
				
		for( int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
		
		
		
		

	}

}
