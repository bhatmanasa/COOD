package edu.neu.csye6200;

public class BrakeJobTaskFactory extends AbstractTaskFactory{
	public AbstractTask instance;
	
	public BrakeJobTaskFactory(){
		instance = null;
	}
	
	
	
	@Override
	public AbstractTask getObject() {
		if (instance ==null) {
        	return new BreakJob();
        }else {
        	return null;
        }
	}

	@Override
	public AbstractTask getObject(String csvData) {
		if (instance ==null) {
        	return new BreakJob(csvData);
        }else {
        	return null;
        }
	}
}
