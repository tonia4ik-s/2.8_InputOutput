package com.tonia;

abstract class Char {
    private int hp;
    private int dmg;

    int getHp() {
        return hp;
    }
    void setHp(int hp) {
        this.hp = hp;
    }

    int getDmg() {
        return dmg;
    }
    void setDmg(int dmg) {
        this.dmg = dmg;
    }
}
