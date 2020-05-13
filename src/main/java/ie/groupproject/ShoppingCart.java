package ie.groupproject;

public class ShoppingCart {

    private String name;
    private String address;
    private String price;
    private String shippingCharge;

    public ShoppingCart(String name, String address, String price, String shippingCharge  ) {
        setName(name);
        setAddress(address);
        setPrice(price);
        setShippingCharge(shippingCharge);
    }

   /* public ShoppingCart() {
        name = "";
        address = "";
        price = "";
        shippingCharge = "";
    }*/


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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(String shippingCharge) {
        this.shippingCharge = shippingCharge;
    }
}
