package task8;

public class Main {

    public static void main(String[] args) {

        CustomerPlenty cp = new CustomerPlenty();

        cp.addCustomer(new Customer(0, "Матусевич", "Игорь", "Леонидович", "", 3014000023423454L, 3014000076858454L));
        cp.addCustomer(new Customer(1, "Щавелев", "Сергей", "Людвигович", "", 3014000067563435L, 3014000094850274L));
        cp.addCustomer(new Customer(2, "Киреева", "Анна", "Викторовна", "", 3014000023574574L, 3014000093483958L));
        cp.addCustomer(new Customer(3, "Кудрин", "Нестор", "Петрович", "", 3014000083750473L, 30140000840327485L));
        cp.addCustomer(new Customer(4,"Селянинова", "Майя", "Дмитриевна", "", 3014000084037594L, 3014000029473603L));

        cp.printSortOfSurname();

        cp.printCorrectID(3014000020000000L, 3014000030000000L);

        cp.deleteCustomer(3);

        cp.printSortOfSurname();
    }
}
