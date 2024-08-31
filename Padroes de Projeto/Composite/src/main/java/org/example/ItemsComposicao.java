package org.example;

import java.util.ArrayList;

public class ItemsComposicao extends Items {
    private ArrayList<Items> items = new ArrayList<>();

    @Override
    public Float getValor() {
        float total = 0;
        for (Items item : items) {
            total += item.getValor();
        }
        return total;
    }

    @Override
    public void mostrarItems() {
        for (Items item : items) {
            item.mostrarItems();
        }
    }

    public void addItems(Items item) {
        items.add(item);
    }

    public void removerItem(Items item) {
        items.remove(item);
    }
}
