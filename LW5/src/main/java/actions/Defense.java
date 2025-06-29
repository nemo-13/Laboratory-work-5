package actions;

import characters.GameCharacter;

/**
 * Класс, реализующий действие Защита
 */
public class Defense extends Action {
    
/**
 * Возвращает тип действия
 * 
 * @return строку "Defense" - тип данного действия
 */      

    @Override
    public String getType() {
        return "Defense";
    }
/**
 * @param human
 * @param enemy
 * @param enemyActionType
 */   
    @Override
    public void realization(GameCharacter human, GameCharacter enemy, String enemyActionType) {
    }
}