package opgave01.models;

public class Weapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon: " +
                "name = " + name ;
    }

    protected String getName() {
        return name;
    }
}
