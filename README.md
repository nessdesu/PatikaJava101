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
	
<details>
	 
	 
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

🟢 Pratik 14 - Girilen Sayıdan Küçük 2'nin Kuvvetlerini Bulan Program
	
<details>
	
	public static void main(String[] args) {
        int i, num;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
	
	
	System.out.println("***2'NIN KUVVETLERİ***");
        for(i=1; i<=num;i*=2){

            System.out.println(i);
        }
	System.out.println("***4'UN KUVVETLERİ***");
        for (i = 1; i <= num; i *= 4) {
            System.out.println(i);
        }
        System.out.println("***5'IN KUVVETLERİ***");
        for (i = 1; i <= num; i *= 5) {
            System.out.println(i);
        }
    }
	
</details>
	
---
	
🟢 Pratik 15 - Faktöriyel ve Kombinasyon Hesabı Yapan Program
	
<details>
	

	public static void main(String[] args) {

        int n, r, num, i, j, k, facN = 1, facR = 1, facK = 1, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyelinin hesaplanmasını istediğiniz sayıyı giriniz: ");
        num = input.nextInt();

        for (i = num; i >= 1; i--) {
            total *= i;
        }
        System.out.println("Faktöriyel: " + total);


        System.out.print("Kombinasyon hesaplaması için n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("Kombinasyon hesaplaması için r değerini giriniz: ");
        r = input.nextInt();

        for (i = n; i >= 1; i--) {
            facN *= i;
        }
        for (j = r; j >= 1; j--) {
            facR *= j;
        }
        for (k = (n - r); k >= 1; k--) {
            facK *= k;
        }
        total = facN / (facR * facK);
        System.out.println("Kombinasyon: " + total);
    }
	
</details>
	
---
	
🟢 Pratik 16 - Üslü Sayı Hesaplayan Program
	
<details>
	
	int n, e, i, us=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        e = input.nextInt();

        for(i=e; i>=1; i--){
            us *=n;
        }
        System.out.println("Sonuç : " + us);

    }
	
</details>
	
---
	
🟢 Pratik 17 - Armstrong Sayıları Bulan Program

<details>
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num, basamakSayisi = 0, basamakValue, basamakUs,sonuc=0;
        num = input.nextInt();
        int tempNum = num;

        //girilen sayının kaç basamaklı olduğunu bulduk
        while (tempNum != 0) {
            tempNum /= 10;
            basamakSayisi++;

        }

        tempNum = num;

        //sayının basamaklarındaki rakamları aldık ve üs işlemlerini yaptık
        while (tempNum != 0) {

            basamakValue = tempNum % 10;
            basamakUs=1;
            for(int i=1; i<=basamakSayisi; i++){
                basamakUs *= basamakValue;
            }
            sonuc += basamakUs;
            tempNum /=10;

        }

        if(sonuc==num){
            System.out.println("Bu sayı Armstrong sayıdır! " + num);
        }
        else{
            System.out.println("Bu sayı Armstrong sayı değildir! " + num);
        }


    }
	
	
	
	
</details>
	
---

🟢 Pratik 18 - Harmonik Sayıları Bulan Program

<details>
	
	public static void main(String[] args) {
        double result =0.0;
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik Seri Hesaplamak İçin Bir N değeri giriniz: ");

        //Harmonik Sayı Serisi: 1 + 1/2 + 1/3 + 1/4 + .... + 1/n
        n = input.nextInt();

        for(double i=1; i<=n; i++){
            result += (1/i);
        }

        System.out.print("Hesaplama Sonucu: " + result);


    }
	
</details>
	
---
	
🟢 Pratik 19 - Yıldızlar İle Üçgen Yapımı
	
