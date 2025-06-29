package characterFactory;

import characters.*;

/**
 * Класс для централизованной регистрации всех игровых персонажей в ситеме
 * Обеспечивает инициализацию фабрики персонажей
 */
public final class CharacterRegistration {
    public static void registerAll() {
        CharacterFactory.registerCharacter("Baraka", Baraka::new);
        CharacterFactory.registerCharacter("Sub Zero", SubZero::new);
        CharacterFactory.registerCharacter("Liu Kang", LiuKang::new);
        CharacterFactory.registerCharacter("Sonya Blade", SonyaBlade::new);
        CharacterFactory.registerCharacter("Shao Kahn", ShaoKahn::new);
    }
}
