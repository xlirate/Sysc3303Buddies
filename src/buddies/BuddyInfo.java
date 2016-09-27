package buddies;

import java.util.Objects;

public class BuddyInfo {
	private String name;
	private String address;
	private String phoneNumber;//phone numbers can be complicated. They can have +s and leading 0s
	
	public BuddyInfo(String name, String address, String phoneNumber){
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		
		if(o instanceof BuddyInfo){
			BuddyInfo b = (BuddyInfo)o;
			return Objects.equals(this.getName(), b.getName()) && 
					Objects.equals(this.getAddress(), b.getAddress()) && 
					Objects.equals(this.getPhoneNumber(), b.getPhoneNumber());
		}else{
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		int h = 0;
		if(this.getName()!=null){
			h += this.getName().hashCode();
		}
		if(this.getAddress()!=null){
			h += this.getAddress().hashCode();
		}
		if(this.getPhoneNumber()!=null){
			h += this.getPhoneNumber().hashCode();
		}
		return h;
	}
	
}
