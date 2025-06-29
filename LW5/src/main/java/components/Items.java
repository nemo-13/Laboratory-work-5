package components;

/**
 * Класс, представляющий предмет, который может быть у игрока
 */
public class Items {  
    private final String name;
    private int count;

    /**
     *
     * @param name название предмета
     * @param count количество предметов
     */
    public Items(String name, int count){
        this.name = name;
        this.count = count;
    }

    /**
     *
     * @param count
     */
    public void setCount(int count){
        this.count += count;
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
     * @return количество
     */
    public int getCount(){
        return this.count;
    }
}
