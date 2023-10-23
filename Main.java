import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // 1. Soru
        /* 「SORU」
            Yazılımda oluşabilecek kaç türlü hata vardır? Bunları açıklayınız. En az hata ile kod yazmak için ne yapılmalıdır?
        */
        /* 「AÇIKLAMA」
            Yazılımda sayısız hata türü vardır ve en yaygın 7 tanesini şöyle sıralayabiliriz:
            1- Syntax Hataları: İnsan dilleri gibi programlama dillerinin de grammarları vardır ve insanların aksine programlar bu hataları
            kabul edememektedir. Yazılan dilin kurallarına uyulmalıdır.
            2- Runtime Hataları: Bu tür hatalar programın farklı sistemlerde veya beklenmeyen bir şekilde kullanılmasından dolayı ortaya çıkabilir.
            3- Logic/Mantık Hataları: Bu tür hatalar kodlama sırasında geliştiricinin beklediği sonucu alamamasına yol açacak mantık
            hataları yapması sonucu ortaya çıkmaktadır.
            4- Compilation/Derleme Hataları: Bu tür hatalar derleyicinin yazılan kodu düşük seviye koda çevirme sırasında sorun yaşaması
            sonucu ortaya çıkarlar.
            5- Arithmetic/Aritmerik Hatalar: Matematik içeren işlemlerde yaşanan sorunlardan dolayı çıkan hata türüdür.
            6- Resource/Kaynak Hataları: Eğer program, bilgisayardan sahip olduğu bellekten ve kaynaklardan daha fazlasını zorla almak isterse
            bu hatalarla karşılışılabilir.
            7- Interface/Arayüz Hataları: Programın nasıl kullanılması gerektiği ve nasıl kullanıldığı arasında bir çelişki yaşanırsa bu hata
            türü ile karşılışılabilir.

            En az hata ile kod yazmak için:
            * Planlama yapılmalıdır. Bir proje başında hedefsiz yola çıkılmaması için her adım planlanmalıdır.
            * Test aşamasına önem gösterilmelidir. Kod yazıldıkça test edilmelidir ve ilerlendikçe sorun çıkarmaması için düzeltilmelidir.
            Hata ayıklama araçları verimli şekilde kullanılmalıdır.
            * Temiz kod prensiplerine önem gösterilmelidir.
            * Belgelendirme işlemi yapılmalıdır.
            * Geliştirici olarak olundupu gibi kalınmamalı, kendini geliştirmek için çaba verilmelidir ve güncel gelişmelerden haberdar olunmalıdır.
        */
        diceApp.dice(); // 2. Soru
        nubmerGuesser.randomGuesser(); // 3. Soru
        conditionedNum.conditionedMain(); // 4. Soru
        System.out.println(primeXMethod.isPrimeX(7877)); // 5. Soru
        //primeXMethod.isPrimeX(7877);
    }
}

class diceApp {
    // 2. Soru
    /* 「SORU」
        Çift zar simülasyonu gerçekleştiriniz. Tavla da iki zar ile oynanır. 1-6 sayıları iki zar üzerindedir. Zarı  programa  artıran  java
        programını  yazınız. Ama gelen  sayıları zar resmini gösterecek şekil deekranda gösteriniz. (Zar resimleri internetten alabilirsiniz.)
    */
    /* 「AÇIKLAMA」
        * Çift zar simülasyonu,üç pencereden oluşmaktardır. İlk pencere işlevsizdir ama "OK" butonuna basıldıktan sonra
        "randomNumGenerator" fonksiyonu ile iki zar için de ayrı rastgele sayı çekilmektedir.
        * İkinci pencerede ilk zarın sonucu ve gelen sayıya göre zar resmi gösterilmektedir, resim "diceImg" fonksiyonundaki switch-case yapısıyla belirlenmektedir.
        * Üçüncü pencerede ikinci zarın sonuçları önce pencerede olduğu gibi gösterilecektir.
    */
    public static void dice() {
        ImageIcon icon = new ImageIcon(diceApp.class.getResource("/img/dice.gif"));
        String windowTitle = "Çift Zar Simülasyonu 2023", windowLabel = "╔═══════════════════════════╗\n║ ÇİFT ZAR SİMÜLASYONU 2023 ║\n╚═══════════════════════════╝\n";
        JOptionPane.showMessageDialog(null, windowLabel+ "Zar atmak için \"OK\" butonuna basın.", windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);

        int diceNum1 = randomNumGenerator(), diceNum2 = randomNumGenerator();
        ImageIcon dice1Icon = diceImg(diceNum1), dice2Icon = diceImg(diceNum2);

        JOptionPane.showMessageDialog(null, windowLabel + "Zar 1 atıldı ve sonuç: " + diceNum1, windowTitle, JOptionPane.INFORMATION_MESSAGE, dice1Icon);
        JOptionPane.showMessageDialog(null, windowLabel + "Zar 2 atıldı ve sonuç: " + diceNum2, windowTitle, JOptionPane.INFORMATION_MESSAGE, dice2Icon);
    }

