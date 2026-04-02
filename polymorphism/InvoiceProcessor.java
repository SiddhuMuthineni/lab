class InvoiceProcessor {

   
    public void generateInvoice(String customer, double amount) {
        double finalAmount = calculateAmount(amount);
        System.out.println("Invoice for " + customer);
        System.out.println("Amount: ₹" + finalAmount);
    }

        private double calculateAmount(double amount) {
        return amount; // basic calculation
    }
}

class RetailInvoice extends InvoiceProcessor {

        @Override
    public void generateInvoice(String customer, double amount) {

        double discount = amount * 0.10; // 10% discount
        double finalAmount = amount - discount;

        System.out.println("Retail Invoice for " + customer);
        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }

    }


public class BillingSystem {
    public static void main(String[] args) {

        // Runtime polymorphism
        InvoiceProcessor obj;

        obj = new InvoiceProcessor();
        obj.generateInvoice("John", 1000);

        System.out.println("----------------------");

        obj = new RetailInvoice(); // Parent reference → Child object
        obj.generateInvoice("Alice", 1000);
    }
}