import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    // Default Constructor
    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null){
            buddyList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < buddyList.size()) {
            return buddyList.remove(index);
        }
        return null;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tomm", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public ArrayList<BuddyInfo> getBuddyList() {
        return buddyList;
    }
}