<details>
	
	public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");

        num = input.nextInt();

        //i= basamak sayısı; k=sol baştan bırakılacak boşluk sayısı
        for (int i = 0; i <= num; i++) {
            for (int k = 0; k < (num - i); k++) {
                System.out.print(" ");
            }
            //j= ekrana basılacak * sayısı
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }

        //i=basamak sayısı
        for (int i = num; i > 0; i--) {
            //k=sol baştan bırakılacak boşluk sayısı
            for (int k = (num - i); k >= 0; k--) {
                System.out.print(" ");
            }
            //ekrana basılacak yıldız sayısı j
            for (int j = (2 * i - 2); j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
	
</details>

---

🟢 Pratik 20 - ATM Projesi

<details>
	
	 public static void main(String[] args) {

        String userName, password;
        int right = 3, balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            int decrease = input.nextInt();
                            if (decrease > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= decrease;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
	
</details>
	
---
	
🟢 Pratik 21 - EBOB - EKOK Bulan Program

<details>
	
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1, ekok=1;
        int x = 1, z = 1;
        if(n2 > n1) {
            while (x <= n1) {
                if (n1 % x == 0 && n2 % x == 0) {
                    ebob = x;
                }
                x++;
            }
            System.out.println("EBOB: "+ebob);
        } else {
            while (z <= n2) {
                if (n1 % z == 0 && n2 % z == 0) {
                    ebob = z;
                }
                z++;
            }
            System.out.println("EBOB: "+ebob);
        }
        
        ekok = (n1*n2)/ebob;
        
        System.out.println("EKOK: "+ekok);

    }
	
</details>
	
---

	
🔵 Ödev 6 - Girilen Sayılardan Maksimum ve Minimum Olanları Bulma
	
<details>
	
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0, num, adet;
        System.out.print("Kaç adet sayı girececeksiniz: ");
        adet = input.nextInt();
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            num = input.nextInt();
            if (i == 1) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçün sayı: " + min);
    }
	
</details>
		
---
	
🔵 Ödev 7 - Mükemmel Sayı Bulan Program
	
<details>
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.println(num + " Bir mükemmel sayıdır!");
        } else {
            System.out.println(num + " Bir mükemmel sayı değildir!");
        }
    }
	
	
	
</details>

---
	
🔵 Ödev 8 - Ters Üçgen Yapımı
	
<details>
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int num = input.nextInt();
        int i, j;
        //basamak sayısı
        for (i = num; i >= 1; i--) {
            //bırakılacak boşluk sayısı
            for (j = (num - i); j >= 0; j--) {
                System.out.print(" ");
            }
            //basılacak yıldız sayısı
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

	
</details>
	
---

🔵 Ödev 9 - 1-100 Arası Asal Sayılar
	
<details>
	
public static void main(String[] args) {

        int flag = 0;
        for (int i = 1; i <= 100; i++) {
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                System.out.println(i);
                flag = 0;
            } else {
                flag = 0;
            }
        }

    }
	
	
</details>
	
---
	
🔵 Ödev 10 - Fibonacci Serisi
	
<details>
	
	public static void main(String[] args) {

        int num1 = 0, num2 = 1;
        int total = num1 + num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet fibonacci sayısı görmek istiyorsunuz? ");
        int value = input.nextInt();

        System.out.print(num1 + "  " + num2);
        while (value > 0) {
            System.out.print(total + " ");
            value--;
            num1 = num2;
            num2 = total;
            total = num1 + num2;
        }

    }
	
	
</details>
	
---
	
🟢 Pratik 22 - Palindrom Sayılar
	
<details>
	
	static boolean isPalindorm(int number) {
        int temp = number, reversedNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversedNumber) {
            System.out.println("Palindrom Sayı");
        } else {
            System.out.println("Palindorm sayı değil.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        isPalindorm(num);

    }
	
	
</details>

---

🟢 Pratik 23 - Recursive ile Fibonacci Serisi
	
<details>
	
	static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }


    	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi elaman sayısı: ");
        int num = input.nextInt();
        System.out.print(fib(num));

    }
	
</details>
	
---

🟢 Pratik 24 - Gelişmiş Hesap Makinesi
	
<details>
	

    //Toplama işlemi
    static void plus() {
        int result = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı toplayacaksınız: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            result += num;
        }
        System.out.println("Toplam: " + result);
    }

    //Çıkarma İşlemi
    static void minus() {
        int result = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            if (i == 1) {
                result += num;
                continue;
            }
            result -= num;
        }
        System.out.println("Sonuç: " + result);
    }

    //Çarpma İşlemi
    static void multiply() {
        int result = 1, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            if (num == 0) {
                result = 0;
                break;
            }
            result *= num;
        }
        System.out.println("Sonuç: " + result);
    }

    //Bölme işlemi
    static void divide() {

        double result = 0.0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            if (i != 1 && num == 0) {
                System.out.println("Bölen için 0 değerini giremezsiniz: ");
                continue;
            }
            if (i == 1) {
                result = num;
                continue;
            }
            result /= num;
        }
        System.out.println("Sonuç: " + result);

    }

    //Üs Alma İşlemi
    static void power() {
        int base, power, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        power = scan.nextInt();
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    //Faktoriyel İşlemi
    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyel hesabı için sayı giriniz: ");
        int num = input.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    //Mod Alma İşlemi
    static void mod() {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının modunu almak istiyorsunuz?: ");
        int num = input.nextInt();
        System.out.print("Hangi sayıya göre mod almak istiyorsunuz?: ");
        int modNum = input.nextInt();
        if (num == 0 && modNum == 0) {
            System.out.println("Lütfen geçerli değerler giriniz: ");
        } else {
            result = num % modNum;
            System.out.println("Sonuç: " + result);
        }
    }

    //Dikdörtgen alan ve çevre hesabı
    static void rectangle() {
        int uzunKenar, kısaKenar, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        uzunKenar = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        kısaKenar = input.nextInt();

        cevre = (uzunKenar * 2) + (kısaKenar * 2);
        alan = uzunKenar * kısaKenar;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";

        do {
            System.out.print(menu);
            System.out.println("**** HESAP MAKİNESİ ****");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!");
            }

        } while (choice != 0);

    }

	
	
