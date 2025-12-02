package opgave01;

import opgave01.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Barbarian opg B:
        ArrayList<Weapon> initialWeapon = new ArrayList<>();
        Barbarian barbarian = new Barbarian("Fofstelr", 10, initialWeapon);
        Weapon longsword = new Weapon("Longsword");
        Ranged shortbow = new Ranged(80,"Shortbow");
        barbarian.addWeapon(longsword);
        barbarian.addWeapon(shortbow);

        // Wizard opg C:
        ArrayList<Spell> initialSpell = new ArrayList<>();
        Wizard wizard = new Wizard("Orlemaex" ,11, initialSpell);
        Spell fireball = new Spell(150, Duration.INSTANTANEOUS);
        wizard.addSpell(fireball);

        // Prints
        System.out.println("BARBARIAN INFORMATION");
        System.out.println(barbarian);
        System.out.println(longsword);
        System.out.println(shortbow);
        System.out.println("WIZARD INFORMATION");
        System.out.println(wizard);
        System.out.println(fireball);

    }
}
