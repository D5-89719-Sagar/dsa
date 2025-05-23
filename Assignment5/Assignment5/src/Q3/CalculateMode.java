package Q3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class CalculateMode {
	public static int calculateMode(int arr[]) {
		if(arr.length==0) {
			return -1;
		}
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				int value=hmap.get(arr[i]);
				hmap.put(arr[i],++value);
			}else {
				hmap.put(arr[i],1);
			}
		}
		int max=Integer.MIN_VALUE;
		int key=-1;
		Set<Entry<Integer,Integer>> set=hmap.entrySet();
		for(Entry<Integer,Integer> s:set) {
			if(s.getValue()>max) {
				max=s.getValue();
				key=s.getKey();
			}
		}
		
		return key;
	}
public static void main(String[] args) {
	int arr[]= {1, 2, 2, 3, 1,3, 3, 2,3};
     int Mode=calculateMode(arr);	
     System.out.println("Mode :"+Mode);
 }
}