</details>

---
	
🔵 Ödev 11 - Recursive Method ile Üs Hesabı Yapan Program
	
<details>
	
	
	 static int power(int base, int power) {
       	 if (power != 0) {
            	return base * power(base, power - 1);
         } else {
            	return 1;
        	}
    	 }

    	public static void main(String[] args) {
		int base, power;
		Scanner input = new Scanner(System.in);
		System.out.print("Taban sayısı: ");
		base = input.nextInt();

		System.out.print("Üs sayısı: ");
		power = input.nextInt();

		System.out.println("Sonuç: " + power(base, power));

    }

	
</details>
	
---

🔵 Ödev 12 - Recursive Method ile Asal Sayı Hesabı
	
<details>
	
	static int asal(int num, int i) {

        if (num == i) {
            return 1;
        } else {
            if (num % i == 0) {
                return 0;
            } else return asal(num, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int num = input.nextInt();
        int i = 2;
        if (asal(num, i) == 1) {
            System.out.print(num + " Sayısı asaldır!");
        } else {
            System.out.println(num + " Sayısı asal değildir!");
        }

    }
	
</details>
	
---
	
🔵 Ödev 13 - Desene Göre Recursive Method Oluşturma
	
<details>
	
	 //control ile girilen sayı kontrol edilir. num >0 olacağı için değeri true'dur
    static int design(int num, boolean control, int flag) {
        if (control) {
            //girilen sayı sıfırdan büyükse
            if (num > 0) {
                System.out.print(num + " ");
                //sayacı artır ve sayıdan 5 çıkar
                flag++;
                return design(num - 5, true, flag);
            } else if (num == 0) { //sayı sıfıra eşitse sayacı azalt
                flag--;
                return design(num, false, flag);
            }

        } else {
            System.out.print(num + " ");
            //sayac sıfırdan büyük olduğunda sayacı azalt ve sayıya 5 ekle
            //çünküü seri 0 değerine ulaşıyor ve sayaç artıyor. tekrar girilen numaraya erişene kadar
            //sayacı azaltıyoruz ve sayıya 5 ekliyoruz.
            if (flag > 0) {
                flag--;
                return design(num + 5, false, flag);
            } else {
                return num + 5;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //flag sayac değişkeni, 0'dan başlamalı
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = input.nextInt();
        System.out.println(design(num, true, 0));
    }

	
</details>

---
	
🟢 Pratik 25 - Öğrenci Bilgi Sistemi

<details>
	
	
	🔽 MAIN CLASS
	
	public class Main {

    	public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca" , "555", "TRH");
        Teacher t2 = new Teacher("Nikola Tesla","556", "FZK" );
        Teacher t3 = new Teacher("Külyutmaz", "553","BIO");

        Course tarih = new Course("TARİH", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("FİZİK", "102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student(tarih,fizik,biyoloji, "Jeon Bam","123","4");
        s1.addBulkExamNote(70,70,50,20, 20, 30);
        s1.isPass();

    }

}
	

		
	
	🔽TEACHER CLASS
	
	
	
	public class Teacher {
	    String name;
	    String phoneNumber;
	    String branch;

	Teacher(String name, String phoneNumber, String branch){
	    this.name = name;
	    this.phoneNumber = phoneNumber;
	    this.branch = branch;
    }

    	void print(){
            System.out.println("Adı: " + this.name);
            System.out.println("Bölümü: " +this.branch);
            System.out.println("Telefon No: " +this.phoneNumber);
        
    }
}

	
	
	
	
	🔽 COURSE CLASS
	
	
	
	   public class Course {
		 Teacher teacher;
		 String name;
		 String code;
		 String prefix;
		 double quiz;
		 double note;
		 double courseAverage;

	    public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int quiz = 0;
		double courseAverage = 0.0;
    }

	    void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
		    this.teacher = teacher;
		    System.out.println("Öğretmen ekleme işlemi başarılı!");
		} else {
		    System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
		}

	    }

	    void printTeacherInfo() {
		this.teacher.print();
    }
}
	
	
	
	
	
     🔽 STUDENT CLASS
	
	
	

	
		public class Student {
		    Course c1;
		    Course c2;
		    Course c3;
		    Course quiz1;
		    Course quiz2;
		    Course quiz3;
		    Course courseAverage;
		    String name;
		    String stuNo;
		    String classes;
		    double average;
		    boolean isPass;

	    Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.average = 0.0;
		this.isPass = false;
    }

    void addBulkExamNote(double note1, double note2, double note3, double quiz1, double quiz2, double quiz3) {
        if (note1 >= 0 && note1 <= 100 && quiz1 >= 0 && quiz1 <= 100) {
            this.c1.note = (note1 * 0.8);
            this.c1.quiz = (quiz1 * 0.2);
            this.c1.courseAverage = (this.c1.note + this.c1.quiz);

        }
        if (note2 >= 0 && note2 <= 100 && quiz2 >= 0 && quiz2 <= 100) {
            this.c2.note = (note2 * 0.7);
            this.c2.quiz = (quiz2 * 0.3);
            this.c2.courseAverage = (this.c2.note + this.c2.quiz);

        }
        if (note1 >= 0 && note1 <= 100 && quiz3 >= 0 && quiz3 <= 100) {
            this.c3.note = (note3 * 0.6);
            this.c3.quiz = (quiz3 * 0.4);
            this.c3.courseAverage = (this.c3.note + this.c3.quiz);
        }
    }

    void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            if (this.isPass) {
                System.out.println("Sınıfı başarılı şekilde geçtiniz! ");
            } else {
                System.out.println("Sınıfta kaldınız! ");
            }

        }
    }

    void calcAverage() {
        this.average = (this.c1.courseAverage + this.c2.courseAverage + this.c3.courseAverage) / 3.0;
    }

    boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    void printNote() {
        System.out.println("*****************");
        System.out.println("Öğrenci: " + this.name);
        System.out.println(c1.name + " Notu:\t" + this.c1.note);
        System.out.println(c2.name + " Notu:\t" + this.c2.note);
        System.out.println(c3.name + " Notu:\t" + this.c3.note);
        System.out.println("Tarih Quiz Puanınız:\t" + this.c1.quiz);
        System.out.println("Fizik Quiz Puanınız:\t" + this.c2.quiz);
        System.out.println("Biyoloi Quiz Puanınız:\t" + this.c3.quiz);
        System.out.println("Ortalamanız: " + this.average);
    }


}
	
	
</details>
	
