package Models;

public class User {
    private int id;
    private String surname;
    private String name;
    private String email;
    private String password;
    private float money;

    public User(int id, String surname, String name, String email, String password, float money) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.email = email;
        this.password = password;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
