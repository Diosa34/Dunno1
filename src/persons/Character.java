package persons;

public abstract class Character {
    private final String name;

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
