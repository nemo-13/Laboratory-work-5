package actionFactory;

import actions.Action;

/**
 * Абстрактная фабрика для создания объектов типа {@link Action}
 */
public abstract class ActionFactory {

    /**
     *
     * @return объект типа Action, соответствующий действию
     */
    public abstract Action createAction();
}
