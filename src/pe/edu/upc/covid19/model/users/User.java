package pe.edu.upc.covid19.model.users;

public abstract class User {
    protected int id;

    public User() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}