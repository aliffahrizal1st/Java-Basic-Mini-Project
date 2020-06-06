import java.util.Scanner;
public class ProjekAkhir {
    static String angkaromawi;
    static int angkadesimal;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int milih;
        do {
        System.out.println("+----------------------------------+");
        System.out.println("|  Program Matematika Sederhana    |");
        System.out.println("+----------------------------------+");
        System.out.println("0. Keluar");
        System.out.println("1. Menghitung Konversi Suhu");
        System.out.println("2. Menghitung Luas Bidang Datar");
        System.out.println("3. Menghitung Volume Bangun");
        System.out.println("4. Konversi Bilangan");
        System.out.print("Masukkan Pilihan Anda : "); milih=in.nextInt();
        System.out.println("");System.out.println("");
        switch (milih){
            case 1 : konversisuhu();break;
            case 2 : luasdatar ();break;
            case 3 : volumebangun();break;
            case 4 : konversibil();break;}
        }while (milih!=0);}
        private static void konversisuhu(){
        Scanner in = new Scanner(System.in);
        int pilih1;
        do {
            System.out.println("+--------------------------+");
            System.out.println("| Menghitung Konversi Suhu |");
            System.out.println("+--------------------------+");
            System.out.println("Pilihan : ");
            System.out.println("0. Ga Jadi Deh Males");
            System.out.println("1. Sundul Gan!");
            System.out.print("Pilihan anda : ");
            pilih1 = in.nextInt();
            System.out.println("");System.out.println("");
            switch(pilih1){
                case 1 :konversuhu();
                    System.out.println();System.out.println();
                    break; }
        }while(pilih1!=0);}
    private static void konversuhu() {
        double celcius1,fahrenheit,reamur,kelvin;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Data Celcius : ");celcius1=in.nextInt();
        fahrenheit=(((9*celcius1)/5)+32);
        kelvin=celcius1+273.15;
        reamur=((4*celcius1)/5);
        System.out.printf("Hasil Fahrenheit : %.2f\n",fahrenheit);
        System.out.printf("Hasil Kelvin     : %.2f\n",kelvin);
        System.out.printf("Hasil Reamur     : %.2f\n",reamur); }
    private static void luasdatar(){
            Scanner in = new Scanner(System.in);
            int pilih2;
            do{
                System.out.println("+------------------------------+");
                System.out.println("| Menghitung Luas Bidang Datar |");
                System.out.println("+------------------------------+");
                System.out.println("Pilihan : ");
                System.out.println("0. Udah ah ntar aja");
                System.out.println("1. Persegi");
                System.out.println("2. Segitiga");
                System.out.println("3. Lingkaran");
                System.out.println("4. jajar Genjang");
                System.out.println("5. Trapesium");
                System.out.println("6. Persegi Panjang");
                System.out.print("Pilihan anda : "); pilih2=in.nextInt();
                System.out.println("");System.out.println("");
                switch(pilih2){
                    case 1 :luaspers();
                        System.out.println();System.out.println();
                        break;
                    case 2 :luassegi();
                        System.out.println();System.out.println();
                        break;
                    case 3 :luaslingk();
                        System.out.println();System.out.println();
                        break;
                    case 4 :luasjargen();
                        System.out.println();System.out.println();
                        break;
                    case 5 :luastrap();
                        System.out.println();System.out.println();
                        break;
                    case 6 :luasperspanj();
                        System.out.println();System.out.println();
                        break; }
            }while (pilih2!=0); }
    private static void luasperspanj() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan Panjang            : ");double panjang=in.nextInt();
        System.out.print("Masukkan Lebar             : ");double lebarpanjang=in.nextInt();
        double luaspanjang=panjang*lebarpanjang;
        System.out.printf("Luas Persegi Panjang        : %.3f",luaspanjang); }
    private static void luastrap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Trapesium");
        System.out.print("Masukkan Panjang Alas       : ");double alastrap=in.nextInt();
        System.out.print("Masukkan Sisi Atas          : ");double atastrap=in.nextInt();
        System.out.print("Masukkan Tinggi Trapesium   : ");double tinggitrap=in.nextInt();
        double luastrap=((alastrap+atastrap)*tinggitrap)/2;
        System.out.printf("Luas Trapesium              : %.3f",luastrap); }
    private static void luasjargen() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Jajar Genjang");
        System.out.print("Masukkan Panjang Alas         : ");double jajaralas=in.nextInt();
        System.out.print("Masukkan Tinggi Jajar Genjang : ");double jajartinggi=in.nextInt();
        double luasjajar=jajaralas*jajartinggi;
        System.out.printf("Luas Jajar Genjang            : %.3f",luasjajar); }
    private static void luaslingk() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan Jari - Jari Lingkaran : ");double jari=in.nextInt();
        double luaslingkaran=Math.PI*(jari*jari);
        System.out.printf("Luas Lingkarang                : %.3f",luaslingkaran); }
    private static void luassegi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan Alas Segitiga   : ");double alassegitiga=in.nextInt();
        System.out.print("Masukkan Tinggi Segitiga : ");double tinggisegitiga=in.nextInt();
        double luassegitiga=((alassegitiga*tinggisegitiga)/2);
        System.out.printf("Luas Segitiga            : %.3f",luassegitiga); }
    private static void luaspers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi");
        System.out.print("Masukkan Sisi Persegi : ");double sisipersegi=in.nextInt();
        double luaspersegi=sisipersegi*sisipersegi;
        System.out.printf("Hasil Luas Persegi : %.3f",luaspersegi); }
    private static void volumebangun(){
            Scanner in = new Scanner(System.in);
            int pilih3;
            do{
                System.out.println("+-----------------------------+");
                System.out.println("|  Menghitung Volume Bangung  |");
                System.out.println("+-----------------------------+");
                System.out.println("Pilihan : ");
                System.out.println("0. Njir Salah Mencet Keluar Aja");
                System.out.println("1. Kubus");
                System.out.println("2. Kerucut");
                System.out.println("3. Silinder");
                System.out.println("4. Bola");
                System.out.println("5. Balok");
                System.out.println("6. Prisma");
                System.out.print("Pilihan Anda : ");pilih3=in.nextInt();
                System.out.println("");System.out.println("");
                switch (pilih3){
                    case 1 : volumekubus();
                        System.out.println();System.out.println();
                        break;
                    case 2 :volumekerucut();
                        System.out.println();System.out.println();
                        break;
                    case 3 :volumesilinder();
                        System.out.println();System.out.println();
                        break;
                    case 4 : volumebola();
                        System.out.println();System.out.println();
                        break;
                    case 5 : volumebalok();
                        System.out.println();System.out.println();
                        break;
                    case 6 : volumeprisma();
                        System.out.println();System.out.println();
                        break; }
            }while (pilih3!=0);}
    private static void volumekubus() {
        Scanner in = new Scanner (System.in);
        System.out.println("Menghitung Volume Kubus");
        System.out.print("Masukkan Sisi Kubus : ");double sibus=in.nextInt();
        double volbus=sibus*sibus*sibus;
        System.out.printf("Volume Kubus        : %.3f",volbus); }
    private static void volumekerucut() {
        Scanner in = new Scanner (System.in);
        System.out.println("Menghitung Volume Kerucut");
        System.out.print("Masukkan Jari - Jari Alas : ");double jariker=in.nextInt();
        System.out.print("Masukkan Tinggi Kerucut   : ");double tingker=in.nextInt();
        double volker=(Math.PI*(jariker*jariker)*tingker)/3;
        System.out.printf("Volume Kerucut            : %.3f",volker); }
    private static void volumesilinder() {
        Scanner in = new Scanner (System.in);
        System.out.println("Menghitung Volume Silinder");
        System.out.print("Masukkan Jari - Jari Alas : ");double jarisil=in.nextInt();
        System.out.print("Masukkan Tinggi Silinder  : ");double tingsil=in.nextInt();
        double volsil=Math.PI*jarisil*jarisil*tingsil;
        System.out.printf("Volume Silinder           : %.3f",volsil); }
    private static void volumebola() {
        Scanner in = new Scanner (System.in);
        System.out.println("Menghitung Volume Bola");
        System.out.print("Masukkan Jari - Jari Bola : ");double jaribol=in.nextInt();
        double volbol=(4*Math.PI*jaribol*jaribol*jaribol)/3;
        System.out.printf("Volume Bola               : %.3f",volbol); }
    private static void volumebalok() {
        Scanner in = new Scanner (System.in);
        System.out.println("Menghitung Volume Balok");
        System.out.print("Masukkan Panjang : ");double panjang=in.nextInt();
        System.out.print("Masukkan Lebar   : ");double lebar=in.nextInt();
        System.out.print("Masukkan Tinggi  : ");double tinggi=in.nextInt();
        double volbal=panjang*lebar*tinggi;
        System.out.printf("Volume Balok     : %.3f",volbal); }
    private static void volumeprisma() {
                Scanner in = new Scanner (System.in);
        System.out.println("Menghitung Volume Prisma Segitiga Siku - Siku");
        System.out.print("Masukkan Panjang Sisi Alas Segitiga : "); double sisaprism=in.nextInt();
        System.out.print("Masukkan Tinggi Sisi Segitiga : "); double tingsaprism=in.nextInt();
        System.out.print("Masukkan Tinggi Prisma : "); double tingprism=in.nextInt();
        double luasalasprism= (sisaprism*tingsaprism)/2;
        double volprism=luasalasprism*tingprism;
        System.out.printf("Volume Prisma Segitiga Siku - Siku : %.3f",volprism); }
    private static void konversibil(){
                Scanner in = new Scanner(System.in);
                int pilih4;
                do {
                    System.out.println("+---------------------------------+");
                    System.out.println("|  Konversi Bilangan ke Kelimat   |");
                    System.out.println("+---------------------------------+");
                    System.out.println("0. Eh Ada Tukang Bakso Keluar Dulu ah");
                    System.out.println("1. Bilangan ke Romawi ");
                    System.out.println("2. Romawi ke Bilangan ");
                    System.out.println("3. Bilangan ke Kalimat (Maksimal Jutaan)");
                    System.out.println("4. Bilangan ke Biner");
                    System.out.print("Masukkan Pilihan : "); pilih4=in.nextInt();
                    System.out.println();System.out.println();
                    switch (pilih4){
                        case 1 : konversikerom();
                            System.out.println();System.out.println();
                            break;
                        case 2 : romkebil();
                            System.out.println();System.out.println();
                            break;
                        case 3 : konversikebil();
                            System.out.println();System.out.println();
                            break;
                        case 4 : konversikebin();
                            System.out.println();System.out.println();
                            break; }
                }while (pilih4!=0); }
    private static void romkebil() {
            Scanner in=new Scanner (System.in);
            ProjekAkhir romawi = new ProjekAkhir();
            romawi.kedesimal();
            ProjekAkhir.outromawi(angkaromawi); }
        private void kedesimal(){
        angkadesimal=0;
        Scanner in=new Scanner (System.in);
            System.out.println("Program Mengkonversikan Romawi dari I - MMMMCMXCIX");
            System.out.print("Masukkan Angka Romawi : ");
            angkaromawi = in.nextLine();
            angkaromawi = angkaromawi.toUpperCase();
            int l = angkaromawi.length();
            int angka=0,angkasebelum=0;
            for (int i = l-1;  i>=0; i--) {
                char x = angkaromawi.charAt(i);
                x = Character.toUpperCase(x);
                switch(x){
                    case 'I' :
                        angkasebelum=angka;
                        angka=1;break;
                    case 'V' :
                        angkasebelum=angka;
                        angka=5; break;
                    case 'X' :
                        angkasebelum=angka;
                        angka=10;break;
                    case 'L' :
                        angkasebelum=angka;
                        angka =50;break;
                    case 'C' :
                        angkasebelum=angka;
                        angka=100;break;
                    case 'D' :
                        angkasebelum=angka;
                        angka=500;break;
                    case 'M' :
                        angkasebelum=angka;
                        angka=1000;break;}
                if (angka<angkasebelum)
                    angkadesimal-=angka;
                else
                    angkadesimal+=angka;}}
        private static void outromawi (String angkaromawi){
            System.out.println("Hasilnya Adalah : "+angkadesimal); }
    private static void konversikerom() {
        Scanner in = new Scanner (System.in);
        System.out.println ("Bilangan Ke Romawi");
        System.out.print ("Masukkan Bilangan Bulat : ");
        int angka = in.nextInt();
        if (angka<1 || angka>5000)
            System.out.println("Hanya Terbatas 1 Sampai 5000");
        else{
            while (angka>=1000){
                System.out.print ("M");
                angka-=1000;}
            if (angka>=500){
                if(angka>=900){
                    System.out.print ("CM");
                    angka-=900;}
                else{
                    System.out.print ("D");
                    angka-=500;}}
            while(angka>=100){
                if (angka>=400){
                    System.out.print ("CD");
                    angka-=400;}
                else{
                    System.out.print ("C");
                    angka-=100;}}
            if (angka>=50){
                if (angka>=90){
                    System.out.print ("XC");
                    angka-=90;}
                else{
                    System.out.print ("L");
                    angka-=50;}}
            while(angka>=10){
                if (angka>=40){
                    System.out.print("XL");
                    angka-=40;}
                else{
                    System.out.print ("X");
                    angka-=10;}}
            if (angka >=5){
                if (angka == 9){
                    System.out.print ("IX");
                    angka-=9;}
                else{
                    System.out.print ("V");
                    angka-=5;}}
            if (angka==5000){
                System.out.print("IƆƆ");
                angka-=5000; } }
        while(angka>=1){
            if (angka == 4){
                System.out.print ("IV");
                angka-=4; }
            else
                System.out.print ("I");
            angka-=1; } }
    private static void konversikebin() {
        Scanner in = new Scanner(System.in);
        int number, a;
        System.out.println("Bilangan Ke Biner");
        System.out.print("Masukkan Angka : ");
        number = in.nextInt();
        int i=0;
        a = number;
        do{
            a = (int) (a - Math.pow(2, i));
            i++;}
        while (i <= a);
        if(a < 0)
            i-=1;
        System.out.print("Hasil Binernya "+number+" Adalah : ");
        for (int j = i; j >=0; j--) {
            if(number - Math.pow(2, j) >=0){
                System.out.print("1");
                number = (int) (number - Math.pow(2, j));}
            else
                System.out.print("0"); } }
    private static void konversikebil() {
        Scanner in = new Scanner (System.in);
        System.out.println("Bilangan Ke Kalimat");
        System.out.println("Terdapat Pilihan : ");
        System.out.println("1. Bilangan Negatif");
        System.out.println("2. Bilangan Positif");
        System.out.print("Masukkan Yang Diinginkan : ");
        int n=in.nextInt();
        switch (n){
            case 1 : negatif(); break;
            case 2 : positif(); break; }}

    private static void negatif() {
        Scanner in = new Scanner (System.in);
        System.out.println("Langsung Masukkan Angka Tanpa Tanda (-)");
        System.out.print("Masukkan Angka yang akan dikonversi : ");
        System.out.println("Hasil Konversi : "+kehurufneg(in.nextLong()));}
        private static String kehurufneg(Long angka){
            String[]angkaterbilang={"Nol","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
            if (angka<12)
                return "Minus " + angkaterbilang[angka.intValue()];
            if (angka>=12 && angka <=19)
                return "Minus " + angkaterbilang[angka.intValue()%10] + " Belas";
            if (angka>=20 && angka <=99)
                return "Minus " + kehurufpos(angka/10)+ " Puluh " + angkaterbilang[angka.intValue()%10];
            if (angka >=100 && angka <=199)
                return "Minus " + "Seratus " + kehurufpos(angka%100);
            if (angka >=200 && angka <=999)
                return "Minus " + kehurufpos(angka/100) + " Ratus " + kehurufpos(angka%100);
            if (angka >=1000 && angka<=1999)
                return "Minus " + "Seribu " + kehurufpos(angka%1000);
            if (angka >=2000 && angka <=999999)
                return "Minus " + kehurufpos(angka/1000) + " Ribu "+kehurufpos(angka %1000);
            if (angka >=1000000 && angka <= 9999999)
                return "Minus " + kehurufpos(angka/1000000) + " Juta "+kehurufpos(angka%1000000);
            if (angka >= 1000000000)
                return "Tidak Bisa. Batas Maksimal Hanya Sampai Jutaan";
            return"";
        }
    private static void positif(){
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Angka yang akan dikonversi : ");
        System.out.println("Hasil Konversi : "+kehurufpos(in.nextLong()));}
    private static String kehurufpos(Long angka){
        String[]angkaterbilang={"Nol","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
        if (angka<12)
            return angkaterbilang[angka.intValue()];
        if (angka>=12 && angka <=19)
            return angkaterbilang[angka.intValue()%10] + " Belas";
        if (angka>=20 && angka <=99)
            return kehurufpos(angka/10)+ " Puluh " + angkaterbilang[angka.intValue()%10];
        if (angka >=100 && angka <=199)
            return "Seratus " + kehurufpos(angka%100);
        if (angka >=200 && angka <=999)
            return kehurufpos(angka/100) + " Ratus " + kehurufpos(angka%100);
        if (angka >=1000 && angka<=1999)
            return "Seribu " + kehurufpos(angka%1000);
        if (angka >=2000 && angka <=999999)
            return kehurufpos(angka/1000) + " Ribu "+kehurufpos(angka %1000);
        if (angka >=1000000 && angka <= 9999999)
            return kehurufpos(angka/1000000) + " Juta "+kehurufpos(angka%1000000);
        if (angka >= 1000000000)
            return "Tidak Bisa. Batas Maksimal Hanya Sampai Jutaan";
        return"";}
}