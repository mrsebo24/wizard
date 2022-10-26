package org.example;



enum SpellType {
    HEAL (+30), FIREBALL (-25), LIGHTING_STRIKE(-20);

    private final int hp;

    SpellType(int hp) {
        this.hp = hp;
    }

    protected int getHp() {
        return hp;
    }
}