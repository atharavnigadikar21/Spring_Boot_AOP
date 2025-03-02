package in.sp.main.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	
	private String name;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	
	private int rollNo;
	
	public void display() {
		//
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	
}
