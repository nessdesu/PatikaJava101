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
	
🟢 Pratik 6 - Hesap Makinesi 
	
<details>
	
	
	 public static void main(String[] args) {
		int num1, num2, choice;

		Scanner input = new Scanner(System.in);
		System.out.print("1. Sayı: ");
		num1 = input.nextInt();
		System.out.print("2. Sayı: ");
		num2 = input.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
		System.out.print("Seçiminizi yapınız.");
		choice = input.nextInt();
		switch (choice){
		    case 1:
			System.out.print("Toplam: " + (num1+num2));
			break;
		    case 2:
			System.out.print("Fark: " + (num1-num2));
			break;
		    case 3:
			System.out.print("Çarpım: "+ (num1*num2));
			break;
		    case 4:
			System.out.print("Bölüm: " + (num1/num2));
			break;
		    default: System.out.println("Geçersiz bir değer girdiniz.");
        }
	
</details>
	
---
	
🟢 Pratik 7 - Kullanıcı Girişi
	
<details>
	
	
	   public static void main(String[] args) {
        //Bizim belirlediğimiz kullanıcı adı ve şifre
        String userName = "patika", password = "java123", newPassword;

        //Yanlış şifre girildikten sonra E/H seçimi yapabilmek için
        char choice;

        //Kullanıcıdan aldığımız bu değer ile userName ve password değişkenlerimizin değerlerinin eşit olup olmadığını kontrol edeceğiz
        String nickName, password2;

        //Kullanıcı adı ve şifre kontrolü için oluşturduğumuz boolean değerler
        boolean flag1, flag2;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        nickName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password2 = input.nextLine();

        //nickName değeri ile userName değeri birbirine eşit ve flag1 true döndürüyor
        flag1 = nickName.equals(userName);

        //password2 değeri ile password değeri birbirine eşit ve flag2 true döndürüyor
        flag2 = password2.equals(password);

        if (flag1 && flag2) {
            System.out.println("Giriş başarılı!");
        }
        //eğer flag2 false ise, yani girilen şifre yanlışsa else bloğunun içine girerek işlemeri yaptırıyoruz.
        if ((!flag2)) {
            System.out.println("Şifreniz yanlış. Sıfırlamak için 'E' programdan çıkmak için 'H' tuşlayınız.");
            choice = input.next().charAt(0);
            if (choice == 'E') {
                System.out.print("Yeni şifre: ");
                newPassword = input.next();
                if (newPassword.equals(password)) {
                    System.out.print("Şifre eski şifre ile aynı olmamalıdır.");
                } else {
                    System.out.print("Şifre oluşturuldu!");
                }
            } else {
                System.out.print("Şifre oluşturulamadı.");
            }

        } 
        //Eğer kullanıcı adı yanlış girilmişse, bu işlem yapılır
        else if ((!flag1)) {
            System.out.println("Kullanıcı adı yanlış!");
        }
    }
	
</details>	
	
---	
	
🟢 Pratik 8 - Sınıfı Geçme Durumu

<details>
	

	public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double toplam, ortalama = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();


        if (mat == 0) {
            toplam = fizik + turkce + kimya + muzik;
            ortalama = toplam / 4;
            if (ortalama <= 55) {
                System.out.print("Başarısız oldunuz. Sınıf tekrarı yapmalısınız");
            } else {
                System.out.print("Sınıfı başarıyla geçtiniz. Tebrikler!");
            }
        } else if (fizik == 0) {
            toplam = mat + turkce + kimya + muzik;
            ortalama = toplam / 4;
            if (ortalama <= 55) {
                System.out.print("Başarısız oldunuz. Sınıf tekrarı yapmalısınız");
            } else {
                System.out.print("Sınıfı başarıyla geçtiniz. Tebrikler!");
            }

        } else if (turkce == 0) {
            toplam = mat + fizik + kimya + muzik;
            ortalama = toplam / 4;
            if (ortalama <= 55) {
                System.out.print("Başarısız oldunuz. Sınıf tekrarı yapmalısınız");
            } else {
                System.out.print("Sınıfı başarıyla geçtiniz. Tebrikler!");
            }
        } else if (kimya == 0) {
            toplam = mat + turkce + fizik + muzik;
            ortalama = toplam / 4;
            if (ortalama <= 55) {
                System.out.print("Başarısız oldunuz. Sınıf tekrarı yapmalısınız");
            } else {
                System.out.print("Sınıfı başarıyla geçtiniz. Tebrikler!");
            }
        } else if (muzik == 0) {
            toplam = mat + turkce + kimya + fizik;
            ortalama = toplam / 4;
            if (ortalama <= 55) {
                System.out.print("Başarısız oldunuz. Sınıf tekrarı yapmalısınız");
            } else {
                System.out.print("Sınıfı başarıyla geçtiniz. Tebrikler!");
            }
        }
        
    }
	
