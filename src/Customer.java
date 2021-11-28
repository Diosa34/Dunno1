import java.util.Random;

public final class Customer extends Character implements Caller, Place, Sociable {
    private final Bag bag;
    private int sociability = 0;


    public Customer() {
        super("Покупатель");
        this.bag = new Bag();
        for (int i = new Random().nextInt(10) + 5; i > 0; i--) {
            this.bag.add(Money.values()[new Random().nextInt(Money.values().length)]);
        }
        this.bag.add(Money.THREE_SANTIC);
    }

    public Bag getBag() {
        return this.bag;
    }

    @Override
    public int getSociability() {
        return this.sociability;
    }

    @Override
    public void setSociability(int n) {
        this.sociability = n;
    }
}
