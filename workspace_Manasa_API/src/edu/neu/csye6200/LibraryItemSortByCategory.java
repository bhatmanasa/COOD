package edu.neu.csye6200;

import java.util.Comparator;

/**
 * Comparator to compare Item objects by Item Category attribute.

 */
public class LibraryItemSortByCategory implements Comparator<AbstractLibraryMaterialAPI> {


	@Override
	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		return o1.getCategory().compareTo(o2.getCategory());
	}

}
