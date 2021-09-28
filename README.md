# PatikaJava101
Kodluyoruz / Patika.dev Java eğitimleri için açmış olduğum repository.
---
🟢 Pratik 1 - Ortalama Hesaplama

<details>

  '''java

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
'''
</details>
