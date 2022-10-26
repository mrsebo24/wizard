package org.example;

import org.example.SpellType;

import java.util.Arrays;

public enum WizardType {
    WIZARD_OF_FIRE("Mag ognia", new SpellType[]{SpellType.HEAL, SpellType.FIREBALL}),
    WIZARD_OF_WIND("Mag wiatru", new SpellType[]{SpellType.HEAL, SpellType.LIGHTING_STRIKE});

    final String descripton;
    final SpellType[] spellTypes;

    WizardType(String descripton, SpellType[] spellTypes) {
        this.descripton = descripton;
        this.spellTypes = spellTypes;
    }

    public String getDescripton() {
        return descripton;
    }


    @Override
    public String toString() {
        return "WizardType{" +
                "descripton='" + descripton + '\'' +
                ", spellTypes=" + Arrays.toString(spellTypes) +
                '}';
    }
}
