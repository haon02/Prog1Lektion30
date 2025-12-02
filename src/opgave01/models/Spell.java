package opgave01.models;

import java.util.ArrayList;

public class Spell {
    private int range;
    private Duration duration;
    private final ArrayList<Spellcaster> spellcasters = new ArrayList<>();

    public Spell(int range, Duration duration) {
        this.range = range;
        this.duration = duration;
    }

    public ArrayList<Spellcaster> getSpellcasters() {
        return new ArrayList<>(spellcasters);
    }

    public void addSpellcaster(Spellcaster spellcaster) {
        if (!spellcasters.contains(spellcaster)) {
            spellcasters.add(spellcaster);
            spellcaster.addSpell(this);
        }
    }

    public void removeSpellcaster(Spellcaster spellcaster) {
        if (spellcasters.contains(spellcaster)) {
            spellcasters.remove(spellcaster);
            spellcaster.removeSpell(this);
        }
    }

    @Override
    public String toString() {
        return "Spell: " +
                "range = " + range + "ft" +
                ", duration = " + duration;
    }
}
