package in.sp.main.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("21212")
	private int houseNo;
	@Value("Pune")
	private String city;
	@Value("411041")
	private  int pinCode;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {  
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	
}