---
	
🟢 Pratik 26 - Boks Oyunu
	
<details>
	
	
	**MAIN CLASS**
	public class Main {

    	public static void main(String[] args) {
	Fighter f1 = new Fighter("A", 10, 120, 100, 30);
  	Fighter f2 = new Fighter("B", 20 , 85, 85,40);

	Match match = new Match(f1, f2, 85, 100);
	match.run();
    	}
	}
	
	
	***FIGHTER CLASS***
	
		public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double starter;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        }else{
            this.dodge =0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu!");
        if(foe.isDodge()){
            System.out.println("------");
            System.out.println(foe.name + " gelen hasarı blokladı");
            return  foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
     }
}
	
	
	***MATCH CLASS***
					 
	
	public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                //random bir şekilde f1 ya da f2nin dövüşe başlayabilmesi için
                while (this.f1.starter == this.f2.starter) {
                    this.f1.starter = Math.random() * 50;
                    this.f2.starter = Math.random() * 50;
                }
                if (this.f1.starter > this.f2.starter) {
                    System.out.println("==== YENİ ROUND ====");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    //f1.starter sıfırlanarak f2nin vurması sağlanıyor
                    this.f1.starter = 0;
                }
                if (this.f2.starter > this.f1.starter) {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.starter = 0;

                }
                System.out.println(this.f1.name + " sağlık : " + this.f1.health +
                        " \n" + this.f2.name + " sağlık : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;
        } else {
            return false;
        }
    }


	
</details>

---

🔵 Ödev 14 - Maaş Hesaplayacı
	
	
	
<details>
		
❗ Override ettiğimiz toString() metodu stringler ile işlem yaptığı için, içerisinde matematiksel işlemler yapamayız. Bu sebeple "Employee" sınıfına 2 adet ek method eklendi. Bunlar "void taxBonus()" ve "void totalSalary() 

