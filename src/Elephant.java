public class Elephant extends Animals implements Example{
    private  int lenght;

    public Elephant(String name, int age, double weight, int lenght) {
        super(name, age, weight);
        this.lenght = lenght;
    }

    @Override
    public String nameDownload(String name) {
        return name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
