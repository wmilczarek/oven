package pl.jsolve.oven.stub.person;

import pl.jsolve.oven.annotationdriven.annotation.Map;
import pl.jsolve.oven.annotationdriven.annotation.MappableTo;
import pl.jsolve.oven.annotationdriven.annotation.Mappings;

@MappableTo({ StudentSnapshot.class, StudentDTO.class })
public class Student extends Person {

	@Mappings({
		@Map(to = "semester", of = StudentSnapshot.class),
		@Map(to = "totalSemesters", of = StudentDTO.class) })
	private int semester;

	@Map(of = StudentSnapshot.class)
	private FieldOfStudy fieldOfStudy;

	private Department department;

	public Student() {
	}

	public Student(String firstName, String lastName, int semester, FieldOfStudy fieldOfStudy, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.semester = semester;
		this.fieldOfStudy = fieldOfStudy;
		this.department = department;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public FieldOfStudy getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

}