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
		itemSet.add(new Item(4,"Tshirt",300,3));
		
		Iterator<Item> iterator = itemSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		List<Item> itemList = new ArrayList<Item>(itemSet); 
		Collections.sort(itemList);
		System.out.println(itemList);
		
		SortingClasses sortingClasses = new SortingClasses();
		
		System.out.println("----------Sorting in ascending order by Item Id-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemIdAscending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in descending order by Item Id-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemIdDescending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in ascending order by Item Name-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemNameAscending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in descending order by Item Name-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemNameDescending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in ascending order by Item Price-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemPriceAscending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in descending order by Item Price-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemPriceDescending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in ascending order by Item Ratings-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemRatingsAscending());
		System.out.println(itemList);
		
		System.out.println("----------Sorting in descending order by Item Ratings-------------");
		Collections.sort(itemList,sortingClasses.new sortByItemRatingsDescending());
		System.out.println(itemList);
		
		
	}


}
