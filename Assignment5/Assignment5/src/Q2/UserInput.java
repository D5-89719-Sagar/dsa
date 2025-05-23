package Q2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UserInput {
	public static void findoccurrences(String str){ 
		String[] arr=str.split(" ");
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				
				int value=hmap.get(arr[i]);
				hmap.put(arr[i],++value);
			}else {
				
				hmap.put(arr[i],1);
			}
		}

		
		Set<Entry<String,Integer>>map=hmap.entrySet();
		for(Entry<String,Integer> m:map) {
		    System.out.print(m.getKey()+"->");
		    System.out.println(m.getValue());
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String ");
	String str=sc.nextLine();
	findoccurrences(str);
}
}
