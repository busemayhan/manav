package Giris;
import java.util.Scanner;
public class OdevManav {
    public static void main(String[] args) {
       // Meyveler ve KG Fiyatları

        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        //Örnek Çıktı;

        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL
        Scanner input=new Scanner(System.in);
        double armut =2.14;
        double elma = 3.67;
        double domates =1.11;
        double muz = 0.95;
        double patlican=5.00;

        double armutkg,elmakg,domateskg,muzkg,patlicankg;
        System.out.print("armut kac kilo : ");
        armutkg=input.nextDouble();
        double armuttl= armutkg*armut;


        System.out.print("elma kac kilo : ");
        elmakg=input.nextDouble();
        double elmatl= elmakg*elma;

        System.out.print("domates kac kilo : ");
        domateskg=input.nextDouble();
        double domatestl= domateskg*domates;

        System.out.print("muz kac kilo : ");
        muzkg=input.nextDouble();
        double muztl= muzkg*muz;

        System.out.print("patlican kac kilo : ");
        patlicankg=input.nextDouble();
        double patlicantl= patlicankg*patlican;

        double toplamtutartl= armuttl+elmatl+domatestl+muztl+patlicantl;
        System.out.print("toplam tutar : " + toplamtutartl+ "TL");







    }
}
