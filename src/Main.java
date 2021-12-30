import abstracts.Direction;
import abstracts.Size;
import korotishkies.Korotishka;
import korotishkies.KorotishkaGroup;
import abstracts.State;
import persons.*;
import object.*;
import abstracts.Character;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Miga miga = new Miga();
        Customer customer = new Customer();
        Phone phone = new Phone();
        Photographer photographer = new Photographer();
        Table table = new Table();
        Dunno dunno = new Dunno();
        Bag bag = new Bag();
        Julio julio = new Julio();
        Goat goat = new Goat();
        Population population = new Population(miga, customer, photographer, julio, goat);

        Promotion promotion = new Promotion(dunno);

        WatermelonBody watermelonbody = new WatermelonBody();
        WatermelonTop watermelontop = new WatermelonTop();

        class KorotishkaUnic extends Korotishka{
            public KorotishkaUnic(KorotishkaGroup group) {
                super(group);
            }
        }

        KorotishkaGroup downGroup = new KorotishkaGroup(watermelonbody, State.CLIMB) {
            @Override
            protected void fill() {
                for (int i = new Random().nextInt(10) + 5; i > 0; i--) {
                    this.addKorotishkies(new KorotishkaUnic(this));
                }
            }
        };

        KorotishkaGroup topGroup = new KorotishkaGroup(watermelontop, State.DANCE) {
            @Override
            protected void fill() {
                for (int i = 5; i > 0; i--) {
                    this.addKorotishkies(new KorotishkaUnic(this));
                }
            }
        };

        System.out.println("Действующие лица: ");
        for (Character person : population){
            System.out.println(person.getName());
        }

        System.out.println("Мига подходит к покупателю.");
        miga.moveTo(customer);

        System.out.println("Мига и покупатель пожимают руки.");
        miga.handshake(customer);

        System.out.println(miga.toString());
        System.out.println(customer.toString());

        System.out.println("Мига спросил имя покупателя.");
        System.out.println(String.format("Покупатель ответил: %s", customer.getName()));

        System.out.println("Мига подходит к телефону.");
        miga.moveTo(phone);

        System.out.println("Мига вызывает фотографа.");
        phone.call(miga, photographer);

        if (bag.getNodule()) {
            customer.getBag().open();
            System.out.println("Покупатель развязывает узелок.");
        }

        System.out.println("Покупатель выкладывает на стол кучу медных монет.");
        while (!customer.getBag().isEmpty()){
            table.add(customer.getBag().remove(0));
        }

        if (!table.isEmpty()){
            System.out.println(String.format("%s велел Незнайке и Козлику пересчитать монеты.", julio.getName()));
        }

        System.out.println("Незнайка и Козлик взялись считать монеты.");
        Dunno.CountingResult result = dunno.count(table);

        if (result.getTime() > 1){
            if (result.getSmallMoney() > 1){
                System.out.println("Никак не могут справиться, потому что слишком много мелких монет.");
            }
        }
        System.out.println("Монетки посчитаны.");

        System.out.println(String.format("%s велел Незнайке выдать покупителю акцию.", julio.getName()));
        customer.addPromotion(promotion);

        if (!customer.isEmptyPromotions()){
            customer.setState(State.CAREFULNESS);
            System.out.println(String.format("Бережно взяв акцию в руки," +
                    " %s с интересом принялся разглядывать её", customer.getName()));
        }

        System.out.println("На одной стороне акции был изображён огромнейший арбуз, окружённый крошечными коротышками.");

        System.out.println(String.format("%s из них пытались вскарабкаться на арбуз, приставив к нему деревянную лестницу.", downGroup.getCount()));
        System.out.println(String.format("%s коротышек уже залезли на вершину арбуза и стали %s там, взявшись за руки.",
                topGroup.getCount(), topGroup.getState()));

        System.out.println(String.format("%s зрели на грядке гигантские огурцы.", promotion.getFrontSide().getCucumber().getDirection()));
        System.out.println(String.format("Каждый огурец величиной, как %s.", promotion.getFrontSide().getCucumber().getSize()));

        System.out.println(String.format("%s виднелись %s деревенские домики, %s," +
                " словно строевой лес, возвышались колосья %s земной пшеницы.", promotion.getFrontSide().getHouses().getDirection(),
                promotion.getFrontSide().getHouses().getSize(), promotion.getFrontSide().getWheat().getDirection(),
                promotion.getFrontSide().getWheat().getSize()));

        System.out.println(String.format("На обратной стороне акции имелось изображение космической ракеты и %s в космическом скафандре.",
                dunno.getName()));

        System.out.println(String.format("Тут же было напечатано сообщение, содержащее %s.",
                promotion.getBackSide().getInscription().getContent()));
    }
}
