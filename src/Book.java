public class Book {
    int id;
    String name;
    private String author;
    int totalCopies;
    int availableCopies;

    public Book(int id, String name, String author, int totalCopies, int availableCopies) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void add() {
    }
}
