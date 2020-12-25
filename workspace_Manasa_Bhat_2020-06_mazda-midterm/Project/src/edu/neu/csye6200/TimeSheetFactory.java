package edu.neu.csye6200;

public class TimeSheetFactory extends AbstractTimesheetFactory{
	public AutoTechTimeSheet instance;
	public TimeSheetFactory(){
		instance = null;
	}

	@Override
	public TimeSheet getObject() {
        if (instance ==null) {
        	return new AutoTechTimeSheet();
        }else {
        	return null;
        }
	}

	@Override
	public TimeSheet getObject(String csvData) {
		// TODO Auto-generated method stub
		return null;
	}

}
