package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    ItemType itemType;
    int price;

    public Item(ItemType itemType, int price){
        this.itemType = itemType;
        this.price = price;
    }
}
