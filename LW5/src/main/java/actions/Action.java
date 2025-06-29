package actions;

import characters.GameCharacter;

/**
 * Абстрактный класс, предсталяющий действие в игре
 * Определяет общий интерфейс для различных типов действий (атака, защита, ослабление противника, лчение)
 */

public abstract class Action {
    
    /**
     * Возвращает тип действия
     * @return строку с названием типа действия (например, "Атака", "Защита")
     */
    public abstract String getType();

    /**
     * Выполняет действие, влияя на игровых персонажей
     * 
     * @param gameCharacter персонаж, который совершает действие
     * @param enemy противник, на которого направлено действие
     * @param enemyActionType тип совершаемого противником действия 
     */
    public abstract void realization(GameCharacter gameCharacter, GameCharacter enemy, String enemyActionType);
}

