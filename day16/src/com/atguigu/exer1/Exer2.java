package com.atguigu.exer1;

import java.security.DigestException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 12
 */
public class Exer2 {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("牛蛙", "121"));
        users.add(new User("牛蛙", "121"));
        users.add(new User("牛蛙仔仔", "121"));
        users.add(new User("牛蛙仔仔", "12121"));
        users.add(new User("牛蛙仔仔们", "12121"));

        Iterator<User> it = users.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class User{

    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}