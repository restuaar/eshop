# Tutorial 1 

**Nama** : **Restu Ahmad Ar Ridho** <br/>
**NPM** : **2206028951** <br/>
**Kelas** : **AdPro - A**

## Refleksi 1
### Clean Code dan Secure Coding
Setelah mengikuti tutorial dan exercise menggunakan Spring Boot terdapat beberapa dari clean code yang sudah di implementasikan seperti:

  - ***Meaningful Name***  
 Pada projek kali ini setiap variabel yang diberikan memiliki makna yang sesuai sehingga memudahkan sekali dalam mencari dan mengingat varibel yang akan digunakan sehingga saya bisa langsung tau apa isi dari variabel tersebut tanpa harus melihat kembali dimana variabel tersebut diinisiasi. 

 - ***Function***   
 Fungsi yang dibuat tidak panjang dan juga setiap fungsi menangani tugas yang berbeda sehingga dalam melakukan *debugging* mudah dalam menemukan kesalahan karena fungsi yang digunakan antar *`class`* maupun berkas dalam kode kita seperti pada berkas `ProductRepository.java` setiap fungsi memiliki tugas yang berbeda untuk melakukan *create, edit, delete, findById* maupun *findAll* yang memiliki tugas sesuai dengan nama fungsi tersebut.

 - ***Comment***  
 Pada projek kali ini jarang menggunakan *comment* dalam menulis kode, namun menurut saya ada beberapa hal yang perlu ditambahkan karena ada beberapa hal yang tidak sesuai seperti pada saat ini saya menggunakan method POST untuk melakukan *edit product* dan GET untuk melakukan *delete product* sehingga kedepannya bisa diliat kembali dan dilakukan penyesuaian yang dengan method yang sesuai. Selain itu juga saya menghindari penggunaan *comment* seperti yang sudah dijelaskan bahwa **`Comment Do Not Make Up for Bad Code`** sehingga lebih menggunakan nama variabel atau fungsi yang lebih bermakna dan alur program sendiri yang menjelaskan juga.

 - ***Objects and Data Structure***  
  Object sudah dibuat secara private sehingga object tidak mudah dimanipulasi dan juga membuat suatu interface pada direktori `service` untuk mengurangi abstrak sehingga memudahkan untuk membuat kode.

 - ***Error Handling***  
  Masih ada beberapa yang perlu ditambah dalam menangani beberapa *error* seperti pada saat user membuat *product* ketika *name product* yang kosong dan *quantity product* yang kosong maupun nilai kurang dari 0.