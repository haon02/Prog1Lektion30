package opgave01.models;

public class Ranged extends Weapon {
    private int Ranged;

    public Ranged(int ranged, String name) {
        super(name);
        Ranged = ranged;
    }

    @Override
    public String toString() {
        return "Ranged Weapon: " + super.getName() + ", Range = " + Ranged + "ft";
    }
}
