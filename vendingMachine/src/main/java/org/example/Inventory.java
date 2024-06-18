package org.example;

public class Inventory {
    private ItemShelf[] inventory = null;

    public Inventory(int size){
        inventory = new ItemShelf[size];
        initialiseEmptyShelfs();
    }

    private void initialiseEmptyShelfs(){
        int startCode = 101;

        for (int i = 0; i < inventory.length; i++){
            ItemShelf item = new ItemShelf();
            item.setCode(startCode);
            item.setSoldOut(true);
            startCode++;
        }
    }

    public Item getItem(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid Code");
    }
    public void addItem(Item item, int codeNumber) throws Exception {

        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }






}
