package org.example;

public class Wizard {
    private String wizardName;
    private double healhLevel = 200.0;
    private long age;
    private WizardType wizardType;


    public Wizard(String wizardName, long age, String wizardType) {
        this.wizardName = wizardName;
        this.age = age;
        if (wizardType.equals("Mag ognia"))
            this.wizardType = WizardType.WIZARD_OF_FIRE;
        if (wizardType.equals("Mag wiatru"))
            this.wizardType = WizardType.WIZARD_OF_WIND;
    }

    public void throwSpell(String nameSpell, Wizard opponent) {
        Wizard w = (Wizard) opponent;
        boolean foo = true;
        if (this.getHealhLevel() == 0.0)
            foo = false;
        if (foo)
            if (this.getWizardType() == WizardType.WIZARD_OF_FIRE) {
                if (nameSpell.equals("heal")) {
                    if (w.getHealhLevel() + WizardType.WIZARD_OF_FIRE.spellTypes[0].getHp() >= 200.0)
                        w.setHealhLevel(200.0);
                    else
                        w.setHealhLevel(w.getHealhLevel() + WizardType.WIZARD_OF_FIRE.spellTypes[0].getHp());
                }
                else if (nameSpell.equals("fireBall")) {
                    if (w.getHealhLevel() + WizardType.WIZARD_OF_FIRE.spellTypes[1].getHp() <= 0.0) {
                        setHealhLevel(0.0);
                    } else
                        w.setHealhLevel(w.getHealhLevel() + WizardType.WIZARD_OF_FIRE.spellTypes[1].getHp());
                }
            if (this.getWizardType() == WizardType.WIZARD_OF_WIND) {
                if (nameSpell.equals("heal"))
                    if (w.getHealhLevel() + WizardType.WIZARD_OF_WIND.spellTypes[0].getHp() >= 200.0)
                            w.setHealhLevel(200.0);
                else w.setHealhLevel(w.getHealhLevel() + WizardType.WIZARD_OF_WIND.spellTypes[0].getHp());
                }
            else if (nameSpell.equals("lighting strike")) {
                if (w.getHealhLevel() + WizardType.WIZARD_OF_WIND.spellTypes[1].getHp() <= 0.0) {
                        setHealhLevel(0.0);
                    }
                else
                        w.setHealhLevel(w.getHealhLevel() + WizardType.WIZARD_OF_WIND.spellTypes[1].getHp());
                }
            }
        System.out.println(w.getWizardName() + " " + w.getHealhLevel());
    }

    public String getWizardName() {
        return wizardName;
    }

    public void setWizardName(String wizardName) {
        this.wizardName = wizardName;
    }

    public double getHealhLevel() {
        return healhLevel;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public WizardType getWizardType() {
        return wizardType;
    }

    public void setWizardType(WizardType wizardType) {
        this.wizardType = wizardType;
    }

    public void setHealhLevel(double healhLevel) {
        this.healhLevel = healhLevel;
    }
}
