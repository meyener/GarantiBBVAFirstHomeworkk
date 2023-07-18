public class PhoneApp {

    SmartPhone samsung1Phone = new SmartPhone(1, 14000, "Note 20", "555", "256 GB", "12 GB", "16 MP");
    SmartPhone samsung2Phone = new SmartPhone(2, 13000, "Note 21", "555", "128 GB", "16 GB", "100 MP");
    SmartPhone samsung3Phone = new SmartPhone(3, 12000, "Note 22 ULTRA", "555", "256 GB", "12 GB", "16 MP");
    SmartPhone samsung4Phone = new SmartPhone(4, 11000, "Note 23 ", "555", "128 GB", "16 GB", "100 MP");
    SmartPhone samsung5Phone = new SmartPhone(5, 10000, "Note 24 PLUS", "555", "256 GB", "12 GB", "16 MP");
    
    SmartPhone[] smartPhones = { samsung1Phone, samsung2Phone, samsung3Phone, samsung4Phone, samsung5Phone };

    public Double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        Double zero = 0.0;
        for (SmartPhone smartPhone : smartPhoneArray) {
            zero += smartPhone.getPrice();
        }

        return zero;
    }

}
