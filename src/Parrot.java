public class Parrot extends Animals implements Example{
    private  int volume;

    public Parrot(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String nameDownload(String name) {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
