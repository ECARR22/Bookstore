package ie.groupproject;

public class itemDB {
    public static item getitem(String productCode) {

        item myBook = new item();
        if (productCode.equalsIgnoreCase("java")) {
            myBook.setCode(productCode);
            myBook.setDescription("Learn Python");
            myBook.setPrice(20.00);
            myBook.setAuthor("Joe Brown");
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook.setCode(productCode);
            myBook.setDescription("Learn C++");
            myBook.setPrice(50.50);
            myBook.setAuthor("Evan");
        } else if (productCode.equalsIgnoreCase("Harry Potter")) {
            myBook.setCode(productCode);
            myBook.setDescription("Harry Potter is a series of fantasy novels written by British author J. K. Rowling. ");
            myBook.setPrice(99.99);
            myBook.setAuthor("J. K. Rowling");
        }
        return myBook;
    }
}