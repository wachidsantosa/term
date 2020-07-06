package com.example.trermpolicy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class data extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetType, GetIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getSupportActionBar().setTitle("");
        GetType = findViewById(R.id.gettype);
        GetIsi = findViewById(R.id.getisi);

       // GetIsi.loadData("<p style\"text-align: justify\">"+GetIsi+"</p>","text/html","UTF-8");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){
            case "Syarat dan Ketentuan":
                GetType.setText("Syarat dan Ketentuan");
                GetIsi.setText("Berlaku sejak 20 April 2020\n" +
                        "   Selamat datang di aplikasi Nakula Education (nakula.co.id), yang merupakan bagian dari PT. SANS MITRA INDONESIA sebuah perusahaan yang terdaftar secara sah berdasarkan hukum Negara Republik Indonesia. Syarat dan ketentuan ini mengatur penggunaan dari akses platform sampai penggunaan layanan aplikasi. Syarat dan ketentuan dapat berubah atau diperbaharui sewaktu-waktu tanpa ada pemberitahuan terlebih dahulu. \n" +
                        "   Dengan mengakses / menggunakan aplikasi ini, berarti pengguna (ANDA) setuju untuk terikat dengan syarat dan ketentuan penggunaan aplikasi Nakula Education (KAMI). Silahkan hapus / uninstall secara permanen aplikasi ini dari device anda, jika tidak menyetujui syarat dan ketentuan dalam penggunaan aplikasi ini.\n" +
                        "\n" +
                        "A.\tPENGGUNA \n" +
                        "(berarti setiap orang yang mengakses dan menggunakan layanan yang \tdisediakan oleh kami selaku PT. SANS MITRA INDONESIA, termasuk diantaranya Pengguna \tBelum Terdaftar dan Pengguna Terdaftar).\t\n" +
                        "1.\tPengguna wajib mengisi data diri secara lengkap dan jujur didalam aplikasi.\n" +
                        "2.\tPengguna wajib berusia minimal 16 tahun, baik yang belum/pernah/sudah menikah, atau Yang telah memiliki persyaratan yang diakui secara hukum termasuk dalam kategori Pengguna yang sudah dewasa / terlepas dari Hukum Perlindungan Anak.\n" +
                        "3.\tPengguna dilarang menggunakan / mengakses akun yang bukan milik sendiri / pribadi tanpa seizin dari pemilik akun asli.\n" +
                        "4.\tPengguna bertanggung jawab atas informasi data diri yang telah diberikannya kepada PT. SANS MITRA INDONESIA melalui aplikasi Nakula Education, bilamana suatu hari terjadi kesalahan data yang menyebabkan penggunaan layanan menjadi terhambat.\n" +
                        "5.\tPengguna tidak berhak menuntut kami selaku PT. SANS MITRA INDONESIA, bilamana terjadi kesalahan terkait informasi data diri yang disebabkan oleh pengguna sendiri (baik itu kesengajaan maupun ketidaksengajaan).\n" +
                        "6.\tPengguna akan mendapat berbagai macam informasi dan promo menarik dari Nakula Education. Pengguna bisa berhenti berlangganan, jika tidak ingin menerima informasi dan promo tersebut.\n" +
                        "7.\tPengguna bersedia menerima kebijakan Nakula Education untuk setiap perubahan harga produk yang dijual melalui aplikasi tanpa pemberitahuan sebelumnya.\n" +
                        "8.\tPengguna bersedia untuk tidak menggunakan aplikasi Nakula Education dengan tujuan yang dapat merugikan individu, organisasi, maupun negara.\n" +
                        "9.\tPengguna bersedia menerima setiap perubahan yang terdapat didalam aplikasi Nakula Education tanpa pemberitahuan sebelumnya.\n" +
                        "10.\tPengguna, dengan ini menyatakan tidak akan melanggar peraturan perundang-undangan mengenai pembelajaran online dan transaksi online yang berlaku di negara Indonesia maupun di negara lainnya. Bilamana suatu hari terjadi pelanggaran yang disebabkan oleh pengguna, maka pengguna siap menerima konsekuensi hukum yang berlaku di negara tersebut.\n" +
                        "\n" +
                        "B.\tPENDAFTARAN AKUN ANDA\n" +
                        "1.\tSaat anda melakukan pendaftaran, kami akan menyajikan beberapa form isian terkait data \tyang akan anda daftarkan. Sistem kami akan secara otomatis membuatkan dan \tmengaktifkan akun pada platform yang anda gunakan, setelah anda melakukan \tpendaftaran.\n" +
                        "2.\tAkun yang telah didaftarkan sesuai dengan data yang terkirim melalui aplikasi adalah \tpemegang sah dari akun terdaftar. Akun tidak boleh dialihkan kepada pengguna lain.\n" +
                        "3.\tKami berhak melakukan pembatasan atau menonaktifkan fasilitas dalam aplikasi, jika suatu \thari ditemukan indikasi atau alasan yang cukup kuat bahwa aplikasi anda telah digunakan \toleh orang lain.\n" +
                        "\n" +
                        "C.\tAKSES TERHADAP PLATFORM\n" +
                        "1.\tKami tidak menjamin konten maupun fungsi yang terdapat didalam aplikasi, seluruhnya tersedia dan berjalan dengan normal. Izin penggunaan terhadap aplikasi kami bersifat tidak permanen dan kami dapat melakukan penarikan, penangguhan, maupun perubahan terhadap bagian apapun didalam aplikasi kami tanpa pemberitahuan sebelumnya.\n" +
                        "2.\tAnda memiliki hak dan tanggung jawab terhadap pengaturan akun yang telah anda buat diaplikasi.\n" +
                        "\n" +
                        "D.\tINFORMASI PRIBADI ANDA\n" +
                        "1.\tPengumpulan, pembagian, dan pengolahan data seperti nama, nomor telepon/telepon \tgenggam, alamat surat eletronik (e-mail) dan lainnya yang anda berikan saat mendaftarkan \tdiri \tdiaplikasi kami, tunduk terhadap syarat dan ketentuan aplikasi.\n" +
                        "2.\tBila suatu hari terdapat data yang anda berikan tidak sesuai dengan fakta, maka  \tpenonaktifan ataupun penghapusan akun akan dilakukan dengan sebelumnya \tmengkonfirmasi terkait data yang anda berikan.\n" +
                        "3.\tData anda yang telah didaftarkan melalui aplikasi kami, sepenuhnya milik PT. SANS MITRA \tINDONESIA dan menyerahkan kuasa kepada kami untuk digunakan sebagai kepentingan \tperusahaan tanpa ada pemberitahuan sebelumnya.\n" +
                        "4.\tSegala bentuk keamanan dan kerahasiaan akun anda, seperti nama yang didaftarkan, surat \telektronik (e-mail), nomor telepon genggam (Handphone), password (kata sandi), menjadi \ttanggung jawab anda sebagai pemilik akun. Bila suatu hari terdapat pengalihan / \tpembobolan akun, maka kami tidak bertanggung jawab terhadap apapun yang terdapat \tdidalam akun anda.\n" +
                        "\n" +
                        "E.\tPENGGUNAAN APLIKASI\n" +
                        "1.\tAnda diperbolehkan menggunakan aplikasi kami dengan tujuan tujuan yang berdasarkan \tpada hukum yang berlaku dan ketentuan didalam aplikasi. \n" +
                        "2.\tAnda tidak boleh menggunakan aplikasi kami sebagai media/alat untuk melanggar aturan \thukum yang bersifat nasional maupun internasional.\n" +
                        "3.\tAnda tidak boleh menggunakan aplikasi kami sebagai media/alat untuk merugikan individu, \tkelompok, organisasi, maupun negara.\n" +
                        "4.\tAnda tidak boleh menyalin, mereproduksi, memperbanyak, maupun menjual kembali \tseluruh konten yang terdapat didalam aplikasi kami.\n" +
                        "5.\tAnda tidak boleh merusak dan mengubah apapun fungsi, asset maupun source code \tdidalam aplikasi maupun sumber daya dalam jaringan kami.\n" +
                        "\n" +
                        "F.\tKETENTUAN LAIN\n" +
                        "1.\tAnda mengetahui bahwa syarat dan ketentuan ini merupakan bentuk perjanjian \telektronik, tindakan anda saat melakukan pendaftaran dan menekan tombol “Daftar” \tmerupakan bentuk persetujuan yang bersifat aktif serta mengikatkan diri anda terhadap \tseluruh syarat dan ketentuan kami.\n" +
                        "2.\tKami berhak meminta anda untuk menunjukkan berkas-berkas asli dari data yang telah anda \tinput kedalam aplikasi kami, bilamana terjadi hal-hal yang diperlukan untuk mendukung \tkeperluan verifikasi dari sisi hukum maupun non hukum.\n" +
                        "3.\tSyarat dan ketentuan kami dapat berubah sewaktu-waktu tanpa ada pemberitahuan \tterlebih dahulu kepada anda, untuk itu silahkan kunjungi halaman syarat dan ketentuan \tkami secara berkala untuk dapat mengetahui syarat dan ketentuan terbaru.\n");
                //
                break;

            case "PRIVACY POLICE":
                GetType.setText("PRIVACY POLICY");
                GetIsi.setText("Berlaku, 1 Juli 2020\n" +
                        "   Kerahasian Informasi Pribadi merupakan hal terpenting bagi PT. SANS MITRA INDONESIA (“Kami”). Kami berkomitmen untuk melindungi dan menghormati privasi pengguna (“Anda”) saat mengakses dan menggunakan aplikasi Nakula Edu, situs web (www.nakula.co.id) dan situs web lain yang Kami kelola), fitur, teknologi, konten dan produk yang Kami sediakan (selanjutnya, secara Bersama-sama disebut sebagai “Platform”).\n" +
                        "   Kebijakan Privasi ini mengatur landasan dasar mengenai bagaimana Kami menggunakan informasi pribadi yang Kami kumpulkan dan/atau Anda berikan (“Informasi Pribadi”). Kebijakan Privasi ini berlaku bagi seluruh pengguna Platform, kecuali diatur pada Kebijakan Privasi yang terpisah. Mohon membaca Kebijakan Privasi Kami dengan seksama sehingga Anda memahami pendekatan dan cara Kami dalam menggunakan informasi tersebut.\n" +
                        "   Dengan mengunjungi dan/atau mendaftar Akun pada Platform Kami, Anda dan/atau orang tua, wali atau pengampu Anda (jika Anda berusia dibawah 18 (delapan belas) tahun) menerima dan menyetujui pendekatan serta cara-cara yang dijelaskan dalam Kebijakan Privasi ini\n" +
                        "\n" +
                        "1. INFORMASI PRIBADI YANG DAPAT KAMI KUMPULKAN\n" +
                        "Kami dapat mengumpulkan Informasi Pribadi berupa:\n" +
                        "a.\tInformasi yang Anda berikan. Anda dapat memberikan informasi melalui formulir elektronik pada Platform Kami maupun dengan berkorespondensi melalui telepon, surat elektronik. Informasi ini meliputi informasi yang Anda berikan ketika mendaftar pada Platform Kami, berlangganan layanan Kami, mencari produk, berpartisipasi dalam diskusi online atau fungsi media sosial lain pada Platform Kami, mengikuti kompetisi, promosi, atau survei, serta ketika Anda melaporkan masalah dengan Platform Kami. Informasi yang Anda berikan dapat meliputi nama, alamat, alamat surat elektronik, nomor telepon,informasi finansial dan kartu kredit, deskripsi pribadi, foto, dan data lainnya. Kami dapat meminta Anda untuk melakukan verifikasi terhadap informasi yang Anda berikan, untuk memastikan akurasi dari informasi tersebut.\n" +
                        "b.\tInformasi yang Kami kumpulkan. Setiap kunjungan Anda ke Platform Kami, Kami dapat mengumpulkan informasi berikut secara otomatis:\n" +
                        "i.\tInformasi teknis, meliputi alamat Protokol Internet (IP address) yang digunakan untuk menghubungkan komputer Anda dengan internet, informasi log in Anda, jenis dan versi perambah (browser) yang digunakan, pengaturan zona waktu, jenis dan versi ekstensi perambah (browser plug-in), system operasi dan platform;\n" +
                        "ii.\tInformasi tentang kunjungan Anda, termasuk daftar lengkap Lokator Sumber Seragam (Uniform Resource Locators atau URL) yang dikunjungi menuju, melalui, dan dari Platform Kami (termasuk tanggal dan waktu); produk yang Anda lihat atau cari; waktu respon halaman, masalah pengunduhan, lama kunjungan pada halaman tertentu, informasi interaksi pada halaman (seperti pengguliran, klik, maupun pergerakan tetikus), metode yang digunakan untuk meninggalkan situs, serta nomor telepon yang digunakan untuk menghubungi layanan pelanggan Kami.\n" +
                        "iii.\tData nilai Anda, termasuk namun tidak terbatas pada hasil ujian Anda yang diperoleh melalui Platform, serta data akademis lain.\n" +
                        "c.\tInformasi yang Kami terima dari sumber lain. Kami dapat menerima informasi jika Anda menggunakan situs lain yang Kami operasikan atau layanan lain yang Kami sediakan. Kami juga bekerja sama dengan pihak ketiga (termasuk, namun tidak terbatas pada misalnya, mitra bisnis, sub-kontraktor dalam pelayanan teknis, jasa pembayaran dan pengantaran, jaringan periklanan, penyedia analisis, penyedia pencarian informasi, serta agen acuan kredit) (“Mitra Kami”) dan dapat menerima informasi dari mereka. Kami akan mengambil langkah-langkah dalam batas kewajaran untuk melakukan verifikasi terhadap informasi yang Kami dapatkan dari sumber lain sesuai dengan Peraturan yang Berlaku.\n" +
                        "\n" +
                        "2. PENGGUNAAN INFORMASI PRIBADI\n" +
                        "Kami menggunakan Informasi Pribadi dengan cara-cara berikut:\n" +
                        "a.\tInformasi yang Anda berikan. Kami akan menggunakan informasi ini:\n" +
                        "i.\tuntuk menjalankan kewajiban Kami dalam menyediakan informasi, produk, dan jasa kepada Anda;\n" +
                        "ii.\tuntuk menyediakan informasi terkait produk dan jasa lain yang Kami tawarkan; guna menyediakan Anda, atau mengizinkan pihak ketiga untuk menyediakan Anda, informasi tentang produk dan jasa yang Kami anggap dapat menarik minat Anda. Jika Anda adalah pelanggan lama, Kami dapat menghubungi Anda secara elektronik atau cara-cara lain dengan informasi tentang produk dan jasa Kami. Jika Anda adalah pelanggan baru, dan di mana Kami mengizinkan pihak ketiga untuk menggunakan Data Pribadi Anda, Kami (atau mereka) dapat menghubungi Anda secara elektronik hanya jika Anda sudah memberikan persetujuan.\n" +
                        "iii.\tuntuk memberitahukan Anda tentang perubahan pada jasa Kami;\n" +
                        "iv.\tuntuk memastikan bahwa konten dari Platform Kami disajikan dengan cara yang paling efektif bagi Anda.\n" +
                        "b.\tInformasi yang Kami kumpulkan. Kami akan menggunakan informasi ini:\n" +
                        "i.\tuntuk mengelola Platform dan operasi internal Kami, termasuk pencarian sumber masalah (troubleshooting), analisis data, pengujian, penelitian, serta tujuan-tujuan statistik dan survei lainnya;\n" +
                        "ii.\tuntuk memperbaiki Platform Kami sehingga konten dipastikan dapat disajikan dengan cara yang paling efektif untuk Anda;\n" +
                        "iii.\tuntuk memungkinkan Anda berpartisipasi dalam fitur interaktif layanan Kami, ketika Anda inginkan;\n" +
                        "iv.\tsebagai bagian dari usaha dalam memastikan keselamatan dan keamanan Platform Kami;\n" +
                        "v.\tuntuk mengukur dan memahami efektivitas periklanan yang Kami lakukan kepada Anda dan pihak lain, serta menyajikan iklan produk dan jasa yang relevan bagi Anda;\n" +
                        "vi.\tUntuk memberi masukan dan rekomendasi kepada Anda dan pengguna lain dalam Platform Kami mengenai produk dan jasa yang dapat menarik minat Anda dan mereka.\n" +
                        "c.\tInformasi yang Kami terima dari sumber lain. Kami dapat menggabungkan informasi yang Kami terima dari sumber lain dengan informasi yang Anda berikan dan informasi yang Kami kumpulkan. Kami dapat menggunakan informasi ini maupun informasi gabungan untuk tujuan yang diatur di atas (tergantung tipe informasi yang Kami terima).\n" +
                        "\n" +
                        "3. PENGUNGKAPAN INFORMASI PRIBADI\n" +
                        "   Kami dapat membagi atau menyingkap Data Pribadi dengan anggota kelompok usaha Kami, yang melingkupi cabang dan anak perusahaan, serta perusahaan induk utama dan anak perusahaannya.\n" +
                        "Kami dapat membagi Data Pribadi dengan pihak ketiga, termasuk :\n" +
                        "a.\tMitra bisnis, pemasok, dan sub-kontraktor dalam penyelenggarakan kontrak yang Kami laksanakan dengan mereka atau Anda.\n" +
                        "b.\tPemasang iklan dan jaringan iklan yang membutuhkan data untuk memilih dan menawarkan iklan yang relevan bagi Anda dan pengguna lain. Kami tidak membuka informasi tentang individu yang dapat diidentifikasi, namun Kami dapat menyediakan mereka informasi agregat tentang pengguna Kami (misalnya informasi bahwa 500 pria berusia di bawah 30 tahun telah mengakses tautan iklan mereka pada hari tertentu). Kami juga dapat memberikan informasi agregat untuk membantu pemasang iklan dalam menjangkau target audiens tertentu (misalnya, perempuan di Jakarta Pusat). Kami dapat menggunakan data personal yang Kami kumpulkan untuk memenuhi permintaan pemasang iklan dengan menampilkan iklan mereka kepada target audiens tersebut.\n" +
                        "c.\tPenyedia analisis dan mesin pencari yang membantu Kami untuk memperbaiki dan mengoptimasi Platform Kami.\n" +
                        "Kami dapat mengungkap informasi kepada pihak ketiga:\n" +
                        "a.\tDalam situasi di mana Kami menjual atau membeli perusahaan dan/atau aset, Kami dapat menyingkap data kepada calon pembeli atau penjual dari perusahaan atau aset tersebut.\n" +
                        "b.\tJika PT Sans Mitra Indonesia atau perusahaan induknya atau aset-aset substansial yang terkait di dalamnya diperoleh oleh pihak ketiga, maka Data Personal yang dimiliki tentang pelanggan Kami akan menjadi salah satu aset yang dipindahtangankan.\n" +
                        "c.\tJika Kami berada di bawah tanggung jawab untuk menyingkap atau membagi data guna mematuhi kewajiban hukum dan perjanjian lain; atau melindungi hak, harta benda, maupun keamanan dari PT Sans Mitra Indonesia, pelanggan Kami, dan lain-lain. Hal ini mencakup penukaran informasi dengan perusahaan dan organisasi lain untuk tujuan perlindungan dari penipuan dan pengurangan risiko kredit.\n" +
                        "\n" +
                        "4. PENYIMPANAN INFORMASI PRIBADI\n" +
                        "   Seluruh informasi Pribadi yang Anda berikan kepada Kami disimpan di server yang aman. Semua transaksi pembayaran pada Platform Kami akan dienkripsi. Dengan menyerahkan Informasi Pribadi Anda melalui Platform, Anda menyetujui pengalihan, penyimpanan, serta pengolahan yang terjadi pada Platform Kami. Kami akan mengambil langkah-langkah dalam batas kewajaran yang diperlukan untuk memastikan bahwa Informasi Pribadi tersebut diperlakukan dengan aman dan sesuai dengan Kebijakan Privasi serta Peraturan yang Berlaku.\n" +
                        "   Seluruh Informasi Pribadi yang Anda berikan akan Kami simpan: (i) selama Anda masih menjadi pengguna dari Platform Kami dan (ii) setidaknya 5 (lima) tahun sejak tanggal di mana Anda berhenti menggunakan Platform Kami; atau (iii) sesuai dengan tujuan awal dari pengumpulan Informasi Pribadi tersebut.\n" +
                        "   Dalam situasi di mana Kami memberikan (atau Anda memilih) sebuah kata sandi (password) yang mengizinkan Anda untuk mengakses bagian-bagian tertentu pada Platform Kami, Anda bertanggung jawab untuk menjaga kerahasiaan kata sandi tersebut. Kami meminta Anda untuk tidak membagi kata sandi kepada siapa pun.\n" +
                        "   Mohon untuk dapat diperhatikan bahwa transmisi informasi melalui internet tidak sepenuhnya aman. Meskipun demikian, Kami akan berusaha sebaik mungkin untuk melindungi Informasi Pribadi tersebut. Kami tidak bisa menjamin keamanan data yang dikirimkan ke Platform Kami; risiko dari setiap transmisi menjadi tanggung jawab Anda. Begitu Kami menerima Informasi Pribadi Anda, Kami akan menggunakan prosedur yang ketat dan fitur keamanan untuk mencegah akses yang tidak diizinkan.\n" +
                        "\n" +
                        "5. HAK ANDA\n" +
                        "   Anda dapat memohon untuk penghapusan Informasi Pribadi Anda pada Platform atau menarik persetujuan Anda untuk setiap atau segala pengumpulan, penggunaan atau pengungkapan Informasi Pribadi Anda dengan memberikan kepada kami pemberitahuan yang wajar secara tertulis melalui detail kontak yang tercantum pada bagian ke-9 di Kebijakan Privasi ini. Tergantung pada keadaan dan sifat permohonan yang Anda minta, Anda harus memahami dan mengakui bahwa setelah penarikan persetujuan atau permohonan penghapusan tersebut, Anda mungkin tidak lagi dapat menggunakan Platform. Penarikan persetujuan Anda dapat mengakibatkan penghentian Akun Anda atau hubungan kontraktual Anda dengan kami, dengan semua hak dan kewajiban yang muncul sepenuhnya harus dipenuhi. Setelah menerima pemberitahuan untuk menarik persetujuan untuk pengumpulan, penggunaan atau pengungkapan Informasi Pribadi Anda, Kami akan menginformasikan Anda tentang konsekuensi yang mungkin terjadi dari penarikan tersebut sehingga Anda dapat memutuskan apakah Anda tetap ingin menarik persetujuan atau tidak.\n" +
                        "   Anda dapat meminta kepada Kami untuk mengakses dan/atau mengoreksi Informasi Pribadi anda yang berada dalam kepemilikan dan penguasaan kami, dengan menghubungi kami di perincian yang disediakan di bawah ini.\n" +
                        "   Platform Kami dapat, dari waktu ke waktu, memuat link menuju dan dari situs-situs milik jaringan mitra, pemuat iklan, dan afiliasi lainnya. Jika Anda mengikuti link ke salah satu situs tersebut, mohon perhatikan bahwa situs-situs tersebut memiliki Kebijakan Privasi mereka sendiri dan bahwa Kami tidak bertanggung jawab atau memiliki kewajiban apa pun atas kebijakan-kebijakan tersebut. Mohon periksa kebijakan-kebijakan tersebut sebelum Anda menyerahkan informasi apa pun ke situs-situs tersebut.\n" +
                        "\n" +
                        "6. KEBIJAKAN COOKIES\n" +
                        "   Ketika Anda menggunakan Platform, Kami dapat menempatkan sejumlah cookies pada browser Anda. Cookies adalah sebuah berkas digital kecil berisi huruf dan angka yang Kami simpan pada browser atau hard drive komputer Anda atas persetujuan Anda. Cookies mengandung informasi yang dipindahkan ke diska keras komputer Anda.\n" +
                        "Cookies dapat digunakan untuk tujuan berikut: (1) mengaktifkan fungsi tertentu, (2) memberikan analisis, (3) menyimpan preferensi Anda; dan (4) memungkinkan pengiriman iklan dan pengiklanan berdasarkan perilaku. Beberapa cookies ini hanya akan digunakan jika Anda menggunakan fitur tertentu, atau memilih preferensi tertentu, sementara sebagian Cookies lain akan selalu digunakan.\n" +
                        "Kami menggunakan cookies untuk alasan-alasan berikut:\n" +
                        "a.\tCookies dibutuhkan untuk pengoperasian Platform Kami. Ini termasuk, misalnya, Cookies yang memungkinkan Anda memasuki Area yang aman di Platform Kami, menggunakan keranjang belanja, ataupun menggunakan layanan penagihan eletronik.\n" +
                        "b.\tCookies memungkinkan Kami untuk mengenali dan menghitung jumlah pengunjung serta melihat bagaimana pengunjung bergerak di sekitar Platform Kami saat mereka menggunakannya. Ini membantu Kami memperbaiki cara kerja Platform Kami, misalnya, dengan memastikan pengguna menemukan apa yang mereka cari dengan mudah.\n" +
                        "c.\tCookies digunakan untuk mengenali Anda saat kembali ke Platform Kami. Ini memungkinkan Kami melakukan personalisasi terhadap konten Kami untuk Anda, menyapa Anda dengan nama, serta mengingat preferensi Anda (misalnya, pilihan bahasa atau wilayah Anda).\n" +
                        "d.\tCookies mencatat kunjungan Anda ke Platform Kami, halaman yang telah Anda kunjungi, serta tautan yang telah Anda ikuti. Kami akan menggunakan informasi ini untuk membuat Platform Kami serta iklan yang terpasang di dalamnya lebih relevan kepada minat Anda. Kami juga dapat membagi informasi ini dengan pihak ketiga untuk tujuan tersebut.\n" +
                        "   Mohon perhatikan bahwa pihak ketiga (termasuk, misalnya, jaringan periklanan dan penyedia jasa eksternal seperti jasa analisis lalu lintas web) juga dapat menggunakan Cookies ini, di mana Kami tidak memiliki kendali. Cookies ini cenderung membuat Platform Kami dan iklan yang ditampilkan di dalamnya lebih relevan dengan minat Anda, serta meningkatkan kinerja Platform Kami.\n" +
                        "Anda dapat menghapus Cookies dengan cara melakukan fungsi clear data pada mobile app maupun web browser Anda yang memungkinkan Anda untuk menolak pengaturan seluruh atau sebagian Cookies. Akan tetapi, Anda mungkin tidak dapat mengakses seluruh atau sebagian Platform Kami.\n" +
                        "\n" +
                        "7. MATERI PEMASARAN\n" +
                        "   Kami dan Mitra Kami dapat mengirimkan anda dan/atau orang tua, wali atau pengampu Anda pemasaran langsung, iklan, dan komunikasi promosi melalui aplikasi push-notification, pesan melalui Aplikasi, pos, panggilan telepon, layanan pesan singkat, email dan/atau aplikasi pesan lainnya (“Materi Pemasaran”) jika Anda telah setuju untuk berlangganan milis Kami, dan/atau setuju untuk menerima materi pemasaran dan promosi dari Kami. Anda dapat memilih untuk tidak menerima komunikasi pemasaran tersebut kapan saja dengan menghubungi Kami melalui detail kontak yang tercantum pada bagian ke-9 Kebijakan Privasi ini. Mohon perhatikan bahwa jika Anda memilih untuk keluar, Kami masih dapat mengirimi Anda pesan-pesan non-promosi, seperti tanda terima atau informasi tentang Akun Anda.\n" +
                        "\n" +
                        "8. PERUBAHAN DALAM KEBIJAKAN PRIVASI KAMI\n" +
                        "   Perubahan apa pun yang Kami lakukan terhadap Kebijakan Privasi Kami di masa depan akan diterbitkan melalui halaman ini dan, ketika dibutuhkan, diberitahukan kepada Anda melalui surat elektronik. Mohon kunjungi kembali halaman ini dari waktu ke waktu untuk melihat adanya pemutakhiran atau perubahan pada Kebijakan Privasi Kami.\n" +
                        "\n" +
                        "9. CARA MENGHUBUNGI KAMI\n" +
                        "   Jika Anda memiliki pertanyaan mengenai Kebijakan Privasi ini atau Anda ingin mendapatkan akses dan/atau melakukan koreksi terhadap Informasi Pribadi Anda, silahkan dapat menghubungi Kami melalui support@nakula.co.id.\n" +
                        "\n");

                break;

         
        }

    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }

        return  super.onOptionsItemSelected(item);
    }
}