package abstracts;

public abstract class Character {
    private final String name;
//    private Place where = null;

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

//    public Place getWhere(){return this.where;}
//
//    public void setWhere(Place place){this.where = place;}

    @Override
    public String toString(){
        return String.format("Герой по имени %s", this.getName());
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public boolean equals(Character o) {
        return (o != null && this.name.equals(o.name));
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
