package in.sp.main.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	@Value ("atharav nigadikar")
	private String name;
	 @Value ("101")
	private int rollNo;
	
	public void display() {
		System.out.println("Atharav Heelo");
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	
}
