package merryjane;
import java.util.*;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation 
		HashMap<String,Integer>hm =new HashMap<>();
		//insertion
		hm.put("india", 1);
		hm.put("usa", 2);
		hm.put("china", 3);
		System.out.println(hm);
		System.out.println(hm.get("india"));
		System.out.println(hm.containsKey("usa"));
		hm.remove("china");
		System.out.println(hm);
		hm.put("china", 3);
		hm.put("brit", 4);
		hm.put("brazil", 5);
		hm.put("japan", 6);
		Set<String>keys=hm.keySet();
		for(String k: keys) {
			System.out.println("key:"+k+",value:"+hm.get(k));
		}

		


	}

}
