import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapSort {
public static void main(String args[]) {
	Map<Integer,String> hmapSortByKEY=new HashMap<Integer,String>();
	Map<Integer,String> hmapSortByValue=new HashMap<Integer,String>();
	hmapSortByKEY.put(3, "ps");
	hmapSortByKEY.put(1, "as");
	System.out.println("sorting by key");
	Map<Integer,String> TmapSortByKEY=new TreeMap<Integer,String>(hmapSortByKEY);
	for(Map.Entry<Integer,String> tmap:TmapSortByKEY.entrySet()) {
		System.out.println("key "+tmap.getKey()+"value "+tmap.getValue());
	}
	
//SORTING BY VALUE 
	hmapSortByValue.put(3,"Mumbai");
	hmapSortByValue.put(2,"parul");
	hmapSortByValue.put(1,"Ashish");
	
	Set<Map.Entry<Integer,String>> entrySet=new HashSet<Map.Entry<Integer,String>>(hmapSortByValue.entrySet());
	
	List<Map.Entry<Integer,String>> listOfSet=new ArrayList<Map.Entry<Integer,String>>(entrySet);
	
	Collections.sort( listOfSet, new Comparator<Map.Entry<Integer, String>>()
    {
       		@Override
		public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			// TODO Auto-generated method stub
       			
			return (o1.getValue().compareTo(o2.getValue()));
		}
    } );
	
	System.out.println("sorting by Value");
	//Map<Integer,String> TmapSortByKEY=new HashMap<Integer,String>(hmapSortByKEY);
	for(Map.Entry<Integer,String> list:listOfSet) {
		System.out.println("key "+list.getKey()+"value "+list.getValue());
	}
	
	
}
}
