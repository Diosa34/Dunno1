package persons;

import object.Money;
import object.Table;

public final class Dunno extends Character {
    public class CountingResult{
        private final int smallMoney;
        private final int time;

        public CountingResult(int smallMoney, int time){
            this.smallMoney = smallMoney;
            this.time = time;
        }

        public int getSmallMoney(){
            return this.smallMoney;
        }

        public int getTime(){
            return this.time;
        }
    }
    
    public Dunno() {
        super("Незнайка");
    }

    public CountingResult count(Table table) {
        int smallMoney = 0;
        int time = 0;
        for (Money santic : table) {
            if (santic.getNominal() < Money.THREE_SANTIC.getNominal()) {
                smallMoney += 1;
            }
            time += 1;
        }

        return new CountingResult(smallMoney, time);
    }
}
