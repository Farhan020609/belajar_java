package lib.belajar.java;

//Overriding
class CobaHitung {
    int p, l;
    double r;

    int hitung(int p, int l){
        return (p*l);
    }
    double hitung(double r){
        return (2*3.14*r);
    }
}

public class exam extends CobaHitung{
    public static void main(String[] args) {
        exam datar = new exam();
        System.out.println("Hitung Persegi Panjang = " + datar.hitung(5, 4));
        System.out.println("Hitung Keliling Lingkaran = " + datar.hitung(6));
    }
}
    

