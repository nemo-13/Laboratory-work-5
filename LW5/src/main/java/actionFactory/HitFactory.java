package actionFactory;

import actions.*;

/**
 * Конкретная фабрика для создания действия {@link Hit}
 */
public class HitFactory extends ActionFactory{

    /**
     *
     * @return объект типа Action, соответствующий действию Hit
     */
    @Override
    public Action createAction() {
        return new Hit();
    }

}
