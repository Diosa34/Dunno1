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

        System.out.println("Мига подходит к покупателю.");
        miga.moveTo(customer);

        System.out.println("Мига и покупатель пожимают руки.");
        miga.handshake(customer);
        System.out.println(String.format("Уровень коммуникабельности Миги становится: %s", miga.getSociability()));
        System.out.println(String.format("Уровень коммуникабельности Покупателя становится: %s", customer.getSociability()));

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
        else {
            System.out.println("Монетки посчитаны.");
        }
    }
}
