package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Student;

@SpringBootApplication
public class BasicBeanDemo1Application {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(BasicBeanDemo1Application.class, args);
//			Student std = context.getBean(Student.class);
//	Student std = (Student)context.getBean("student");
	Student std = context.getBean("student" ,Student.class);
			std.display();
	}

}
  