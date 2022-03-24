public class A1 {
    String peixe;
    String raça;
    String caracter;
    int kg;

    A1(String peixe){
        this.peixe = peixe;
        this.kg = 6;
    }

    A1(String peixe, String raça){
        this.peixe = peixe;
        this.kg = 6;
        this.raça = raça;
    }    

    A1(String peixe, String raça, String caracter){
        this.peixe = peixe;
        this.kg = 6;
        this.raça = raça;
        this.caracter = caracter;
    }
    
    void escreverpeixe(){
        System.out.println(peixe + " tem " + kg + " KG.");
    }

    void somarkg(int kg){
        this.kg = this.kg + kg;
    }

    void escreverraça(){  
        System.out.println(peixe + " " +raça);        
    }

    String nomepeixe(){ 
        String peixeraça = peixe + " " + raça;
        return peixeraça;
    }

    
}