</details>
	
---


🟢 Pratik 9 - Hava Sıcaklığına Göre Etkinlik Önerme
	
<details>

	 public static void main(String[] args) {

        //Kullanıcıdan alacağımız sıcaklık bilgisi
        int heat;
        
        //Sıcaklık aralıklarını kontrol edebilmek için boolean değerlerimiz
        boolean flag1, flag2, flag3;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        // heat <=5 ise true
        flag1 = heat <= 5;
        // heat>5 && heat<=15 ise true
        flag2 = heat > 5 && heat <= 15;
        // heat>15 && heat<=25 ise true
        flag3 = heat > 15 && heat <= 25;

        if (flag1) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (flag2) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (flag3) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
	
	

</details>
	
---

🟢 Pratik 10 - Sayıları Büyükten Küçüğe ve Küçükten Büyüğe Sıralama
	
<details
	 
	 
	public static void main(String[] args) {
        int a, b, c;
        //büyükten küçüğe sıralama

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        b = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        c = input.nextInt();
        if (a < b && a < c) {
            if (b > c) {
                System.out.println("Sıralama: " + a + " " + b + " " + c);
            } else {
                System.out.println("Sıralama: " + a + " " + c + " " + b);
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("Sıralama: " + b + " " + a + " " + c);
            } else {
                System.out.println("Sıralama: " + b + " " + c + " " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("Sıralama: " + c + " " + a + " " + b);
            } else {
                System.out.println("Sıralama: " + c + " " + b + " " + a);
            }
        }

        // Küçükten büyüğe sıralama
        boolean flag1, flag2, flag3, flag4, flag5, flag6;
        
	// a<b<c
        flag1 = a < b && a < c && b < c;
        
	// a<c<b
        flag2 = a < b && a < c && c < b;
        
	//b<a<c
        flag3 = b < a && b < c && a < c;
        
	//b<c<a
        flag4 = b < a && b < c && c < a;
	
        //c<a<b
        flag5 = c < a && c < b && a < b;
					
        //c<b<a
        flag6 = c < a && c < b && b < a;

        if (flag1) {
            System.out.println("a < b < c");
        } else if (flag2) {
            System.out.println("a < c < b");
        } else if (flag3) {
            System.out.println("b < a < c");
        } else if (flag4) {
            System.out.println("b < c < a");
        } else if (flag5) {
            System.out.println("c < a < b");
        } else {
            System.out.println("c < b < a");
        }

    } 
	
	
	 
	
</details>

---
	
	
🟢 Pratik 11 - Burç Bulan Program

<details>
	

	public static void main(String[] args) {
        int day, month;
        String zodiac;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        System.out.print("Doğum gününüzü giriniz: ");
        day = input.nextInt();

        if(month==3 && day>=21 || month==4 && day<=20){
            System.out.println("Koç burcu");
        } else if (month == 4 && day >= 21 || month == 5 && day <= 21) {
            System.out.println("Boğa burcu");
        }
        else if (month == 5 && day >= 22 || month == 6 && day <= 22) {
            System.out.println("İkizler burcu");
        }
        else if (month == 6 && day >= 23 || month == 7 && day <= 22) {
            System.out.println("Yengeç burcu");
        }
        else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
            System.out.println("Aslan burcu");
        }
        else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
            System.out.println("Başak burcu");
        }
        else if (month == 9 && day >= 23 || month == 10 && day <= 22) {
            System.out.println("Terazi burcu");
        }
        else if (month == 10 && day >= 23 || month == 11 && day <= 22) {
            System.out.println("Akrep burcu");
        }
        else if (month == 11 && day >= 23 || month == 12 && day <= 21) {
            System.out.println("Yay burcu");
        }
        else if (month == 12 && day >= 22 || month == 1 && day <= 21) {
            System.out.println("Oğlak burcu");
        }
        else if (month == 1 && day >= 22 || month == 2 && day <= 19) {
            System.out.println("Kova burcu");
        }
        else{
            System.out.println("Balık burcu");
        }


    }
	
</details>

---

🔵 Ödev 3 - Uçak Bileti Fiyatı Hesaplama