➡️ taxBonus() methodunda; maaştan vergi tutarı çıkarıldı ve bonus miktarı eklendi
➡️ totalSalary() methodunda; taxBonus() methodunda elde ettiğimiz maaş miktarı ile maaş artışı miktarı toplanarak toplam maaş 	bilgisi elde edildi.	

	
	
		**MAIN CLASS**
		
		public static void main(String[] args) {
			Employee employee = new Employee("Patika Dev", 2000, 45, 1985);
			employee.tax();
			employee.bonus();
			employee.raiseSalary();
			employee.taxBonus();
			employee.totalSalary();
			System.out.println(employee);
		    }
		
		
		
		***EMPLOYEE CLASS***
		
		public class Employee {
		    String name;
		    double salary;
		    int workHours;
		    int hireYear;
		    double tax;
		    double bonus;
		    double raiseSalary;
		    double taxBonusSalary;
		    double totalSalary;

	    public Employee(String name, double salary, int workHours, int hireYear) {
			this.name = name;
			this.salary = salary;
			this.workHours = workHours;
			this.hireYear = hireYear;
		    }

	    void tax() {
		if (this.salary > 0 && this.salary < 1000) {
		    this.tax = 0;
		}
		if (this.salary > 1000) {
		    this.tax = this.salary * 0.03;
		}
	    }

	    //çalışma saatine göre maaş
	    void bonus() {
		if (this.workHours > 40) {
		    this.bonus = (this.workHours - 40) * 30;
		}
	    }

	    //tecrübeye göre maaş artışı
		    void raiseSalary() {
			if ((2021 - this.hireYear) < 10) {
			    this.raiseSalary = this.salary * 0.05;
			} else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
			    this.raiseSalary = this.salary * 0.10;
			} else {
			    this.raiseSalary = this.salary * 0.15;
			}
		    }

	    //Bonuslar eklenip, vergiler çıkarılınca elde edilen maaş
		    void taxBonus() {
			this.taxBonusSalary = (this.salary - this.tax) + this.bonus;
		    }

		    //toplam maaş
		    void totalSalary() {
			this.totalSalary = this.taxBonusSalary + this.raiseSalary;
		    }

	    @Override
	    public String toString() {
			return "Adı: " + this.name + " \n"
				+ "Maaşı: " + this.salary + " \n"
				+ "Çalışma Saati: " + this.workHours + " \n"
				+ "Vergi: " + this.tax + " \n"
				+ "Bonus: " + this.bonus + "\n"
				+ "Maaş Artışı: " + this.raiseSalary + "\n"
				+ "Vergi ve Bonuslar ile Birlikte Maaş: " + this.taxBonusSalary + "\n"
				+ " Toplam Maaş: " + this.totalSalary;
		    }
		}

		
											
</details>
	
---

	
🟢 Pratik 27 - Dizideki Elemanların Ortalaması
	
<details>
	
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        double harmonik = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }   //dizideki elemanların ortalaması
        System.out.println("Ortalama: " + sum / numbers.length);

        //dizideki elemanların harmonik ortalaması
        for (double j = 1; j <= numbers.length; j++) {
            harmonik += (1 / j);
        }
        System.out.println("Harmonik Ortalama: " + harmonik);

    }
	

	
</details>
	
---
	
🟢 Pratik 28 - Dizideki Max ve Min Elemanları Bulan Program

<details>
	
	
	 public static void main(String[] args) {

        //verilen dizinin max ve min elemanları 
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        // System.out.println("Minimum: " + min);
        //  System.out.println("Maksimum: " + max);


        //girilen numaraya yakın dizideki en küçük ve en büyük eleman
        int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list2));
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        num = input.nextInt();

        int min1 = list2[0];
        int max2 = list2[0];

        for (int j : list2) {
            if (j < min1) {
                min1 = j; //dizinin min değeri bulundu
            }
            if (j > max2) {
                max2 = j; //dizinin max değeri bulunda
            }
        }
        for (int j : list2) {
            if (j > num) { //dizinin elemanları girilen elemandan büyük mü
                if (j <= max2) { //dizinin eleman değerleri max ile kıyaslandı
                    max2 = j;
                }
            }

            if (j < num) { //dizinin elemanları girilen elemandan küçük mü
                if (j >= min1) {
                    min1 = j; //dizinin eleman değerleri min ile kıyaslandı
                }
            }
        }

        System.out.println("Girilen sayıdıan küçük en yakın değer: " + min1);
        System.out.println("Girilen sayıdan büyük en yakın değer: " + max2);


    }
	
	
</details>
	
---
