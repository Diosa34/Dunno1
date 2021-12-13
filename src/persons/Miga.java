package persons;

import abstracts.Caller;
import abstracts.Character;
import abstracts.Place;
import abstracts.Sociable;

public final class Miga extends Character implements Caller, Sociable {
    private Place place = null;
    private int sociability = 0;

    public Miga() {
        super("Мига");
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

    @Override
    public String toString() {
        return String.format("Герой %s с уровнем коммуникабельности: %s", this.getName(), this.getSociability());
    }
}
