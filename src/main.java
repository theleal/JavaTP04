import java.util.Scanner;
import static java.lang.System.out;

//@author: Guilherme Pontes, Luiz Gustavo Leal Cortez

public class main {
    public  static void main(String[] args) {

        out.println("Inserindo por parametro\n");

        Data dataParemetro = new Data(1999,1,05);

        out.println(dataParemetro.mostra1());
        out.println("\nMostrando os retornos da variaveis\n");
        out.println("Dia : "+dataParemetro.retDia());
        out.println("Mes : "+dataParemetro.retMes());
        out.println("Ano : "+dataParemetro.retAno());
        out.println("Ano eh bissexto? "+dataParemetro.bisexto());
        out.println("\ndd/mm/ano");
        out.println(dataParemetro.mostra1());
        out.println("\ndd/mesPorExtenso/ano");
        out.println(dataParemetro.mostra2());
        out.println("\n");
        dataParemetro.diasTranscorridos();
        dataParemetro.apresentaDataAtual();



        out.println("\nInserindo via interacao do usuario ");


        Data dataVar = new Data();

        out.println("A data digitada:" + dataVar.mostra1());
        out.println("\nMostrando os retornos da variaveis\n");
        out.println("Dia : "+dataVar.retDia());
        out.println("Mes : "+dataVar.retMes());
        out.println("Ano : "+dataVar.retAno());
        out.println("Ano eh bissexto? "+dataVar.bisexto());
        out.println("\ndd/mm/ano");
        out.println(dataVar.mostra1());
        out.println("\ndd/mesPorExtenso/ano");
        out.println(dataVar.mostra2());
        out.println("\n");
        dataVar.diasTranscorridos();
        dataVar.apresentaDataAtual();








    }

}