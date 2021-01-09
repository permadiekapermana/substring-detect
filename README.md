# Deteksi Substring

## Program
Program untuk mendeteksi dua buah kata apakah kata tersebut termasuk dalam persamaan kata, substring, pencerminan, substring pencerminan, atau bukan substring
<br/><br/>
## Cara penggunaan program
-	Masukkan jumlah input kata yang ingin dilakukan dengan mengisi angka 1 hingga max 1000x
-	Masukkan dua kata, kata pertama dan kata kedua dipisahkan dengan menggunakan spasi
<br/><br/>
## Fungsi Program
Program ini dapat melakukan deteksi kata yang diinputkan oleh user dengan membandingkan kedua kata tersebut dengan rule seperti berikut :
-	Jika kedua kata tersebut sama identitk maka hasilnya “Sama”
Contoh : abc abc
-	Jika kata kedua merupakan kebalikan dari kata pertama, maka hasilnya “Pencerminan”
Contoh : abc cba
-	Jika kedua kata tersebut mengandung suatu substring maka hasilnya “Substring”
Contoh : permadi adi
-	Jika kedua kata tersebut mengandung substring namun dengan posisi terbalik maka hasilnya “Substring pencerminan”
Contoh : permadi ida
-	Jika tidak memenuhi semua ketentuan diatas maka hasilnya “Bukan Substring”
