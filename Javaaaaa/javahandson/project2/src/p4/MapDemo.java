package p4;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Long> mp = new HashMap<>();
		mp.put("Delhi", 2500000l);
		mp.put("Chennai", 3000000l);
		mp.put("Mumbai", 4500000l);
		mp.put("Banglore", 5500000l);
		mp.put("Delhi", 1500000l); // for same cityname, it takes only the recent data given, here it takes 15l and not 25l for delhi
		mp.put("Mysore", 3000l);
		
		System.out.println(mp); // Here the Key is unordered
		
		for (String x : mp.keySet()) {
			System.out.println(x+ " : "+ mp.get(x));
		}
		
		System.out.println("----------Using Iterator---------");
		Iterator<String>it = mp.keySet().iterator();
		while(it.hasNext()) {
			String x = it.next();
			System.out.println(x + " : "+ mp.get(x));
		}
		
		System.out.println("---------Using for each, lambda--------");
		
		// mp.forEach(System.out::println); :
		
		mp.forEach((x,y)->{System.out.println(x+ " "+y);});
		
		System.out.println("--------Filters-----------");
		mp.keySet().stream().filter((x)->(mp.get(x)>3000)).forEach((x)->{System.out.println(x + " : "+ mp.get(x));});	
		
		System.out.println("-----------Remove---------");
		mp.remove("Mysore");
		System.out.println(mp);
		
		// COPY ALL CITY TO ANOTHER MAP WHICH IS GREATER THAN 10000
		
//		Map<String, Long> mp1 = mp.keySet().stream().filter((x)->(mp.get(x)>10000)).collect(Collectors.toMap((x)->(mp.get(x))));
		Map<String, Long> mp1 = mp.entrySet().stream().filter((x)->(x.getValue()>10000)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(mp1);
		
		System.out.println("====== Remove =========");
	}

	}