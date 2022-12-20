public class Lion extends Animals implements Example {
   private int bad;

   public Lion(String name, int age, double weight, int bad) {
      super(name, age, weight);
      this.bad = bad;
   }

   @Override
   public String nameDownload(String name) {
      return name;
   }

   public int getBad() {
      return bad;
   }

   public void setBad(int bad) {
      this.bad = bad;
   }
}
