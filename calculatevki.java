public class calculatevki {

  public static class Insan {

      public int kilo;
      public double boy;
      public int yas;

      public Insan() {
          kilo = 0;
          boy = 0.0;
          yas = 0;
      }

      void yemek(int mik){
        kilo += mik/100;
      }

      double endeksHesapla() {
        double endeks = kilo / ((double) boy * boy);
        return endeks;
      }

  }

  public static class Yiyecek {
      public int besin;
  }

  public static void main(String[] args) {
      Insan ali = new Insan();
      ali.boy = 1.80;
      ali.kilo = 75;
      ali.yas = 23;
      
      Insan veli = new Insan();
      veli.boy = 1.85;
      veli.kilo = 90;
      veli.yas = 23;

      Yiyecek doner = new Yiyecek();
      doner.besin = 250;
      
      Yiyecek corba = new Yiyecek();
      corba.besin = 50;

      System.out.println("Ali'nin yemekten önceki kitle endeksi: " + ali.endeksHesapla());
      System.out.println("Veli'nin yemekten önceki kitle endeksi: " + veli.endeksHesapla());

      ali.yemek(doner.besin);
      veli.yemek(corba.besin);

      System.out.println("Ali'nin yemekten sonraki kitle endeksi: " + ali.endeksHesapla());
      System.out.println("Veli'nin yemekten sonraki kitle endeksi: " + veli.endeksHesapla());
      
  }
}
