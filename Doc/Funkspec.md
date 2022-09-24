# Funkspec

## 1. A rendszer céljai és nem céljai:

Céljai:

A számológép célja különböző matematikai műveletek elvégzése egész számokkal.

Ezek a műveletek lehetnek összeadás, kivonás stb.

Két számmal való műveletek elvégzése.

Nem célja:

Komplexebb matematikai műveletek elvégzése.

Például:

Egyenlet megoldás.

Gyök keresés egyenlet rendszerben.

## 2. Jelenlegi helyzet leírása:

Az oktatásban csak a Windows számológépet lehet használni amivel a diákok tudnak csalni a különböző dolgozatokon.

Ezért mi fejlesztünk egy egszerű számológépet amivel csak az alap operátorok használhatók.

A diákok egszerűen tudják majd használni a tesztek megírásakor.

## 3. Vágyálom rendszer leírása: 

Java alkalmazás létrehozása, amely könnyen átlátható és egyszerűen használható felületet biztosit a diákok számára, hogy a dolgozatokon kitudják számolni az adott matematikai feladatokat.

 Ennek segítségével csökkentvé a csalásnak a lehetőséget.

## 4. Követelménylista:

0-9-ig számok használata, és ezekkel való számítás.

Különböző matematikai operátorok használata:

- Kötelező operátorok:

	- K01 Összeadás

		- Két egészszámnak az összegének kiszámítása.

	- K02 Kivonás

		- Két egészszámnak a különbségének kiszámítása.

	- K03 Szorzás

		- Két egészszámnak a szorzatának kiszámítása.

	- K04 Osztás

		- Két egészszámot elosztva és annak az eredménye.

- További operátorok:

	- K05 Tizedes pont

		- Tizedes számokkal való számítás.

	- K06 Karakter törlés

		- Egy darab karakter törlése a számításból.

	- K07 Teljes törlés

		- Az egész számítás nullázása.

	- K08 Eredmény kiszámítása

		- Az adott eredmény kiszámítása.

- Opcionális operátorok:

	- K09 Zárójelek

		- Zárójelek használata a számításokban.

	- K10 Négyzetre emelés
		
		- Egy adott szám négyzetre emelése.

	- K11 Gyökvonás

		- Egy adott szám gyöke.

## 5. Jelenlegi üzleti folyamatok:

A mai világban rengeteg tudományos számológép programozható, vagy egyszerűen a dobozból kivéve már túl sokat tudnak egy átlagos iskolai felhasználásra.

Ezeket az előnyöket kihasználva a diákok észrevehetetlenül csalnak a teszteken.

A számológépek betiltása még sem megoldás, mivel néhány számítás feleslegesen sok időt igényel, amit a diákok tudásának számonkérésével lehetne tölteni. 

## 6. Igényelt üzleti folyamatok:

- Az alkalmazás megkönnyíti a tanárok dolgát mivel nem kell azon aggódniuk hogy a diákok esetlegesen csalnak a teszteken más számológéppel.

- Minden olyan számítógépen működik amin van java, mivel az alkalmazás alapja a java. 


## 7. Használati esetek:

Egyszerübb matematikai műveletek kiszámítása. 

## 8. Képernyő tervek:

![](kepernyoterv.png)

## 9. Fogalomtár:

platformfüggetlen:

 - A platformfüggetlen olyan szoftverekre vonatkozik, amelyek a hardveres és szoftveres konstrukciótól függetlenül működnek, és így hordozhatóak különféle generációs számítógépek és operációs rendszerek között.

 A hordozhatóságot elsősorban a nyílt forráskódú alkalmazások fejlesztői tartják szem előtt, mivel számukra fontos az, hogy az elkészült program mindenki számára hozzáférhető legyen.

Java fordító:

  - A Java fordító a fordító a Java programozási nyelv . 

A Java fordító leggyakoribb kimeneti formátuma a .class fájlok, amelyek a platform agnosztikus Java bytecode-ját tartalmazzák . 

Vannak olyan fordítók is, amelyek egy adott hardver / operációs rendszer kombinációra optimalizált gépi kódot állítanak elő .
