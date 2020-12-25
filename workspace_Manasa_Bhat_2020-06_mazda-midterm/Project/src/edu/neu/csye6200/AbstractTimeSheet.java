package edu.neu.csye6200;

import java.util.Scanner;

/**
 * API for each Timesheet to implement
 * 
 * @author dpeters
 *
 */
public abstract class AbstractTimeSheet {
	private int timesheetOwnerId;			// timesheet owner id
	private int timesheetHours;				// total hours for this timesheet
	private String timesheetOwnerName;		// timesheet owner
	private String timesheetDescription;	// timesheet description
	
	public int getTimesheetId() {
		return timesheetOwnerId;
	}
	public void setTimesheetId(int id) {
		this.timesheetOwnerId = id;
	}
	public String getTimesheetOwnerName() {
		return timesheetOwnerName;
	}
	public void setTimesheetOwnerName(String name) {
		this.timesheetOwnerName = name;
	}
	public String getTimesheetDescription() {
		return timesheetDescription;
	}
	public void setDescription(String description) {
		this.timesheetDescription = description;
	}
	public int getTimesheetHours() {
		return timesheetHours;
	}
	public void setTimesheetHours(int hours) {
		this.timesheetHours = hours;
	}
	public AbstractTimeSheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstractTimeSheet(int timesheetOwnerId, int timesheetHours, String timesheetOwnerName,
			String timesheetDescription) {
		super();
		this.timesheetOwnerId = timesheetOwnerId;
		this.timesheetHours = timesheetHours;
		this.timesheetOwnerName = timesheetOwnerName;
		this.timesheetDescription = timesheetDescription;
	}
	public AbstractTimeSheet(String csvString) {
		Scanner scan = new Scanner(csvString);
		scan.useDelimiter(",");
		setTimesheetId(scan.nextInt());
		setTimesheetHours(scan.nextInt());
		setTimesheetOwnerName(scan.next());
		setDescription(scan.next());
		scan.close();
	}
	/**
	 * Add Task and increase the hours worked on timesheet
	 * @param t Task object to add
	 */
	public abstract void add(AbstractTask t);
	/**
	 * Clear (remove) all Task objects and 
	 * set hours worked on timesheet to zero
	 */
	public abstract void clear();
	
	/**
	 * Remove one Task object and 
	 * decrease hours worked on timesheet
	 * @param taskName	name of Task to remove
	 */
	public abstract void remove(String taskName);
	
	/**
	 * Remove one Task object and 
	 * decrease hours worked on timesheet
	 * @param Task	object to remove
	 */
	public abstract void remove(AbstractTask task);

	/**
	 * Show state of TimeSheet
	 * 
	 * (including hours worked on timesheet and all Task objects)
	 */
	public abstract void show();
}
