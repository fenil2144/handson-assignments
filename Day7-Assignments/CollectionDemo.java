package demo;

import java.util.*;

public class CollectionDemo {
	
	public static void main(String args[]){
		
		Set<Item> itemSet = new HashSet<Item>();
		itemSet.add(new Item(1,"Purse",1200,2.5));
		itemSet.add(new Item(3,"Jeans",2000,4.5));
		itemSet.add(new Item(2,"Shirt",600,1.5));
		itemSet.add(new Item(5,"Shoes",2500,3.5));
		itemSet.add(new Item(4,"Tshirt",300,3));
		
		Iterator<Item> iterator = itemSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}


}
