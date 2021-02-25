package aggregation.Text;
//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
import java.util.Arrays;

public class Text {
    private  String title;
    private Sentence[] sentences;

    public Text(String title) {
        this.title = title;
        this.sentences = new Sentence[0];
    }

    public Text complementText(Sentence newSentence) {

        sentences = Arrays.copyOf(sentences, sentences.length + 1);

        sentences[sentences.length - 1] = newSentence;

        return this;
    }


    public void printText() {

        System.out.println(title);

        for (Sentence s : sentences) {
            s.print();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }
}

class Sentence{
    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public void print() {
        for (Word w : words) {
            System.out.print(w.getWord() + " ");
        }
        System.out.print(".\n");
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }
}

class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    //метод для построения слов из строки
    public static Word of(String word){
        return new Word(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
