package components;

/**
 * Класс, представляющий результат игрока и содержащий имя и набранные очки
 * @author Yulov
 */
public class Results {
    private final String name;
    private final int points;

    /**
     *
     * @param name имя игрока
     * @param points количество очков, набранных игроком
     */
    public Results(String name, int points){
        this.name = name;
        this.points = points;
    }

    /**
     *
     * @return имя
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return баллы
     */
    public int getPoints(){
        return this.points;
    }   
}