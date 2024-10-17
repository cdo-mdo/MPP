package lab09.assignment_9_1.business;

import java.util.*;
import java.util.stream.Collectors;

import lab09.assignment_9_1.dataaccess.DataAccess;
import lab09.assignment_9_1.dataaccess.DataAccessFacade;
import lab09.assignment_9_1.business.Book;
import lab09.assignment_9_1.business.LibraryMember;

public class Main {

    public static void main(String[] args) {
        System.out.println(allWhoseZipContains3());
        System.out.println(allHavingAtLeastTwoCopies());
        System.out.println(allHavingMultipleAuthors());
    }

    // Returns a list of all ids of LibraryMembers whose zipcode contains the digit
    // 3
    public static List<String> allWhoseZipContains3() {
        DataAccess da = new DataAccessFacade();
        Collection<LibraryMember> members = da.readMemberMap().values();
        List<LibraryMember> mems = new ArrayList<>();
        mems.addAll(members);
        
        // implement
        return mems.stream()
            .filter(member -> member.getAddress().getZip().contains("" + '3'))
            .map(member -> member.getMemberId())
            .collect(Collectors.toList());
    }

    // Returns a list of all isbns of books having at least two copies
    public static List<String> allHavingAtLeastTwoCopies() {
        DataAccess da = new DataAccessFacade();
        Collection<Book> books = da.readBooksMap().values();
        List<Book> bs = new ArrayList<>();
        bs.addAll(books);

//        bs.forEach(book -> System.out.println(book.getNumCopies()));
        
        // implement
        return bs.stream()
            .filter(book -> book.getNumCopies() >= 2)
            .map(book -> book.getIsbn())
            .collect(Collectors.toList());

    }

    // Returns a list of all isbns of Books that have multiple authors
    public static List<String> allHavingMultipleAuthors() {
        DataAccess da = new DataAccessFacade();
        Collection<Book> books = da.readBooksMap().values();
        List<Book> bs = new ArrayList<>();
        bs.addAll(books);

        // implement
        return bs.stream()
            .filter(book -> book.getAuthors().size() > 1)
            .map(book -> book.getIsbn())
            .collect(Collectors.toList());

    }

}
