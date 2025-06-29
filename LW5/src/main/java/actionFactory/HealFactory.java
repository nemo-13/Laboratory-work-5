package actionFactory;

import actions.*;

/**
 * Конкретная фабрика для создания действия {@link Heal}
 */
public class HealFactory extends ActionFactory{

    /**
     *
     * @return объект типа Action, соответствующий действию Heal
     */
    @Override
    public Action createAction() {
        return new Heal();
    }
}

