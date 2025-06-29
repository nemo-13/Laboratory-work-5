package characterFactory;

import characters.*;

/**
 * Фабрика персонажей для создания экземпляров {@link Human}
 */
public class HumanFactory extends CharacterFactory{

        static {
        // Регистрируем Human при загрузке класса
        CharacterFactory.registerCharacter("Human", Human::new);
    }
    /**
     *
     * @return объект типа GameCharacter, соответствующий персонажу Human
     */
        public GameCharacter createCharacter(){
        return new Human();
    }
}
