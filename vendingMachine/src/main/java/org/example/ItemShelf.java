package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemShelf {
    private Item item;
    private int code;
    private boolean isSoldOut;

}
