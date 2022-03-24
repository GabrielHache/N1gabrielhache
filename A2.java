public class A2 {
    public static void main(String[] args){
        A1 as = new A1("NEMO", "PALHAÇO");
        
        as.escreverpeixe();
                
        as.raça = "PALHAÇO";
        as.kg = 6;

        as.escreverpeixe();

        as.somarkg(2);

        as.escreverraça();

        
        String nomepeixe = as.peixeraça(); 
        System.out.println(nomepeixe);
}
}