<details>

	   public static void main(String[] args) {
        int distance, type, age;
        double distanceM = 0.10, ageDiscount = 0, totalM, typeDiscount, ticketM;

        Scanner input = new Scanner(System.in);

        System.out.println("Km bilgisi: ");
        distance = input.nextInt();

        totalM = distance * distanceM;

        System.out.println("Yaş bilgisi: ");
        age = input.nextInt();
        if (age < 12) {
            ageDiscount = totalM * 0.50;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = totalM * 0.10;
        } else if (age > 65) {
            ageDiscount = totalM * 0.30;
        }
        ticketM = totalM - ageDiscount;

        System.out.println("1- Tek yön için 1 tuşlayın\n2- Gdişi- dönüş için 2 tıklayın");
        type = input.nextInt();

        switch (type) {
            case 1:
                typeDiscount = totalM * 0;
                ticketM = (totalM - typeDiscount);
                System.out.println("Bilet Ücreti: " + ticketM);
                break;
            case 2:
                typeDiscount = totalM * 0.20;
                ticketM = 2*(totalM - typeDiscount);
                System.out.println("Bilet Ücreti: " + ticketM);
                break;
            default:
                System.out.println("Yanlış değer girdiniz");
        }
    }
	
	
</details>
	
---
	
🔵 Ödev 4 - Çin Zodyağı Hesaplama

<details>
	
	
	   public static void main(String[] args) {
        int date;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        date = input.nextInt();

        if(date % 12 == 0){
            System.out.println("Monkey");
        }
        else if(date % 12 == 1){
            System.out.println("Your Chinese Horoscop: Rooster");
        }
        else if(date % 12 == 2){
            System.out.println("Your Chinese Horoscop: Dog");
        }
        else if(date % 12 == 3){
            System.out.println("Your Chinese Horoscop: Pig");
        }
        else if(date % 12 == 4){
            System.out.println("Your Chinese Horoscop: Mouse");
        }
        else if(date % 12 == 5){
            System.out.println("Your Chinese Horoscop: Ox");
        }
        else if(date % 12 == 6){
            System.out.println("Your Chinese Horoscop: Tiger");
        }
        else if(date % 12 == 7){
            System.out.println("Your Chinese Horoscop: Rabbit");
        }
        else if(date % 12 == 8){
            System.out.println("Your Chinese Horoscop: Dragon");
        }
        else if(date % 12 == 9){
            System.out.println("Your Chinese Horoscop: Snake");
        }
        else if(date % 12 == 10){
            System.out.println("Your Chinese Horoscop: Horse");
        }
        else if(date % 12 == 11){
            System.out.println("Your Chinese Horoscop: Sheep");
        }

    }
	
	
</details>	

	
---
	
🔵 Ödev 5 - Artık Yıl Hesaplama
	
<details>
	
	 public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl giriniz: ");

        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + "Bir artık yıldır!");
                } else {
                    System.out.println(yil + "Bir artık yıl değildir!");
                }
            } else {
                System.out.println(yil + "Bir artık yıldır!");
            }
        } else {
            System.out.println(yil + "Bir artık yıl değildir!");
        }


    }
	
</details>
	
---

	
🟢 Pratik 12 - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program

<details>
	

	public static void main(String[] args) {

        int number, i, j = 0, sum = 0, average = 0;
        Scanner input = new Scanner(System.in);

        //Girilen sayıya kadar olan çift sayılar
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (i=1; i<number; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        
        //3 ve 4 ile bölünen sayıların ortalamasını yazdıran program
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (i = 0; i <= number; i++) {
            if ((i % 3 == 0) & (i % 4 == 0)) {
                System.out.println(i);
                j++;
                sum += i;
            }
        }

        average = sum / j;
        System.out.println("Average: " + average);
         

    }
	
</details>
	
---	
	
🟢 Pratik 13 - Tek Sayıların Toplamını Bulan Program
	
<details>
	
	public static void main(String[] args) {
        int sum = 0, num;
        Scanner input = new Scanner(System.in);
        //tek sayıları bulup toplayan program
      /*  do {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            if (num % 2 == 1) {
                sum += num;
            }

        } while (num > 0);
        System.out.println("Toplam: " + sum);*/
        
        //tek sayı girilene kadar, girilen sayılardan çift ve 4ün katı olan sayıları bulup, toplayan program
        do {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);
        System.out.println("Toplam: " + sum);
    }
	
</details>
	
---

🟢 Pratik 14 - Girilen Sayıdan Küçün 2'nin Katlarını Bulan Program
	
<details>
	
	public static void main(String[] args) {
        int i, num;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
      /*  for(i=1; i<=num;i*=2){

            System.out.println(i);
        }*/

        for (i = 1; i <= num; i++) {
            // EKOK(4,5) = 20 ancak if(i%4==0 && i%5==0) şeklinde de yapılabilir.
            if (i % 20 == 0) {
                System.out.println(i);
            }

        }
    }
	
</details>
	
---
