package lab09.assignment_9_1.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lab09.assignment_9_1.business.Book;
import lab09.assignment_9_1.dataaccess.Auth;
import lab09.assignment_9_1.dataaccess.DataAccess;
import lab09.assignment_9_1.dataaccess.DataAccessFacade;
import lab09.assignment_9_1.dataaccess.User;

public class SystemController implements ControllerInterface {
    public static Auth currentAuth = null;

    public void login(String id, String password) throws LoginException {
        DataAccess da = new DataAccessFacade();
        HashMap<String, User> map = da.readUserMap();
        if (!map.containsKey(id)) {
            throw new LoginException("ID " + id + " not found");
        }
        String passwordFound = map.get(id).getPassword();
        if (!passwordFound.equals(password)) {
            throw new LoginException("Password incorrect");
        }
        currentAuth = map.get(id).getAuthorization();

    }

    @Override
    public List<String> allMemberIds() {
        DataAccess da = new DataAccessFacade();
        List<String> retval = new ArrayList<>();
        retval.addAll(da.readMemberMap().keySet());
        return retval;
    }

    @Override
    public List<String> allBookIds() {
        DataAccess da = new DataAccessFacade();
        List<String> retval = new ArrayList<>();
        retval.addAll(da.readBooksMap().keySet());
        return retval;
    }

}