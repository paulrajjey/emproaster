package com.saq.emproaster;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ShiftOffRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.saq.emproaster.Employee employee;
	private com.saq.emproaster.Shift shift;
	private int weight;

	public ShiftOffRequest() {
	}

	public com.saq.emproaster.Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(com.saq.emproaster.Employee employee) {
		this.employee = employee;
	}

	public com.saq.emproaster.Shift getShift() {
		return this.shift;
	}

	public void setShift(com.saq.emproaster.Shift shift) {
		this.shift = shift;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public ShiftOffRequest(com.saq.emproaster.Employee employee,
			com.saq.emproaster.Shift shift, int weight) {
		this.employee = employee;
		this.shift = shift;
		this.weight = weight;
	}

}