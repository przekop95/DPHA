public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 10, 100d, 100);
        Elephant elephant = new Elephant("Jan",15,1507d,3);
       String result= lion.nameDownload(lion.getName());
        System.out.println(result);
    }

}