package abstracts;

public interface Sociable {
    default void handshake(Sociable other){
        this.setSociability(this.getSociability() + 1);
        other.setSociability(other.getSociability() + 1);
    }

    int getSociability();

    void setSociability(int n);
}
