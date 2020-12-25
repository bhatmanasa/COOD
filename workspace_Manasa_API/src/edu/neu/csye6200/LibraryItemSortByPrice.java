package edu.neu.csye6200;

import java.util.Comparator;

public class LibraryItemSortByPrice implements Comparator<AbstractLibraryMaterialAPI> {


	@Override
	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
