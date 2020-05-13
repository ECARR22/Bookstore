package ie.groupproject;

public class Customer {

    private String Name = "";
    private String Address = "";
    private String Id = "";
    private String Password = "";
    private String ShippingPrice = "";


    public Customer(String Name, String Address, String Id, String Password, String ShippingPrice ){
        setName(Name);
        setAddress(Address);
        setId(Id);
        setPassword(Password);
        setShippingPrice(ShippingPrice);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getShippingPrice() {
        return ShippingPrice;
    }

    public void setShippingPrice(String shippingPrice) {
        ShippingPrice = shippingPrice;
    }
}
