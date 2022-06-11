package app.dao.dataBase;

import app.dao.api.StorageDAO;
import app.models.User;

import java.util.List;

public class UserDao implements StorageDAO<User> {
    @Override
    public User find(String username) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void edit(User user, String username) {

    }

    @Override
    public void delete(String username) {

    }
}
