package lab09.assignment_9_1.business;

import java.util.List;

import lab09.assignment_9_1.business.Book;
import lab09.assignment_9_1.dataaccess.DataAccess;
import lab09.assignment_9_1.dataaccess.DataAccessFacade;

public interface ControllerInterface {
    public void login(String id, String password) throws LoginException;

    public List<String> allMemberIds();

    public List<String> allBookIds();

}
