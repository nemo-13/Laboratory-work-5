package characterFactory;

import characters.*;

/**
 * Фабрика персонажей для создания экземпляров {@link SonyaBlade}
 */
public class SonyaBladeFactory extends CharacterFactory{

        static {
        // Регистрируем Sonya Blade при загрузке класса
        CharacterFactory.registerCharacter("Sonya Blade", SonyaBlade::new);
    }
    /**
     *
     * @return объект типа GameCharacter, соответствующий персонажу SonyaBlade
     */
        public GameCharacter createCharacter(){
        return new SonyaBlade();
    }
}
