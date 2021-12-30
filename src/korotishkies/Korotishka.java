package korotishkies;

public class Korotishka {
    private KorotishkaGroup group;

    public Korotishka(KorotishkaGroup group){
        this.group = group;
    }

    public void setGroup(KorotishkaGroup group){
        if (this.group != null && group != this.group){
            try{
                this.group.removeKorotishkies(this);
            } catch(KorotishkaNotFound exception){}
        }
        this.group = group;
        if (! this.group.contains(this)){
            this.group.addKorotishkies(this);
        }
    }
}
