package drools.project;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Book> checkedOutBooks = new ArrayList<>();

    public Person() {
    }

    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(List<Book> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "checkedOutBooks=" + checkedOutBooks +
                '}';
    }
}
