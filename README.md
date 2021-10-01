# PatikaJava101
Kodluyoruz / Patika.dev Java101 eğitimleri için açmış olduğum repository.
---
🟢 Pratik 1 - Ortalama Hesaplama

<details>

  

    public static void main(String[] args) {
	// integer değerinde sınav notlarını tanımladık.
    int mat, fizik, kimya, tarih, turkce, muzik;
    //kullanıcıdan veri alabilmek için oluşturduğumuz Scanner nesnemiz.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan alınan değerleri, değişkenlerimize atadık.
        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        //Double veri tipinde not ortalamasını hesapladık.
        double toplam = mat + fizik + kimya + tarih + turkce + muzik;
        double ortalama = toplam/6;

        System.out.println("Ortalamanız: " + ortalama);

        //Ortalama puanına göre öğrencinin başarı durumu, koşul ifadeleri ile hesaplandı.
        boolean flag = ortalama >= 60;
        System.out.println("Başarı durumu: " + (flag==true ? "Başarılı" : "Başarısız"));

    }
}

</details>

🟢 Pratik 2 - KDV Hesaplama

<details>


        public static void main(String[] args) {

        //değişkenlerimizi double veri tipinde tutuyoruz
        double tutar, kdvTutari, sonuc, kdvliTutar, kdv1=0.18, kdv2=0.8;

        //kullanıcıdan ana para tutarını alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Ana paranızı giriniz: ");
        tutar = input.nextDouble();

        //koşul ve hesaplama işlemleri
        boolean flag = tutar>0 && tutar<=1000;
        sonuc = flag ? kdv1 : kdv2;
        kdvTutari = tutar*sonuc;
        kdvliTutar = tutar + kdvTutari;
        
        System.out.println("Ana tutar:" + tutar);
        System.out.println("KDV tutarı:" + kdvTutari );
        System.out.println("KDVli tutar: " + kdvliTutar);

    }
}

	
</details>
