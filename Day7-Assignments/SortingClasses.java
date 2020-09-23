package demo;

import java.util.Comparator;

public class SortingClasses {

	class sortByItemIdAscending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return o1.getItemId() - o2.getItemId();
		}
	}
	class sortByItemIdDescending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return o2.getItemId()-o1.getItemId();
		}
	}
	class sortByItemNameAscending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	class sortByItemNameDescending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return o2.getName().compareTo(o1.getName());
		}
	}
	class sortByItemPriceAscending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return (int) (o1.getPrice() - o2.getPrice());
		}
	}
	
	class sortByItemPriceDescending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return (int) (o2.getPrice() -o1.getPrice());
		}
	}
	class sortByItemRatingsAscending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return (int) (o1.getRatings() - o2.getRatings());
		}
	}
	
	class sortByItemRatingsDescending implements Comparator<Item>{
		@Override
		public int compare(Item o1, Item o2) {
			return (int) (o2.getRatings()-o1.getRatings());
		}
	}
	
}
