package com.tonia;

import static com.tonia.BattleStage.startBattle;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero();
        Monster monster = new Monster();

        hero.setHp(30);
        monster.setHp(30);
       // BattleStage firstAttack = new BattleStage();
        startBattle(hero, monster);

        System.out.println(startBattle(hero,monster));

    }
}
