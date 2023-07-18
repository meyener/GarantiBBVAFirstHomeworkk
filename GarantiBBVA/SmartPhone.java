public class SmartPhone extends Phone {

    private String storage;
    private String camera;
    private String ram;

    
    public SmartPhone() {
        super();
    }


    public SmartPhone(int id, int price, String name, String phoneNumber, String storage, String camera, String ram) {
        super(id, price, name, phoneNumber);
        this.storage = storage;
        this.camera = camera;
        this.ram = ram;
    }


    public String getStorage() {
        return storage;
    }


    public void setStorage(String storage) {
        this.storage = storage;
    }


    public String getCamera() {
        return camera;
    }


    public void setCamera(String camera) {
        this.camera = camera;
    }


    public String getRam() {
        return ram;
    }


    public void setRam(String ram) {
        this.ram = ram;
    }

    

    
}
