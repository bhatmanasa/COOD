package edu.neu.csye6200;
import java.util.*;
import java. util.List;

public class Library extends AbstractStoreAPI{
private List<AbstractLibraryMaterialAPI> items = new ArrayList<AbstractLibraryMaterialAPI>();
@Override
	public void add(AbstractLibraryMaterialAPI e) {
		 items.add(e);
	}

	@Override
	public void sortInventory() {
		this.items.sort(null);
	}

	@Override
	public void sortInventory(Comparator<AbstractLibraryMaterialAPI> c) {
		this.items.sort(c);
	}

	@Override
	public void showInventory() {
		System.out.println(this);
	}
	
	public String toString() {
	StringBuilder sb = new StringBuilder();
			for(AbstractLibraryMaterialAPI i : items) {
		//	System.out.println(i);
		    sb.append(i);
		    sb.append("\n");
			}
		return sb.toString();
		}
	public static void demo() {
	 	System.out.println("\n\t" + Library.class.getName() + ".demo()...");
		
		Library obj = new Library();
		// Add items to library
		obj.add(new LibraryItem("3,DVD,Java Easy,Adam Peterson,Science,212-217237711-7,7.49"));
		obj.add(new LibraryItem("1,BOOK,My Chosen Career,Daniel Peters,Non-Fiction,212-217237718-7,2.49"));
		obj.add(new LibraryItem("2,CD,Born Free,Sam Jones,Non-Fiction,212-217237713-7,11.49"));
		System.out.println("Sort inventory by item TITLE.");
		obj.sortInventory();
		obj.showInventory();
		System.out.println("Sort inventory by item ID.");
		obj.sortInventory(new LibraryItem());
		obj.showInventory();
		System.out.println("Sort inventory by item CATEGORY.");
		obj.sortInventory(new LibraryItemSortByCategory());
		obj.showInventory();
		System.out.println("Sort inventory by item AUTHOR.");
		obj.sortInventory(new LibraryItemSortByAuthor());
		obj.showInventory();
		System.out.println("Sort inventory by item SUBJECT.");
		obj.sortInventory(new LibraryItemSortBySubject());
		obj.showInventory();
		System.out.println("Sort inventory by item ISBN.");
		obj.sortInventory(new LibraryItemSortByISBN());
		obj.showInventory();
		System.out.println("Sort inventory by item PRICE.");
		obj.sortInventory(new LibraryItemSortByPrice());
		obj.showInventory();
		System.out.println("\n\t" + Library.class.getName() + ".demo()...done!!!");
	}


}
