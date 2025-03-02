package in.sp.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Address;
import in.sp.main.beans.Student;

@Configuration
public class SpringBootConfig {
	
	Address createAddrObj() {
		Address add = new Address();
		add.setCity("Satara");
		add.setHouseNo(10101);
		add.setPinCode(412802);
		return add;
	}
	@Bean
	Student createStdObj() {
		Student std = new Student();
		std.setName("Pruthiviraj pawar");
		std.setRollNo(007);
		std.setAddress(createAddrObj());
		return std;
	}
	
}
