package model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String customer;
    private List<Item> items = new ArrayList<>();

    public Invoice(String customer) {
        this.customer = customer;
    }

    public boolean addItem(Item item) {
    	return items.add(item);
    }
    
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public String formatInvoice() {
        StringBuilder formattedInvoice = new StringBuilder("Invoice for " + customer + "\n");
        
        for (Item item : items) {
            formattedInvoice.append(item.getName())
                            .append(": ")
                            .append(item.getQuantity())
                            .append(" x ")
                            .append(item.getPrice())
                            .append(" = ")
                            .append(item.getQuantity() * item.getPrice())
                            .append("\n");
        }
        
        formattedInvoice.append("Total: ").append(calculateTotal());
        
        return formattedInvoice.toString();
    }

    public void sendByEmail(String email) {
        String formattedInvoice = formatInvoice();
        
        // Simulando envio de email
        System.out.println("Sending invoice to " + email + ":\n" + formattedInvoice);
    }
}
