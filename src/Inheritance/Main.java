package Inheritance;

//Contoh sederhana dari penerapan Inheritance
//parent class
class Hero{
    String Name;
}
//child class
class HeroMage extends Hero{

}
//child class
class HeroAssasin extends Hero{

}

public class Main {
    public static void main(String[] args){
        //Membuat objek hero1
        HeroAssasin hero1 = new HeroAssasin();
        //Memberikan nilai pada objek
        hero1.Name = "Alucard";
        //Memanggil objek
        System.out.println("Nama Hero:" + hero1.Name);

        //Membuat objek hero2
        HeroAssasin hero2 = new HeroAssasin();
        //Memberikan nilai pada objek
        hero2.Name = "Karina";
        //Memanggil objek
        System.out.println("Nama Hero:" + hero2.Name);

        //Membuat objek hero3
        HeroMage hero3 = new HeroMage();
        //Memberikan nilai pada objek
        hero3.Name = "Valir";
        //Memanggil objek
        System.out.println("Nama Hero:" + hero3.Name);

    }
}
