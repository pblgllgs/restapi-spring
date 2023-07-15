package com.pblgllgs.restapi.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;


    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(23)));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(15)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        User u = users.stream().filter(predicate).findFirst().orElse(null);
        if (u == null){
            throw new UserNotFoundException("id:"+id);
        }
        return u;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        User user = findOne(id);
        if (user == null){
            throw new UserNotFoundException("id:"+id);
        }
        Predicate<? super User> predicate = u -> u.getId().equals(id);
        users.removeIf(predicate);
    }
}
