package org.example.states;

import org.example.Coin;
import org.example.Item;
import org.example.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int codeNo) throws Exception;
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    public int getChange(VendingMachine machine) throws Exception;
    public void dispenseProduct(VendingMachine machine, int codeNo) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
