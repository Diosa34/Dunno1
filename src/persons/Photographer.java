package persons;

import abstracts.Callable;
import abstracts.Caller;
import abstracts.Character;

public final class Photographer extends Character implements Callable {

    public Photographer() {
        super("Фотограф");
    }

    @Override
    public boolean call(Caller from) {
        return true;
    }
}
