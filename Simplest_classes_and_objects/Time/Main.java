package task6;
//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
public class Main {
    public static void main(String[] args){
        Time time = new Time(23,59,59);
        time.showTime();
        time.changeSeconds(36001);
        time.showTime();
        time.changeMinutes(61);
        time.showTime();
        time.changeHours(13);
        time.showTime();
    }
}
