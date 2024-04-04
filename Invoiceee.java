import java.util.Scanner;

class Invoice {
    String part_number;
    String part_description;
    int item_quantity;
    double item_price;

    public Invoice(String part_number, String part_description, int item_quantity, double item_price) {
     //This is the best way to initialize rather the set and get methods require to be invoked so as to work as we seek unless the constructor sets the defalut values of the instance variables
        /*
        this.part_number = part_number;
        this.part_description = part_description;
        if (item_quantity < 0) {
            item_quantity = 0;
        }
        this.item_quantity = item_quantity;
        if (item_price < 0) {
            item_price = 0.0;
        }
        this.item_price = item_price;
        */
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public void setItem_quantity(int item_quantity) {
        if (item_quantity < 0) {
            this.item_quantity = 0;
        }
        this.item_quantity = item_quantity;
    }
    public void setItem_price(double item_price) {
        if (item_price < 0) {
            this.item_price = 0.0;
        }
        this.item_price = item_price;
    }
    public String getPart_number() {
        return part_number;
    }
    public String getPart_description() {
        return part_description;
    }
    public int getItem_quantity() {
        return item_quantity;
    }

    public double getItem_price() {
        return item_price;
    }

    double getInvoiceAmount() {
        double invoice_amount;
        invoice_amount = item_quantity * item_price;
        return invoice_amount;
    }
}

public class Invoiceee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter invoice details repectively");
        String part_number = input.nextLine();
        String discription = input.nextLine();
        int qty = input.nextInt();
        double price = input.nextDouble();

        //Invoice invoice_obj =new Invoice(1223, "laptop", 3, 1000); //This is not from the userr 
        Invoice invoice_obj = new Invoice(part_number, discription, qty, price);
        //This is needed when we use the set methods to initialize the instance variables
        // invoice_obj.setItem_quantity(5);
        // invoice_obj.setItem_price(100);
        System.out.println("Invoice Amount: " + invoice_obj.getInvoiceAmount());

        input.close();
    }
}