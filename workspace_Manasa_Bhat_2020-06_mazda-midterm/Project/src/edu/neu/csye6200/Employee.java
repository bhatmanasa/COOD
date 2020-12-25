package edu.neu.csye6200;

import java.util.Scanner;
import java.util.*;

public class Employee extends Person{
	
	private int employeeId;
    private double  wage;
	private AbstractTaskFactory taskFactory = null;
	private AbstractTimesheetFactory   timesheetFactory = null;
	private TimeSheet timeSheet;
	private List<AbstractTask> list1 = new ArrayList<>();
	public Employee() {
		super();
	}
	public Employee(int personid, int personage, String personfirstname, String personlastname) {
		super(personid, personage, personfirstname, personlastname);
	}
	public Employee(int personid, int personage, String personfirstname, String personlastname, int employeeId,
			double wage, AbstractTaskFactory taskFactory, AbstractTimesheetFactory timesheetFactory,
			TimeSheet timeSheet) {
		super(personid, personage, personfirstname, personlastname);
		this.employeeId = employeeId;
		this.wage = wage;
		this.taskFactory = taskFactory;
		this.timesheetFactory = timesheetFactory;
		this.timeSheet = timeSheet;
	}
	public Employee(String csvData) {
		Scanner scan = new Scanner(csvData);
		scan.useDelimiter(",");
		setPersonid(scan.nextInt());
		setPersonage(scan.nextInt());
		setPersonfirstname(scan.next());
		setPersonlastname(scan.next());
		setEmployeeId(scan.nextInt());
		setWage(scan.nextDouble());
		
		scan.close();
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public AbstractTaskFactory getTaskFactory() {
		return taskFactory;
	}
	public void setTaskFactory(AbstractTaskFactory taskFactory) {
		this.taskFactory = taskFactory;
	}
	public AbstractTimesheetFactory getTimesheetFactory() {
		return timesheetFactory;
	}
	public void setTimesheetFactory(AbstractTimesheetFactory timesheetFactory) {
		this.timesheetFactory = timesheetFactory;
	}
	public TimeSheet getTimeSheet() {
		return timeSheet;
	}
	public void setTimeSheet(TimeSheet timeSheet) {
		this.timeSheet = timeSheet;
	}
	
	public void add(AbstractTask task) {
		list1.add(task);
	}
/*	public void execute()) {
		for(AbstractTask t : list1) {
			t.add();
		}
	}*/
	
    public static void demo() {
			 System.out.println("\n\t" + Employee.class.getName() + ".demo()...");
			  
			 Employee obj = new Employee("1,17,Dan,Peters,101,20.0");
			 System.out.println(obj);
             
			 // add employee Timesheet Factory (TimeSheetFactory) to Employee object...
			 System.out.println("add employee Timesheet Factory (TimeSheetFactory) to Employee object...");
			 AbstractTimesheetFactory timesheetFactory = new TimeSheetFactory();

			 // use Timesheet Factory to add employee Timesheet to Employee object... 
			 System.out.println("use Timesheet Factory to add employee Timesheet to Employee object...");
			 obj.setTimeSheet(timesheetFactory.getObject("2400,2,Mark,TimesheetofMark"));
			 
			 // add employee Task Factory  (BrakeJobTaskFactory) to Employee object...
			 System.out.println("add employee Task Factory  (BrakeJobTaskFactory) to Employee object...");
			 AbstractTaskFactory taskFactory = new BrakeJobTaskFactory();
			 obj.add(taskFactory.getObject("1,15,BrakeOverhaul,Replace Brake Pads and Rotors"));
			obj.add(taskFactory.getObject("2,35,BreakLineRebuild,Replace Brake Lines"));
			 obj.add(taskFactory.getObject("3,10,Pads,Replace Disc Brake Pads"));
			obj.add(taskFactory.getObject("4,5,BrakeInspection,Inspect Brakes and Pad Thickness"));
//			obj.execute();
			 // use employee Task factory to add all tasks to Employee Timesheet...
			 System.out.println("use employee Task factory to add all tasks to Employee Timesheet...");
			 TimeSheet ts = obj.getTimeSheet();
			  ts.add(taskFactory.getObject("1,15,BrakeOverhaul,Replace Brake Pads and Rotors"));
				ts.add(taskFactory.getObject("2,35,BreakLineRebuild,Replace Brake Lines"));
				 ts.add(taskFactory.getObject("3,10,Pads,Replace Disc Brake Pads"));
				ts.add(taskFactory.getObject("4,5,BrakeInspection,Inspect Brakes and Pad Thickness"));
			 obj.setTimeSheet(ts);
			 // show employee timesheet...
			 System.out.println("\n show employee timesheet...");
			 TimeSheet tshow = obj.getTimeSheet();
			 tshow.show();
			 // show employee productivity details...
			 System.out.println("\n show employee productivity details...");
			 TimeSheet tstot = obj.getTimeSheet();
			 int totalTimesheetHours = tstot.getTimesheetHours();
			 double employeeWage = obj.getWage();
			 System.out.println("TOTAL HOURS: " + totalTimesheetHours);
			 System.out.println("TOTAL EARNINGS: $" + totalTimesheetHours * employeeWage);

			 System.out.println("\n\t" + Employee.class.getName() + ".demo()... done!");
	}
}
