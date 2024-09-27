public class BuddyInfo {

    // Attributes
    private String name;

    private String address;


    private String phoneNumber;

    // Default Constructor
    public BuddyInfo(){
        this(null, null, "0000000");
    }

    // Overloaded Constructor
    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo info = new BuddyInfo("Jared", "232 falconia ave", "34162086");
        System.out.println("Hello " + info.getName());
    }
}
