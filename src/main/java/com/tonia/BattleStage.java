package com.tonia;

import java.util.Random;

class BattleStage {
    static String startBattle(Hero hero,Monster monster){
        Random random = new Random();

        while(monster.getHp() > 0 || hero.getHp() > 0){
            hero.setDmg(random.nextInt(hero.getDmg() + 1));
            monster.setHp ((monster.getHp()) - hero.getDmg());

            monster.setDmg(random.nextInt(monster.getHp()+1));
            hero.setHp(hero.getHp() - monster.getDmg());

        }
        String winner;
        if(monster.getHp() > hero.getHp()){
            winner = "Monster wins(((";
           // return "Monster wins(((";
        } else{
            winner = "Hero wins!";
           // return "Hero wins!";
        }
        return winner;
        //return monster.getHp() > hero.getHp() ? "Monster wins);" : "Hero wins!";
    }
}
