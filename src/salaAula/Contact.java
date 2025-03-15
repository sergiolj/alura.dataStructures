package salaAula;

public class Contact {
    private static int counter = 0 ;
    private final int id;
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.id = counter++;
        this.name = name;
        this.email = email;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " , email: " + this.email;
    }
}
