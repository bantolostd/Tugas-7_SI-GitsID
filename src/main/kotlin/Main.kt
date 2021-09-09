class Mahasiswa(_nama: String, _kampus: String, _prodi: String, _semester: Int) {
    var nama = _nama
    var kampus = _kampus
    var prodi = _prodi
    var semester = _semester

    fun tampilData() {
        println("========== Data Mahasiswa ==========")
        println("Nama\t\t: $nama")
        println("Kampus\t\t: $kampus")
        println("Prodi\t\t: $prodi")
        println("Semester\t: $semester")
    }
}
fun main(args: Array<String>) {
    val mahasiswa1 = Mahasiswa("Bantolo Setiadi", "Universitas Kristen Duta Wacana", "Informatika", 5)
    mahasiswa1.tampilData()
}