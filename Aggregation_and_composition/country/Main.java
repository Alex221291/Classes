package aggregation.country;
//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class Main {
    public static void main(String[] args) {
        Area[] areas = new Area[]{
                new Area("Brest region", new City("Brest", 343985, 146.12f), null, 1347000, 32787.0f),
                new Area("Vitebsk region", new City("Vitebsk", 364800, 136.60f), null, 1133400, 40051.0f),
                new Area("Gomel region", new City("Gomel", 510300, 139.77f), null, 1386600, 40372.0f),
                new Area("Grodno region", new City("Grodno", 356900, 142.11f), null, 1025800, 25172.0f),
                new Area("Minsk region", new City("Minsk", 2020600, 348.84f), null, 1471240, 39854.0f),
                new Area("Mogilev region", new City("Mogilev", 357100, 118.50f), null, 1023000, 29068.0f)
        };

        City minsk = new City("Minsk", 2020600, 348.84f);

        Country belarus = new Country("Belarus", minsk, areas, 9408400, 207595.00f);

        System.out.println(belarus.getName());

        belarus.printCapital();
        belarus.printNumberOfAreas();
        belarus.printSquare();
        belarus.printCentersOfAreas();
    }
}
