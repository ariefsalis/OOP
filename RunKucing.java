 class RunKucing extends Kucing implements InterfaceKucing {
    @Override
    public void iMengeong(){
     System.out.println("ngeong");
    }  
    
    public static void main (String[] args){
        InterfaceKucing obj = new RunKucing();
                
        obj.iMengeong();
        
        Kucing pet = new Kucing();
        
        System.out.println("Nama Kucing : "+pet.getNama());
        
        pet.TampilkanList("Jerry","Persia",2);
       
    }
}
