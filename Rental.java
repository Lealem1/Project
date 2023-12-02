import java.util.Date;
public class Rental {
     String date;
    Book book;
     Person person;
    public Rental(Book book, Person person) {
        this.date= date;
        this.book = book;
        this.person = person;
        book.addRental(this);
        person.addRental(this);
    }
    public Rental(Date currentDate,Person person, Book book) {
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Book getBook() {
        return book;
    }
    public Person getPerson() {
        return person;
    }
}