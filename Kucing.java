public class Kucing {
    
    public String nama;
    public String type;
    public int umur;
    
    //Constructor
    Kucing(){
        this.nama = "Jerry";
        this.type = "Persia";
        this.umur = 2;
    }
    
    Kucing (String nama, String type, int umur){
        this.nama = nama;
        this.type = type;
        this.umur = umur;
    }
    
    //encapsulation
    public String getNama(){
        return nama;
    }
    public String gettype(){
        return type;
    }
    public int getUmur(){
        return umur;
    }
    
    //overload
    public void TampilkanList(String cn, String ct, int u){
        System.out.println("Nama"+ cn +"Type "+ct+"umur "+ u);
    }
}