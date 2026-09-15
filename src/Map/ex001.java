package Map;

import java.util.HashMap;
import java.util.Map;

public class ex001 {

    static void main() {
        Map<String, User > users = new HashMap<>();
        users.put("Joao@jao.com", new User("Joao", 22));
        users.put("maria@maria.com", new User("Maria", 24));
        users.put("jucas@juca.com", new User("Jucas", 13));
        users.put("leo@leo.com", new User("Leonardo", 43));

        System.out.println(users);
        System.out.println("=========");
        users.keySet().forEach(System.out::println);
        System.out.println("=========");
        users.values().forEach(System.out::println);
    }
}
