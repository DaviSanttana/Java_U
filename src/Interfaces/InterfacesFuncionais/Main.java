package Interfaces.InterfacesFuncionais;

import java.util.List;
import java.util.function.Function;

public class Main {
    static void main() {
        List<User> users = List.of(new User("Maria", 19), new User("Joao", 20),
                new User("Davi", 23), new User("Ana", 40));
        printStringValue(User::toString, users);
    }


   private static void printStringValue(Function<User, String> callback, List<User> users) {
       users.forEach(user -> System.out.println(callback.apply(user)));
    }
}
