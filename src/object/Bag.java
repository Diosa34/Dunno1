package object;

import java.util.ArrayList;

public class Bag extends ArrayList<Money> {
    private boolean nodule;

    public void open(){
        this.nodule = true;
    }

    public void close(){
        this.nodule = false;
    }

    public boolean getNodule(){
        return this.nodule;
    }
}
