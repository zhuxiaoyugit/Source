package com.zxy.domain;

public class Teachers {
	private Integer id;
	private String studentName;
	private Integer teacherId;
	private String grade;
	private String createDate;
	private String undoWork;

	public String getUndoWork() {
		return undoWork;
	}

	public void setUndoWork(String undoWork) {
		this.undoWork = undoWork;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
