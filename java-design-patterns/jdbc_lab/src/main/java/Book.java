public class Book {
    private String isbn;
    private String title;
    private int authorId;
    private String yearPublished;

    public Book(String isbn, String title, int authorId, String yearPublished) {
        setIsbn(isbn);
        setTitle(title);
        setAuthorId(authorId);
        setYearPublished(yearPublished);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authorId=" + authorId +
                ", yearPublished='" + yearPublished + '\'' +
                '}';
    }
}
