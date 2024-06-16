package org.vikhyat.model.people;

public class Player extends Person{
    public Player(String name){
        super(name);
    }

    private PlayerResponsibility playerResponsibility;
    private PlayerType playerType;
}
