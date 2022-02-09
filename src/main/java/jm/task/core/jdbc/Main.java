package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService user = new UserServiceImpl();

    public static void main(String[] args) {
        user.createUsersTable();
        user.saveUser("Ivan", "Ivanov", (byte) 20);
        user.saveUser("Petr", "Petrov", (byte) 22);
        user.saveUser("Igor", "Igorev", (byte) 30);
        user.saveUser("Pavel", "Pavlov", (byte) 35);

        //for (User allUser : user.getAllUsers()) {
        //    System.out.println(allUser);
        //}
        //user.cleanUsersTable();
        //user.dropUsersTable();
    }
}