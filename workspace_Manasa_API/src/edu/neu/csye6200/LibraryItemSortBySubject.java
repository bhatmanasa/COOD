package edu.neu.csye6200;

import java.util.Comparator;

public class LibraryItemSortBySubject implements Comparator<AbstractLibraryMaterialAPI> {


	@Override
	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		return o1.getSubject().compareTo(o2.getSubject());
	}

}
