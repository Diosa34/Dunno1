package object;

import abstracts.Direction;
import abstracts.Size;
import persons.Dunno;

public class Promotion {
    private FrontSide frontSide;
    private BackSide backSide;

    public Promotion(Dunno oldDunno){
        this.frontSide = new FrontSide(new Watermelon(), new Cucumber(Direction.IN_FRONT, Size.KOROTISHKA),
                new Houses(Direction.BEHIND, Size.TINY), new Wheat(Direction.ABOVE, Size.GAINT));
        this.backSide = new BackSide(new Rocket(), oldDunno, new Inscription());
    };

    public FrontSide getFrontSide() {
        return frontSide;
    }

    public BackSide getBackSide() {
        return backSide;
    }

    public class FrontSide{
        private Watermelon watermelon;
        private Cucumber cucumber;
        private Houses houses;
        private Wheat wheat;

        FrontSide(Watermelon watermelon, Cucumber cucumber, Houses houses, Wheat wheat){
            this.watermelon = watermelon;
            this.cucumber = cucumber;
            this.houses = houses;
            this.wheat = wheat;
        }

        public Cucumber getCucumber() {
            return cucumber;
        }

        public Houses getHouses() {
            return houses;
        }

        public Wheat getWheat() {
            return wheat;
        }
    }

    public class BackSide{
        private Rocket rocket;
        private Dunno dunno;
        private Inscription inscription;

        BackSide(Rocket rocket, Dunno dunno, Inscription inscription){
            this.rocket = rocket;
            this.dunno = dunno;
            this.inscription = inscription;
        }

        public Inscription getInscription() {
            return inscription;
        }
    }
}
