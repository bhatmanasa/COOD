package edu.neu.csye6200;
import java.util.*;

public class TimeSheet extends AbstractTimeSheet{
	private List<AbstractTask> tasks = new ArrayList<>();
	
	public TimeSheet() {
		super();
	}

	public TimeSheet(int timesheetOwnerId, int timesheetHours, String timesheetOwnerName, String timesheetDescription) {
		super(timesheetOwnerId, timesheetHours, timesheetOwnerName, timesheetDescription);
	}
	
	@Override
	public void add(AbstractTask t) {
	this.tasks.add(t);
	  int timeadd =getTimesheetHours();
	  timeadd+=t.getFlatRateHours();
	  setTimesheetHours(timeadd);		
	}

	@Override
	public void clear() {
	this.tasks.clear();
	setTimesheetHours(0);
	}

	@Override
	public void remove(String taskName) {
	  for (AbstractTask i: tasks) {
		  if(i.getTaskName()==taskName) {
			  int time =getTimesheetHours();
			  time-=i.getFlatRateHours();
			  setTimesheetHours(time);
			  this.tasks.remove(i);
		  }
	  }
		
	}


	@Override
	public void remove(AbstractTask task) {
		  int timerem =getTimesheetHours();
		  timerem-=task.getFlatRateHours();
		  setTimesheetHours(timerem);	
	 tasks.remove(task);
		
	}

	@Override
	public void show() {
		System.out.println("TimeSheet display \nOwner ID: "+getTimesheetId()+"Owner name = "+getTimesheetOwnerName()+"Time sheet hours = "+getTimesheetHours());
		
	}

}
