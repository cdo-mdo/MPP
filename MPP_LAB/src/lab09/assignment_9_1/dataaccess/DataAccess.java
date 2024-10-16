package lab09.assignment_9_1.dataaccess;

import java.util.HashMap;

import lab09.assignment_9_1.business.Book;
import lab09.assignment_9_1.business.LibraryMember;

public interface DataAccess {
    public HashMap<String, Book> readBooksMap();

    public HashMap<String, User> readUserMap();

    public HashMap<String, LibraryMember> readMemberMap();
}
