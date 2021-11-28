public class Main {
    public static void main(String[] args) {
        Miga miga = new Miga();
        Customer customer = new Customer();
        Phone phone = new Phone();
        Photographer photographer = new Photographer();
        Table table = new Table();
        Dunno dunno = new Dunno();


        miga.moveTo(customer);
        miga.handshake(customer);

        System.out.println("Мига спросил имя покупателя.");
        System.out.println(String.format("Покупатель ответил: %s", customer.getName()));

        miga.moveTo(phone);
        phone.call(miga, photographer);

        customer.getBag().open();

        while (!customer.getBag().isEmpty()){
            table.add(customer.getBag().remove(0));
        }

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
