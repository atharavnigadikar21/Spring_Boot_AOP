package in.sp.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class SpringBootConfig {
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("Pruthiviraj pawar");
		std.setRollNo(007);
		return std;
	}
	@Bean  
	public Student createStdObj2() {
		Student std = new Student();
		std.setName("viraj pawar");
		std.setRollNo(69);
		return std;
	}
}
