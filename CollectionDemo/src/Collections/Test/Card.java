package Collections.Test;

public class Card {
    private String number;
    private String color;
    private Integer size;

    public Card(String number, String color, Integer size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return color+number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Card() {
    }
}
