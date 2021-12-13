package persons;

import abstracts.Character;

import java.util.HashSet;

public class Population extends HashSet<Character> {

    public Population(Character ... population){
        super();
        for (Character person : population){
            this.add(person);
        }
    }
}
