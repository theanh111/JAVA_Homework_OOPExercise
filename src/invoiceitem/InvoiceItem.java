package invoiceitem;

public class InvoiceItem {
    private String id;
    private String description;
    private int qty;
    private double unitPrice;

    public InvoiceItem() {
    }

    public InvoiceItem(String id, String description, int qty, double unitPrice) {
        this.id = id;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem {" +
                "id = '" + id + '\'' +
                ", description = '" + description + '\'' +
                ", qty = " + qty +
                ", unitPrice = " + unitPrice +
                '}';
    }
}
