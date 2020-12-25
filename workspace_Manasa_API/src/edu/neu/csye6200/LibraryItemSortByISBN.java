package edu.neu.csye6200;

import java.util.Comparator;

public class LibraryItemSortByISBN implements Comparator<AbstractLibraryMaterialAPI> {


	@Override
	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		return o1.getIsbn().compareTo(o2.getIsbn());
	}

}
