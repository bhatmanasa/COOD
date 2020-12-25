package edu.neu.csye6200;

import java.util.Comparator;

/**
 * All materials (book, periodical, CD, DVD, etc.) in library derive from this
 * class.
 * 
 * @author dpeters
 *
 */
public abstract class AbstractLibraryMaterialAPI  implements Comparable<AbstractLibraryMaterialAPI>,Comparator<AbstractLibraryMaterialAPI>{
	
	/**
	 * ID of the library material
	 * 
	 * @return	integer identification code
	 */
	public abstract int getId();

	/**
	 * Title of the library material
	 * 
	 * @return	String title
	 */
	public abstract String getTitle();

	/**
	 * Author of the library material
	 * 
	 * @return	String name of the author
	 */
	public abstract String getAuthor();

	/**
	 * Category of the library material
	 * 
	 * @return	String category (book, CD, DVD, etc.)
	 */
	public abstract String getCategory();

	/**
	 * subject of the library material
	 * 
	 * @return	String subject code (Arts, Fiction, Non-Fiction, History, Science, Reference, etc.)
	 */
	public abstract String getSubject();

	/**
	 * ISBN code of the library material
	 * 
	 * @return	String ISBN code
	 */
	public abstract String getIsbn();
	
	/**
	 * Sale Price of the library material
	 * 
	 * @return	double precision floating point price in dollars.
	 */
	public abstract double getPrice();
	@Override
	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		return Double.compare(o1.getId(),o2.getId());
	}
	@Override
	public int compareTo(AbstractLibraryMaterialAPI o) {
		return this.getTitle().compareTo(o.getTitle());
	}
}
