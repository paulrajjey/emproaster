package com.saq.emproaster;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String code;
	private java.lang.String name;

	private com.saq.emproaster.Contract contract;

	private java.util.List<com.saq.emproaster.DayOffRequest> dayOffRequests;

	private java.util.List<com.saq.emproaster.DayOnRequest> dayOnRequests;

	private java.util.List<com.saq.emproaster.ShiftOffRequest> shiftOffRequests;

	private java.util.List<com.saq.emproaster.ShiftOnRequest> shiftOnRequests;
	
	private Set<Skill> skills = new TreeSet<>();


	public Employee() {
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public com.saq.emproaster.Contract getContract() {
		return this.contract;
	}

	public void setContract(com.saq.emproaster.Contract contract) {
		this.contract = contract;
	}

	public java.util.List<com.saq.emproaster.DayOffRequest> getDayOffRequests() {
		return this.dayOffRequests;
	}

	public void setDayOffRequests(
			java.util.List<com.saq.emproaster.DayOffRequest> dayOffRequests) {
		this.dayOffRequests = dayOffRequests;
	}

	public java.util.List<com.saq.emproaster.DayOnRequest> getDayOnRequests() {
		return this.dayOnRequests;
	}

	public void setDayOnRequests(
			java.util.List<com.saq.emproaster.DayOnRequest> dayOnRequests) {
		this.dayOnRequests = dayOnRequests;
	}

	public java.util.List<com.saq.emproaster.ShiftOffRequest> getShiftOffRequests() {
		return this.shiftOffRequests;
	}

	public void setShiftOffRequests(
			java.util.List<com.saq.emproaster.ShiftOffRequest> shiftOffRequests) {
		this.shiftOffRequests = shiftOffRequests;
	}

	public java.util.List<com.saq.emproaster.ShiftOnRequest> getShiftOnRequests() {
		return this.shiftOnRequests;
	}

	public void setShiftOnRequests(
			java.util.List<com.saq.emproaster.ShiftOnRequest> shiftOnRequests) {
		this.shiftOnRequests = shiftOnRequests;
	}
	
	public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Employee addSkill(Skill skill) {
        getSkills().add(skill);
        return this;
    }

    public Employee removeSkill(Skill skill) {
        getSkills().remove(skill);
        return this;
    }

	public Employee(
			java.lang.String code,
			java.lang.String name,
			com.saq.emproaster.Contract contract,
			java.util.List<com.saq.emproaster.DayOffRequest> dayOffRequests,
			java.util.List<com.saq.emproaster.DayOnRequest> dayOnRequests,
			java.util.List<com.saq.emproaster.ShiftOffRequest> shiftOffRequests,
			java.util.List<com.saq.emproaster.ShiftOnRequest> shiftOnRequests) {
		this.code = code;
		this.name = name;
		this.contract = contract;
		this.dayOffRequests = dayOffRequests;
		this.dayOnRequests = dayOnRequests;
		this.shiftOffRequests = shiftOffRequests;
		this.shiftOnRequests = shiftOnRequests;
	}

}