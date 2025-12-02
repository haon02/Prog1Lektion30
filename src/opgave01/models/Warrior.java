package opgave01.models;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons = new ArrayList<>();


    public Warrior(String name, int level, ArrayList<Weapon> weapons) {
        super(name, level);
        this.weapons = weapons;
    }

    public ArrayList<Weapon> getWeapons() {
        return new ArrayList<>(weapons);
    }

    public void addWeapon(Weapon weapon) {
        if (!weapons.contains(weapon)) {
            weapons.add(weapon);
        }
    }
}

