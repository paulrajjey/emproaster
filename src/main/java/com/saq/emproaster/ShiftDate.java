package com.saq.emproaster;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ShiftDate implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int dayIndex;
	private java.lang.String dateString;

	public ShiftDate() {
	}

	public int getDayIndex() {
		return this.dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

	public java.lang.String getDateString() {
		return this.dateString;
	}

	public void setDateString(java.lang.String dateString) {
		this.dateString = dateString;
	}

	public ShiftDate(int dayIndex, java.lang.String dateString) {
		this.dayIndex = dayIndex;
		this.dateString = dateString;
	}

}