    public static int randomNumGenerator() {
        int min = 1, max = 6;
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static ImageIcon diceImg(int diceNum) {
        ImageIcon diceIcon = new ImageIcon("");
        switch (diceNum) {
            case 1 -> diceIcon = new ImageIcon("img/dice-1.png");
            case 2 -> diceIcon = new ImageIcon("img/dice-2.png");
            case 3 -> diceIcon = new ImageIcon("img/dice-3.png");
            case 4 -> diceIcon = new ImageIcon("img/dice-4.png");
            case 5 -> diceIcon = new ImageIcon("img/dice-5.png");
            case 6 -> diceIcon = new ImageIcon("img/dice-6.png");
        }
        return diceIcon;
    }
}

class nubmerGuesser {
    // 3. Soru
    /* 「SORU」
        1-100  arasında  rastgele  sayı türeten  ve  kullanıcı  tarafından  tahmin  edilmeye  çalışan programı java programı yazınız.
        Kullanıcı girişlerini Joptionpane.showmessagedialog,joptionpane.showinputdialogyapılarını kullanınız. (try-catch yapısını kullanınız)
    */
    /* 「AÇIKLAMA」
        * Sayı bilmece oyunundan, bilgisayar tarafından 1 ile 100 arasında rastgele üretilen sayıyı ("randomNumGenerator" fonk ile üretilecektir.)
        bilmeleri tanınan tahmin hakkı bitmeden istenecektir.
        * İlk başta kullanıcı yarışmayla tanıştırılacaktır, ardından zorluk seviyesi seçmeleri istenecektir. Zorluk seviyesine göre tahmin hakkı verilecektir.
        * İlk tahmin alınacaktır, eğer girilen değer sayı değilse terminalden uyarı verilecektir. Değer istenilen gibiyse değerlendirme başlayacaktır.
        * Eğer tahminler istenilenden küçük ya da büyük ise bir sonraki tahmin penceresinde kullanıcıya yazı ile belirtilecektir.
        * Doğru sayının tahmin edilmesi veya tahmin hakkının tüketilmesi sonucunda bitiş ekranı gelecektir ve ilgili bilgi gösterilecektir. Eğer kullanıcı
        tekrar oynamak isterse işlem baştan başlayacaktır.
    */
    public static int randomNumGenerator(int min, int max) {
        int randomNum = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return randomNum;
    }

