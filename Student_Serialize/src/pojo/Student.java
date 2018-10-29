package pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer Rollno;
	private String Name;
	private Boolean isIndian;
	
	public Student(){
		super();
		this.Rollno=0;
		this.Name="";
		this.isIndian=null;
	}
	
	public Student(Integer Rollno,String Name,Boolean isIndian){
		super();
		this.Rollno=Rollno;
		this.Name=Name;
		this.isIndian=isIndian;
	}

	public Integer getRollno() {
		return Rollno;
	}

	public void setRollno(Integer rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Boolean getIsIndian() {
		return isIndian;
	}

	public void setIsIndian(Boolean isIndian) {
		this.isIndian = isIndian;
	}

}
