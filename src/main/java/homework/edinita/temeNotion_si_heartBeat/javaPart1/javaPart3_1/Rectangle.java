package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_1;

public class Rectangle {
    private  int lenght;
    private  int width;

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }


    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLenght(33);
        rectangle.setWidth(44);
    }
}
