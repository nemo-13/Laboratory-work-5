package actionFactory;

import actions.*;

/**
 * Конкретная фабрика для создания действия {@link Defense}
 */
public class DefenseFactory extends ActionFactory{

    /**
     *
     * @return объект типа Action, соответствующий действию Defense
     */
    @Override
    public Action createAction() {
        return new Defense();
    }
}
