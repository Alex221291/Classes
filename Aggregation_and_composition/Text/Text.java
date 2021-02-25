package aggregation.Text;
//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Main {
    public static void main(String[] args) {
        Sentence s1 = new Sentence(new Word[]{Word.of("Healthy"), Word.of("and"), Word.of("happy"), Word.of("family")});
        Sentence s2 = new Sentence(new Word[]{Word.of("Become"), Word.of("a"), Word.of("java"), Word.of("developer"), Word.of("this"), Word.of("year")});
        Sentence s3 = new Sentence(new Word[]{Word.of("Complete"), Word.of("step"), Word.of("one"), Word.of("and"), Word.of("step"), Word.of("two")});

        Text text = new Text("My plans");

        text.complementText(s1);
        text.complementText(s2);
        text.complementText(s3);

        text.printText();
    }
}
