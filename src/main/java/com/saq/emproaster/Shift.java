package com.saq.emproaster;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Shift implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.saq.emproaster.ShiftDate shiftDate;
	private int requiredEmployeeSize;

	public Shift() {
	}

	public com.saq.emproaster.ShiftDate getShiftDate() {
		return this.shiftDate;
	}

	public void setShiftDate(com.saq.emproaster.ShiftDate shiftDate) {
		this.shiftDate = shiftDate;
	}

	public int getRequiredEmployeeSize() {
		return this.requiredEmployeeSize;
	}

	public void setRequiredEmployeeSize(int requiredEmployeeSize) {
		this.requiredEmployeeSize = requiredEmployeeSize;
	}

	public Shift(com.saq.emproaster.ShiftDate shiftDate,
			int requiredEmployeeSize) {
		this.shiftDate = shiftDate;
		this.requiredEmployeeSize = requiredEmployeeSize;
	}

}