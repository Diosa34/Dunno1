import java.util.ArrayList;

public class Phone implements Place {
    public enum State {
        FREE,
        CALL,
        BUSY;
    }

    private State state = State.FREE;
    private final ArrayList<Callable> subscribers = new ArrayList<Callable>();

    public Callable call(Caller from) {
        return this.call(from, null);
    }

    public Callable call(Caller from, Callable to) {
        this.state = State.CALL;
        if (to != null) {
            if (to.call(from)) {
                this.state = State.FREE;
                return to;
            }
            else {
                this.state = State.FREE;
                return null;
            }
        }
        else {
            for (Callable abonent: subscribers){
                if (abonent.call(from)){
                    this.state = State.FREE;
                    return abonent;
                }
            }
            this.state = State.FREE;
            return null;
        }
    }

    public void subscribe(Callable man){
        subscribers.add(man);
    }
}
