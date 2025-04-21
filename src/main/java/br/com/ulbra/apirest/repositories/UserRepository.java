package br.com.ulbra.apirest.repositories;

import br.com.ulbra.apirest.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {
    private List<User> lista = new ArrayList<>();

    public UserRepository() {
        lista.add(new User(1L, "Maria"));
        lista.add(new User(2L, "João"));
        lista.add(new User(3L, "Daniel"));
    }

    public List<User> getUsers() {
        return lista;
    }

    public User getUser(Long id) {
        return lista
                .stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElseThrow();
    }

    public User createUser(User user) {
        lista.add(user);
        return user;
    }

    public void deleteUser(Long id) {
        User user = lista
                .stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElseThrow();

        lista.remove(user);
    }
}
