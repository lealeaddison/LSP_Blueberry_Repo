package org.howard.edu.lsp.midterm.question1;


public class Book {
    // encapsulated fields
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * @param title the title of the book
     * @param author the author of the book
     * @param ISBN the ISBN number of the book (unique identifier)
     * @param yearPublished the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getYearPublished() { return yearPublished; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    /**
     * @param obj the object to compare with
     * @return true if both books have the same ISBN and author, otherwise false
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
    }

    /**
     * Returns a string representation of the book, including title, author, ISBN, and year published.
     *
     * @return a formatted string describing the book
     */
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d",
                title, author, ISBN, yearPublished);
    }
}
