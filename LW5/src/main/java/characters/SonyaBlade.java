package characters;

/**
 * Класс, представляющий игрового персонажа SonyaBlade 
 * Наследует базовые характеристики от класса GameCharacter и задает уникальные параметры персонажа
 */
public class SonyaBlade extends GameCharacter {
    /**
     * Конструктор класса SonyaBlade.
     * Инициализирует персонажа со стандартными характеристиками:
     * - Уровень: 1
     * - Максимальное здоровье: 100
     * - Базовый урон: 12
     * - Тип персонажа: "Sonya Blade"
     */
    public SonyaBlade() {
        super(1, 80, 16, "Sonya Blade");
    }
}
