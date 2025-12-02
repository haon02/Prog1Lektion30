package opgave01.models;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells = new ArrayList<>();

    public Spellcaster(String name, int level, ArrayList<Spell> spells) {
        super(name, level);
        this.spells = spells;
    }

    public ArrayList<Spell> getSpells() {
        return new ArrayList<>(spells);
    }

    public void addSpell(Spell spell) {
        if (!spells.contains(spell)) {
            spells.add(spell);
            spell.addSpellcaster(this);
        }
    }

    public void removeSpell(Spell spell) {
        if (spells.contains(spell)) {
            spells.remove(spell);
            spell.removeSpellcaster(this);
        }
    }
}
