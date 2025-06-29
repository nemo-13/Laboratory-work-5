package characterFactory;

import characters.*;
/**
 * Фабрика персонажей для создания экземпляров {@link ShaoKahn}
 */
public class ShaoKahnFactory extends CharacterFactory{

        static {
        // Регистрируем Shao Kahn при загрузке класса
        CharacterFactory.registerCharacter("Shao Kahn", ShaoKahn::new);
    }
    /**
     *
     * @return объект типа GameCharacter, соответствующий персонажу ShaoKahn
     */
        public GameCharacter createCharacter(){
        return new ShaoKahn();
    }
}
