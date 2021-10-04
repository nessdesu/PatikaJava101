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

---

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

---

🟢 Pratik 3 - Hipotenüs Hesaplama ve Üçgenin Alanını Bulma
	
<details>
	
	
	public static void main(String[] args) {

        double a,b, c, u, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğu: ");
        a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğu: ");
        b = input.nextDouble();

        //(a*a)+(b*b) işleminin karekökünü alarak c'yi hesapladık
        //formül >> a*a + b*b = c*c
        c= Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs uzunluğu: " + c);

        /// üçgenin alanı ///
        System.out.println("\n"); //bir satır aşağı geçmek için \n kullanılır
        System.out.println("** Üçgenin Alanı **\n");
        System.out.print("1. kenar uzunluğu: ");
        a = input.nextDouble();

        System.out.print("2. kenar uzunluğu: ");
        b = input.nextDouble();

        System.out.print("3. kenar uzunluğu: ");
        c = input.nextDouble();

        //alan bulma hesaplamaları
        u= (a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin çevresi: " + u*2);
        System.out.print("Üçgenin alanı: " + alan);
  
    }
</details>
	
---
	
🟢 Pratik 4 - Taksimetre Uygulaması

<details>
	
	
	
	 public static void main(String[] args) {
        double baslangic= 10.0, kmBasina=2.20, minTutar=20, toplamTutar, toplamMesafe, odenecekTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç km yol gidildi? ");
        toplamMesafe = input.nextDouble();

        //toplam tutar hesabi, eğer toplam tutar < 20 ise, minTutar alınacak.
        //toplam tutar > 20 ise toplamTutar alınacak
        toplamTutar = (toplamMesafe * kmBasina) + baslangic;
        boolean flag = toplamTutar < 20;
        odenecekTutar = flag ? minTutar : toplamTutar;

        System.out.print("Ödenecek tutar: " + odenecekTutar);
    }
		
					
					
</details>
	
---
	
🟢 Pratik 5 - Daire Çevresi, Alanı ve Daire Diliminin Alanını Hesaplama  
	
<details> 
	
		
	
	public static void main(String[] args) {
        double r, cevre, alan, aci, dilimAlani;
        double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarı çap uzunluğunu giriniz: ");
        r= input.nextDouble();

        cevre = 2*PI*r;
        alan = PI*r*r;

        System.out.print("Dairenin çevresi: " + cevre +"\n");
        System.out.print("Dairenin alanı: " + alan + "\n");

        //Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı

        System.out.print("Daire diliminin alanını bulabilmek için, dairenin yarı çapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz: ");
        aci= input.nextDouble();

        dilimAlani = (PI * Math.pow(r,2) * aci) / 360;
        System.out.print("Daire diliminin alanı: " + dilimAlani);

    }
		
	
	
	
</details>

---

🔵 Ödev 1 - Vücut Kitle İndeksi Hesaplama

<details>

	
	
      public static void main(String[] args) {
      double boy, kitleEndeksi;
      int kilo;
      Scanner input = new Scanner(System.in);

      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
      boy = input.nextDouble();

      System.out.print("Lütfen kilonuzu giriniz : ");
      kilo = input.nextInt();

      kitleEndeksi = kilo / (boy * boy);

      System.out.print("Vücut kitle indeksiniz: " + kitleEndeksi);

    }
	
	
</details>
	
---
	
	
🔵 Ödev 2 - Manav Kasa Programı
	
<details>

	
	    public static void main(String[] args) {
		double armut = 2.14, armutToplam, elma = 3.67, elmaToplam, domat = 1.11, domatToplam,
			muz = 0.95, muzToplam, patlican = 5.00, patlicanToplam, toplamTutar;
		double kilo;

		Scanner input =new Scanner(System.in);

		System.out.print("Armut kaç kilo? ");
		kilo = input.nextDouble();
		armutToplam = kilo * armut;

		System.out.print("Elma kaç kilo? ");
		kilo = input.nextDouble();
		elmaToplam = kilo * elma;

		System.out.print("Domates kaç kilo? ");
		kilo = input.nextDouble();
		domatToplam = kilo * domat;

		System.out.print("Muz kaç kilo? ");
		kilo = input.nextDouble();
		muzToplam = kilo * muz;

		System.out.print("Patlıcan kaç kilo? ");
		kilo = input.nextDouble();
		patlicanToplam = kilo * patlican;

		toplamTutar = armutToplam + elmaToplam + domatToplam + muzToplam + patlicanToplam;

		System.out.print("Toplam Tutar: " + toplamTutar);

	
</details>	
	
---	
