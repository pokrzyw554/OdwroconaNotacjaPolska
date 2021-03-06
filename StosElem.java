package Listy;

public class StosElem
{
    private int value;
    private  StosElem prev;

    public StosElem(int value, StosElem prev)
    {
        this.value = value;
        this.prev = prev;
    }
    public StosElem(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public StosElem getPrev()
    {
        return prev;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setPrev(StosElem prev)
    {
        this.prev = prev;
    }
}
