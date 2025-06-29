package actionFactory;

import actions.*;

/**
 * Конкретная фабрика для создания действия {@link Debuff}
 */
public class DebuffFactory extends ActionFactory{

    /**
     *
     * @return объект типа Action, соответствующий действию Debuff
     */
    @Override
    public Action createAction() {
        return new Debuff();
    }
}