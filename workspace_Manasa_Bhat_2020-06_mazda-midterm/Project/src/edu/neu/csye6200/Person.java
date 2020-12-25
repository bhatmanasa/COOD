package edu.neu.csye6200;

import java.util.Scanner;

public class Person {
	
private int personid;
private int personage;
private String personfirstname;
private String personlastname;

public Person(int personid, int personage, String personfirstname, String personlastname) {
	super();
	this.personid = personid;
	this.personage = personage;
	this.personfirstname = personfirstname;
	this.personlastname = personlastname;
}
public Person() {
	super();
}
public int getPersonid() {
	return personid;
}
public void setPersonid(int personid) {
	this.personid = personid;
}
public int getPersonage() {
	return personage;
}
public void setPersonage(int personage) {
	this.personage = personage;
}
public String getPersonfirstname() {
	return personfirstname;
}
public void setPersonfirstname(String personfirstname) {
	this.personfirstname = personfirstname;
}
public String getPersonlastname() {
	return personlastname;
}
public void setPersonlastname(String personlastname) {
	this.personlastname = personlastname;
}

public Person (String csvData) {
	Scanner scan = new Scanner(csvData);
	scan.useDelimiter(",");
	setPersonid(scan.nextInt());
	setPersonage(scan.nextInt());
	setPersonfirstname(scan.next());
	setPersonlastname(scan.next());
	scan.close();
	
}

}
