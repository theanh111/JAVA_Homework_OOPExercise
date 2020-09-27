package invoiceitem;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("KIAZ", "This is a invoiceiteam", 4, 5000);
        System.out.println(invoiceItem);
        System.out.println("Total = " + invoiceItem.getTotal());
    }
}
