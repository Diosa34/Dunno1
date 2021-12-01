package Persons;

import Persons.Character;

public final class Miga extends Character implements Caller, Sociable {
    private Place place = null;
    private int sociability = 0;

    public Miga() {
        super("Persons.Miga");
    }

    public void moveTo(Place place){
        this.place = place;
    }

    public Place getPlace(){
        return this.place;
    }

    @Override
    public int getSociability() {
        return this.sociability;
    }

    @Override
    public void setSociability(int n) {
        this.sociability = n;
    }
}