    public static void randomGuesser(){
        int min = 1, max = 100, guessCount = 0;
        boolean flag = false;

        while (!flag) {
            int randomNum = randomNumGenerator(min, max), userNum = 0;
            boolean enter = false;
            String outcomeText =  "", feedbackText = "", windowTitle = "║ SAYI BİLMECE ║", windowOpener = "╔══════════════╗\n║  SAYI BİLMECE  ║\n╚══════════════╝";

            JOptionPane.showMessageDialog(null, windowOpener + "\nSayı bilme yarışmasına hoşgeldiniz!\nSizin için 1 ile 100 arasında bir sayı tahmin edelim.\nBen sayımı buldum, ilk tahmininizi alayım.");

            String[] difficulties = { "Kolay", "Orta", "Zor", "Nihai Zorluk"};
            int difficultyOption = JOptionPane.showOptionDialog(null, "Zorluk seçiniz",windowTitle , JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, difficulties, difficulties[0]);
            switch (difficultyOption) {
                case 0 -> guessCount = 20;
                case 1 -> guessCount = 15;
                case 2 -> guessCount = 10;
                case 3 -> guessCount = 3;
            }

            while (!enter) {
                try {
                    //userNum = Integer.parseInt(scanner.nextLine());
                    String userNumS = JOptionPane.showInputDialog(null, windowOpener + "\nİlk tahmininiz\n(Tahmin hakkınız: " + guessCount + ")",windowTitle ,JOptionPane.WARNING_MESSAGE);
                    userNum = Integer.parseInt(userNumS);
                    enter = true;
                    guessCount--;
                } catch (Exception e) {
                    System.out.println("Sadece sayı giriniz!");
                }
            }
            while (userNum != randomNum && guessCount > 0) {
                if (userNum < randomNum) feedbackText = "Tahmininiz çok küçük! Tekrar deneyin.";
                else feedbackText = "Tahmininiz çok büyük! Tekrar deneyin.";
                enter = false;
                while (!enter) {
                    try {
                        //userNum = Integer.parseInt(scanner.nextLine());
                        String userNumS = JOptionPane.showInputDialog(null, windowOpener + "\n" + feedbackText + "\n(Kalan tahmin hakkınız: " + guessCount + ")",windowTitle ,JOptionPane.WARNING_MESSAGE);
                        userNum = Integer.parseInt(userNumS);
                        enter = true;
                        guessCount--;
                    } catch (Exception e) {
                        System.out.println("Sadece sayı giriniz!");
                    }
                }
            }

            if (guessCount > 0 && difficultyOption == 3) outcomeText = "NİHAİ TAHMİN!";
            else if (guessCount > 0) outcomeText = "DOĞRU TAHMİN!";
            else outcomeText = "TAHMİN HAKKIN TÜKENDİ! Oyun bitti...";
            int playAgain = JOptionPane.showConfirmDialog(null, outcomeText + "\nRastgele sayıyı " + randomNum + " olarak seçmiştim." + "\nTekrar oynamak istiyor musunuz?",windowTitle , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(playAgain == JOptionPane.NO_OPTION) flag = true;
        }
    }
}

class conditionedNum {
    // 4. Soru
    /* 「SORU」
        abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
        koşul 1 cba > abc olacak
        koşul 2 abc asal sayı olacak
        koşul 3 cba asal sayı olacak
        koşul 4 ab asal sayı olacak
        koşul 5 bc asal sayı olacak
        koşul 6 cbasal sayı olacak
        koşul 7 ba asal sayı olacak
        Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.
    */
    /* 「AÇIKLAMA」
        * Bu çözümde üstte verilen koşulları sağlayan üç basamaklı sayılar bulunacaktır. Başlangıç değeri olarak en küçük üç basamaklı sayı 100 yazılmıştır.
        while döngüsü ile 100'den başlayarak tüm üç basamaklı sayılar değerlendirilecektir.
        * Döngü başında şuan bulunan sayı yüzlük, onluk ve birlik değerlerine ayrılmıştır. Ayrıca ters hali hesaplanmıştır.
        * İç while döngüsünde eğer koşulları sağlayan bir sayı varsa konsola yazdırılacaktır. Sağlayıp sağlamaması bağımsız olarak döngü kırılacaktır
        ve ardından sayı 1 arttırılacaktır.
        * Asal olma şartları "isPrime" fonksiyonu ile kontrol edilecektir.
    */
    public static void conditionedMain() {
        int num = 100;
        while (num < 1000) {
            int hundred = (num - num % 100) / 100, ten = ((num - hundred * 100) - (num - hundred * 100) % 10) / 10, one = (num - hundred * 100 - ten * 10), reverseNum = one * 100 + ten * 10 + hundred;
            boolean flag = false;
            while (!flag) {
                if (reverseNum > num && isPrime(num) && isPrime(reverseNum) && isPrime(hundred * 10 + ten) && isPrime(ten * 10 + one) && isPrime(one * 10 + ten) && isPrime(ten * 10 + hundred)) System.out.println(num);
                flag = true;
            } num++;
        }
    }

    public static boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
        {   if(n % i == 0) return false;
        }   return true;
    }
}

class primeXMethod {
    // 5. Soru
    /* 「SORU」
        Aşağıda açıklanan isPrimeX isimli metodu yazınız:
        isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer sayı  asal  ise  bu  kez
        sayının basamak değerleri toplanarak elde edilen sayının asal olup olmadığı test edilecektir.Bu işlem sonuçta tek basamaklı bir sayı kalana kadar
        devam edilecektir.
        Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise isPrimeX metodu true değerine geri dönecektir.
        Eğer herhangi bir kademede asal olmayan bir sayı elde edilirse metot false değerine geri dönecektir.
    */
    /* 「AÇIKLAMA」
        * "isPrimeX" fonksiyonu verilen argümanı değerlendirip şartlar sağlanması halinde true, sağlanmazsa false gönderecektir.
        * Sayının tek basamaklı olana kadar işleme gireceği döngüye girilince en başta sayı geçici int'e atanmaktadır.
        Sonrasında işlemlerin sonrası için boş bir ArrayList oluşturulmaktadır. Bu işlemler döngü kırılmadıkça her seferinde yapılacaktır.
        * Ardından girilen sayının asal olup olmadığı kontrol edilmektedir ve asal ise basamaklarına ayrılmaktadır. Basamaklar toplanılıp, num
        değişkeninin yerine geçkmektedir.
        * Eğer sayı herhangi bir adımda asal olmazsa false dönecektir.
        * Gİirlen sayıların asal olup olmadığı "conditionedNum" sınıfı altındaki "isPrime" fonksiyonu tarafından kontrol edilmektedir.
    */
    public static boolean isPrimeX(int num) {
        while (num > 10) {
            int tempNum = num;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            if (conditionedNum.isPrime(num)) {
                while (tempNum > 0) {
                    arr.add(tempNum % 10);
                    tempNum /= 10;
                }
                for (int nums: arr) tempNum += nums;
            } else return false;
            num = tempNum;
        }
        return true;
    }
}