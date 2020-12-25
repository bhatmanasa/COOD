package edu.neu.csye6200;


public class LibraryItem extends AbstractLibraryMaterialAPI{
private int libid;
private String libtitle;
private String libauth;
private String libcat;
private String libsub;
private String libisbn;
private double libprice;

public LibraryItem() {
	super();
}
public LibraryItem(int libid, String libcat, String libtitle, String libauth, String libsub, String libisbn,
		Double libprice) {
	super();
	this.libid = libid;
	this.libtitle = libtitle;
	this.libauth = libauth;
	this.libcat = libcat;
	this.libsub = libsub;
	this.libisbn = libisbn;
	this.libprice = libprice;
}
public LibraryItem(String csvlib) {
	super();
	String[] libdata = csvlib.split(",");
	/**
	 * Parse CSV data 
	 */
	if (7 == libdata.length) {
	
		this.libid = Integer.parseInt(libdata[0]);
		this.libcat = libdata[1];
		this.libtitle = libdata[2];
		this.libauth = libdata[3];
		this.libsub = libdata[4];
		this.libisbn = libdata[5];
		this.libprice = Double.parseDouble(libdata[6]);
	}
	}

	@Override
	public int getId() {
		return this.libid;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.libtitle;
	}

	@Override
	public String getAuthor() {
		return this.libauth;
	}

	@Override
	public String getCategory() {
		return this.libcat;
	}

	@Override
	public String getSubject() {
		return this.libsub;
	}

	@Override
	public String getIsbn() {
		return this.libisbn;
	}

	@Override
	public double getPrice() {
		return this.libprice;
	}
	@Override
	public String toString() {
		return "\""+this.libid+","+libcat+","+libtitle+","+libauth+","+libsub+","+libisbn+","+libprice+"\"";
	}
}
