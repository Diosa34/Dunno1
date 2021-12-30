package korotishkies;

import abstracts.Place;
import abstracts.State;

import java.util.ArrayList;

public abstract class KorotishkaGroup {
    private Place where;
    private State state;
    private ArrayList<Korotishka> korotishkies;

    protected KorotishkaGroup(Place place, State state){
        this.where = place;
        this.state = state;
        this.korotishkies = new ArrayList<Korotishka>();
        this.fill();
    }

    protected abstract void fill();

    public void removeKorotishkies(Korotishka korotishka) throws KorotishkaNotFound{
        for(Korotishka element: korotishkies) {
            if (element == korotishka){
                korotishkies.remove(element);
                element.setGroup(null);
                return;
            }
        }
        throw new KorotishkaNotFound();
    }

    public void addKorotishkies(Korotishka korotishka) {
        if (korotishka == null){
            throw new KorotishkaIsNotAddedException();
        }
        korotishkies.add(korotishka);
        korotishka.setGroup(this);
    }

    public State getState() {
        return this.state;
    }

    public int getCount(){
        return this.korotishkies.size();
    }

    public boolean contains(Korotishka korotishka){
        return (this.korotishkies.contains(korotishka));
    }

    public Place getWhere() {
        return where;
    }
}
