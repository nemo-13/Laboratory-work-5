package characterFactory;

import characters.*;

/**
 * Фабрика персонажей для создания экземпляров {@link LiuKang}
 */
public class LiuKangFactory extends CharacterFactory{

        static {
        // Регистрируем Liu Kang при загрузке класса
        CharacterFactory.registerCharacter("Liu Kang", LiuKang::new);
    }
    /**
     *
     * @return объект типа GameCharacter, соответствующий персонажу LiuKang
     */
        public GameCharacter createCharacter(){
        return new LiuKang();
    }
}
