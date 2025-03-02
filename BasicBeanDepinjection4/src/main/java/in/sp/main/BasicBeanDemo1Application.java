package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Student;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BasicBeanDemo1Application {

public static void main(String[] args) {
	
	ApplicationContext context = SpringApplication.run(BasicBeanDemo1Application.class, args);
			 Student std1 = (Student)context.getBean("student");
			 
			 std1.display();
			 
			 
	}
}
