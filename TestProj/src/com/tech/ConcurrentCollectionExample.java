package com.tech;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.TimeUnit;

public class ConcurrentCollectionExample extends Thread {
	public static ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<>();
	public void run() {
	//	System.out.println(" run called by thread : "+Thread.currentThread().getName());
		try {
			System.out.println("modifying map object by child thread : ---------- ");
			Thread.sleep(2000);
			throw new InterruptedException();
			//System.out.println("iteration and modification happen at a time total map is : "+map);
		}catch(InterruptedException ie) {
			map.put("Ram", 103);	
			System.out.println("iteration and modification happen at a time total map is : "+map);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //   ConcurrentHashMap<K, V>
	Thread th=new ConcurrentCollectionExample();	
	//	System.out.println(" main thread started name is  "+Thread.currentThread().getName());
		map.put("Krishn", 101);
		map.put("Radha", 102);
		// iterate from map (while iterate also start update from child thread
		th.start();
	       Set<Entry<String, Integer>>   setOfEntry =map.entrySet();
     // KeySetView<String, Integer> 	itr=((KeySetView<String, Integer>) keys).iterator();
	       map.entrySet().forEach( entry -> System.out.println(" maped key : "+entry.getKey() + " maped value : "+entry.getValue()));
	    Iterator   entry=setOfEntry.iterator();
   System.out.println("main thread started iteration : ---- ");
	while(entry.hasNext()) {
            Object obj    =entry.next();
       System.out.println("key and value is : "+obj.toString());
	}
	//System.out.println("iteration and modification happen at a time total map is : "+map);
	}

}
