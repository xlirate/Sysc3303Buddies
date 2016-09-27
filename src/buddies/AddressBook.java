package buddies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AddressBook {
	private Set<BuddyInfo> Buddies;
	
	public AddressBook(Collection<BuddyInfo> c){
		Buddies = new HashSet<BuddyInfo>(c);
	}
	public AddressBook(){
		this(Collections.emptyList());
	}
	
	public boolean addBuddy(BuddyInfo b){
		return Buddies.add(b);
	}
	
	public boolean removeBuddy(BuddyInfo b){
		return Buddies.remove(b);
	}
	
	public static void main(String args[]){
		System.out.println("AddressBook");
		System.out.println("Edited on GitHub");
		AddressBook ab = new AddressBook();
		BuddyInfo buddy = new BuddyInfo("Bob",null,"123");
		ab.addBuddy(buddy);
		ab.removeBuddy(buddy);
	}
}
