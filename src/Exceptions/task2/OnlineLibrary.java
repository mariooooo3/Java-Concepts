package Exceptions.task2;

import java.util.ArrayList;

public class OnlineLibrary implements Exceptions {
    int budget;
    ArrayList<Book> books = new ArrayList<>();

    public OnlineLibrary(int budget) {
        this.budget = budget;
    }

    public void addBook(Book book) throws Exceptions.NotEnoughMoneyException {
        if (this.budget >= book.price) {
            books.add(book);
            budget = budget - book.price;
        } else
            throw new NotEnoughMoneyException("Book price is greater than the budget");
    }

    public Book getBook(Book book) throws Exceptions.NoSuchBookException {
        for (Book b : books) {
            if (b.equals(book))
                return b;

        }
        throw new NoSuchBookException("Book does not exist");
    }
}
