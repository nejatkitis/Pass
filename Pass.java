import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz :");
        mat = input.nextInt();
        System.out.println("Fizik notunu giriniz :");
        fizik = input.nextInt();
        System.out.println("Kimya notunu giriniz :");
        kimya = input.nextInt();
        System.out.println("Türkçe notunu giriniz :");
        turkce = input.nextInt();
        System.out.println("Müzik notunu giriniz :");
        muzik = input.nextInt();
        double ort = (mat + fizik + kimya + turkce + muzik) / 5 ;
        if ((mat<0)||(fizik<0)||(kimya<0)||(turkce<0)||(muzik<0)){
            System.out.println("Hatalı not girişi yaptınız lütfen programı baştan başlatıp Terkar Deneyin");
        } else if ((mat>100)||(fizik>100)||(kimya>100)||(turkce>100)||(muzik>100)) {
            System.out.println("Hatalı not girişi yaptınız lütfen programı baştan başlatıp Terkar Deneyin");
        } else {
            if (ort >= 55) {
                System.out.println("Tebrikler Sınıfı geçtiniz");
            } else {
                System.out.println("Sınıf tekrarı");
            }
            System.out.println("Ortalamanız : " +ort);
        }
        }
}
