package task9;

import task8.Customer;

import java.util.Arrays;

public class BookPlenty {
    private Book[] books;
    private int currentId = 0;

    public BookPlenty() {
        books = new Book[0];
    }

    public BookPlenty(Book[] books) {
        this.books = books;
        for(Book b : books){
            b.setId(currentId);
            currentId++;
        }
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
        book.setId(currentId);
        currentId++;
    }

    public void deleteBook(int id) {
        books = Arrays.stream(books)
                .filter(c -> !(c.getId() == id))
                .toArray(Book[]::new);
    }

    public void printBooksByAuthor(String author) {
        System.out.println("Books by the author " + author);
        for (Book b : books) {
            if (b.correctAuthor(author)) {
                System.out.println(b.toString());
            }
        }
        System.out.println("");
    }

    public void printBooksOfPublishingHouse(String publishingHouse) {
        System.out.println("Books of the publishing house " + publishingHouse);
        for (Book b : books) {
            if (b.correctPublishingHouse(publishingHouse)) {
                System.out.println(b.toString());
            }
        }
        System.out.println("");
    }

    public void printBooksPublishedAfterYear(int year) {
        System.out.println("Books published after the year " + year);
        for (Book b : books) {
            if (b.correctYear(year)) {
                System.out.println(b.toString());
            }
        }
        System.out.println("");
    }
    public void printBooks() {
        System.out.println("Books");
        for (Book b : books) {
                System.out.println(b.toString());
        }
        System.out.println("");
    }
}
