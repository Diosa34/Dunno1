package persons;

public final class Photographer extends Character implements Callable {

    public Photographer() {
        super("Фотограф");
    }

    @Override
    public boolean call(Caller from) {
        return true;
    }
}
