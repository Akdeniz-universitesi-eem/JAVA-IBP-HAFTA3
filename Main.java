class Main {
    public static void main(String[] args) {
        // 1. Soru
        /* 「SORU」
            Yazılımda oluşabilecek kaç türlü hata vardır? Bunları açıklayınız. En az hata ile kod yazmak için ne yapılmalıdır?
        */
        /* 「AÇIKLAMA」

        */
        System.out.println("a");
        primeXNum.deneme();
        diceApp.dice();
    }
}

class diceApp {
    // 2. Soru
    /* 「SORU」
        Çift zar simülasyonu gerçekleştiriniz. Tavla da iki zar ile oynanır. 1-6 sayıları iki zar üzerindedir. Zarı  programa  artıran  java
        programını  yazınız. Ama gelen  sayıları zar resmini gösterecek şekil deekranda gösteriniz. (Zar resimleri internetten alabilirsiniz.)
    */
    /* 「AÇIKLAMA」

    */
    public static void dice() {
        int min = 1, max = 6;
        int diceNum1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int diceNum2 = (int)Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("İlk zar: " + diceNum1 + ". İkinci zar: " + diceNum2);
    }
}

class nubmerGuesser {
    // 3. Soru
    /* 「SORU」
        1-100  arasında  rastgele  sayı türeten  ve  kullanıcı  tarafından  tahmin  edilmeye  çalışan programı java programı yazınız.
        Kullanıcı girişlerini Joptionpane.showmessagedialog,joptionpane.showinputdialogyapılarını kullanınız. (try-catch yapısını kullanınız)
    */
    /* 「AÇIKLAMA」

    */
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

    */
}

class primeXNum {
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

    */
    public static void deneme() {
        System.out.println("This is an example");
    }
}