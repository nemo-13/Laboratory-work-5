package characterFactory;

import characters.*;

/**
 * Фабрика персонажей для создания экземпляров {@link Baraka}
 */
public class BarakaFactory extends CharacterFactory{
    /**
     *
     * @return объект типа GameCharacter, соответствующий персонажу Baraka
     */
    public GameCharacter createCharacter(){
        return new Baraka();
    }
}
