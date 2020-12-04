public enum Tipo {
   GENERALE("generale"),
   TECNOLOGIA("teCnoloGia");


   String nome;


   private Tipo(String nome){
      this.nome = nome;
   }

   public String getNome(){
      return this.nome;
   }
}


