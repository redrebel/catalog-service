package net.cjred.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super("The book with ISBN " + message + " was not found");
    }
}
