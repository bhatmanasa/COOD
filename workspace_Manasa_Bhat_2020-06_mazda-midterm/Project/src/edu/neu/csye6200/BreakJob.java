package edu.neu.csye6200;

import java.util.Scanner;

public class BreakJob extends Task{
public BreakJob() {
	super();
}
public BreakJob(String csvString) {
		Scanner scan = new Scanner(csvString);
		scan.useDelimiter(",");
		setTaskId(scan.nextInt());
		setFlatRateHours(scan.nextInt());
		setTaskName(scan.next());
		setTaskDescription(scan.next());
		scan.close();
		
	}
}
