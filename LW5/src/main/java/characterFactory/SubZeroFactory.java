package characterFactory;

import characters.*;

/**
 * Фабрика персонажей для создания экземпляров {@link SubZero}
 */
public class SubZeroFactory extends CharacterFactory{

        static {
        // Регистрируем Sub Zero при загрузке класса
        CharacterFactory.registerCharacter("Sub Zero", SubZero::new);
    }
    /**
     *
     * @return объект типа GameCharacter, соответствующий персонажу SubZero
     */
        public GameCharacter createCharacter(){
        return new SubZero();
    }
}