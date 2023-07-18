public class Phone extends Product {

    private String phoneNumber;
    
    public Phone() {
        super();
    }

    public Phone(int id, int price, String name, String phoneNumber) {
        super(id, price, name);
        this.phoneNumber = phoneNumber;
    }
        
    //TODO Auto-generated constructor 
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    }

    
    

