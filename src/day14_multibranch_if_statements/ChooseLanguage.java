package day14_multibranch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args){
        System.out.println("Choose Your language");

        int language  = 7;


        if (language ==1 ){
            System.out.println("hello thank you for your call");
        }else if (language ==2){
            System.out.println("hola, gracias para llamar");
        }else if (language == 3 ){
            System.out.println("merhaba, ne istiyon lan");
        }else if(language == 4 ){
            System.out.println("privet spazibo za vash zvonok");
        }else if (language ==5){
            System.out.println("merci, pir votre appel");
        }else {
            System.out.println("lets talk java in english, hello");
        }

    }
}
