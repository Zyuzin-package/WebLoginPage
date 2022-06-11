package login.dao.api;

import java.util.List;

public interface StorageDAO <T> {

    T find(String username);
    List<T> findAll();
    void add(T t);
    void edit (T t,String username);
    void delete(String username);
}