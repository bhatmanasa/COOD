package edu.neu.csye6200;

import java.util.Comparator;

public class LibraryItemSortByAuthor implements Comparator<AbstractLibraryMaterialAPI> {


	@Override
	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		return o1.getAuthor().compareTo(o2.getAuthor());
	}

}
