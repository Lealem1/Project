import java.util.Date;
public class Rental {
     Date date;
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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Book getBook() {
        return book;
    }
    public Person getPerson() {
        return person;
    }
}