package actions;

import characters.GameCharacter;

/**
 * Класс,реализующий действие Ослабление противника
 */
public class Debuff extends Action {

    
/**
 * Возвращает тип действия
 * 
 * @return строку "Debuff" - тип данного действия
 */   
    
    @Override
    public String getType() {
        return "Debuff";
    }

/**
 * Реализует логику ослабления противника в зависимости от его действия.
 * 
 * @param human
 * @param enemy
 * @param enemyActionType
 * 
 * Логика эффектов:
 * - Если противник использует "Debuff" или "Heal" - эффект не применяется
 * - Если противник защищается ("Defense") - 75% шанс наложить эффект на количество ходов, равное уровню противника
 * - Если противник атакует ("Hit") - эффект накладывается на 1 ход
 */    
    
    @Override
    public void realization(GameCharacter human, GameCharacter enemy, String enemyActionType) {
        switch (enemyActionType) {
            case "Debuff", "Heal" -> {
            }
            case "Defense" -> {
                if (Math.random()<0.75){
                    enemy.setBonusDamageTurns(enemy.getLevel());
                }
            }
            case "Hit" -> {
                enemy.setBonusDamageTurns(1);
            }
        }
    }
}