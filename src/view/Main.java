package view;

import model.Invoice;
import model.Item;

public class Main {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("Emerson Carvalho");
        invoice.addItem(new Item("Produto A", 2, 50));
        invoice.addItem(new Item("Produto B", 3, 30));
        
        invoice.sendByEmail("emerson@email.com");
    }
}
