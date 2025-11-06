package Exceptions.task2;

public class Main {
    public static void main(String[] args) throws Exceptions.NotEnoughMoneyException,
            Exceptions.NoSuchBookException {
        Book b1 = new Book("Romeo și Julieta", "William Shakespeare", "Tragedie", 50);
        Book b2 = new Book("Codul lui Da Vinc", "Dan Brown", "Mister", 80);
        Book b3 = new Book("Stăpânul inelelo", "J.R.R. Tolkien", "Fantasy", 100);
        Book b4 = new Book("Moromeții", "Marin Preda", "Roman social", 50);

        OnlineLibrary lib = new OnlineLibrary(250);

        try {
            lib.addBook(b1);
            lib.addBook(b2);
            lib.addBook(b3);

            try {
                Book foundBook = lib.getBook(b4);
                System.out.println("Book found:" + foundBook.title);
            } catch (Exceptions.NoSuchBookException e) {
                System.out.println("Error:" + e.getMessage());
                System.out.println("Adding book to library");
                lib.addBook(b4);
                System.out.println("Book added to library" + b4.title);

            }
        } catch (Exceptions.NotEnoughMoneyException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}