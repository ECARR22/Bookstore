package ie.groupproject;

import java.text.NumberFormat;

public class item {

    public int length;
    private String titles;
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public item(String titles, String code, String description, double price, int count ){
        setAuthor(titles);
        setCode(code);
        setDescription(description);
        setPrice(price);
        count++;

    }

   public item() {
        description = "";
        code = "";
        titles = "";
        price = 0.0;
        count++;
    }


    public void setAuthor(String author) {
        this.titles = author;
    }

    public String getAuthor() {
        return titles;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    /*public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }*/

   /* public String toString() {
        return description + " by " + titles;
    }*/

    public static int getCount() {
        return count;
    }
}
