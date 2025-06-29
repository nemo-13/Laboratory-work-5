package characterFactory;

import characters.GameCharacter;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Абстрактная фабрика для создания игровых персонажей
 */
public abstract class CharacterFactory {
    private static final Map<String, Supplier<GameCharacter>> creators = new HashMap<>();

    public static void registerCharacter(String characterName, Supplier<GameCharacter> creator) {
        creators.put(characterName, creator);
    }
    public static GameCharacter createCharacter(String characterName){
        Supplier<GameCharacter> creator = creators.get(characterName);
        if (creator != null) {
            return creator.get();
        }
        System.err.println("CharacterFactory: unknown character name \"" + characterName + "\"");
        return null;
    }
}
