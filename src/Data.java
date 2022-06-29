import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.lang.System.out;

/**
 @author: Guilherme Pontes e Luiz Gustavo Leal Cortez
  * Renomear as propriedades e métodos da classe Data,
  * deixando-os de acordo com o padrão UML (métodos getters e setters).
 */

public class Data {

    Scanner ler = new Scanner(System.in);

    private int ano;
    private  int mes ;
    private int dia;




    public Data() {
        this.setAno();
        this.setMes();
        this.setDia();
    }
    public Data(int a, int m, int d) {
        this. setAno(a);
        this.setMes(m);
        this.setDia(d);
    }

    public void setAno(int a) {
        if(a<0) {
            out.println("Ano informado esta fora do escopo");
            return;

        }
        this.ano =a;

    }

    public void setAno(){
        int a;
        out.println("Ano:");
        a = ler.nextInt();
        if(a<0) {
            out.println("Ano informado esta fora do escopo");
            return;
        }
        this.ano = a;

    }

    public void setMes(int m){
        if(m<0 || m > 12) {
            out.println("Mês informado esta fora do escopo");
            return;
        }

        this.mes = m;
    }

    public void setMes(){
        int m;

        do {
            out.println("Mes : (em numero) ");
            m = ler.nextInt();
            if (m < 0 || m > 12) {
                out.println("Mes informado esta fora do escopo");

            }
        }while (m < 0 || m > 12);

        this.mes = m;
    }

    public void setDia(int d) {
        voidDia(d);
    }

    public void setDia() {
        int d;



            out.println("Dia :");
            d = ler.nextInt();
            voidDia(d);

    }


    public void voidDia(int d) {
        switch (getMes()) {
            case 1 :
                if(d<1 || d>30)
                {
                    out.println("Dia fora do escopo");
                    setDia();
                    break;
                }
                this.dia = d;
                break;
            case 2:
                if(bisexto()== true) {
                    if(d<1 || d>29) {
                        out.println("Dia fora do escopo (Esse ano é bissexto)");
                        setDia();
                    }
                    this.dia =d;
                    break;
                }
                if(d<1 || d>28) {
                    out.println("Dia fora do escopo");
                    setDia();
                    break;
                }
                this.dia =d;
                break;
            case 3:
                if(d<1 || d > 31) {
                    out.println("Dia fora do escopo");
                    setDia();
                    break;
                }
                this.dia = d;
                break;
            case 4:
                if(d<1 || d > 30) {
                    out.println("Dia esta fora do escopo");
                    setDia();
                    break;
                }
                this.dia = d;
                break;
            case 5:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escopo, o mes de maio tem 31 dias");
                    setDia();
                    break;
                }
                this.dia = d;
                break;
            case 6:
                if(d < 1 || d>30) {
                    out.println("Dia fora do escopo, o mes de junho tem 30 dias");
                    setDia();
                    break;
                }
                this.dia = d;
                break;

            case 7:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escopo, o mes de julho tem 31 dias");
                    setDia();
                    break;
                }
                this.dia=d;
                break;
            case 8 :
                if(d < 1 || d>31) {
                    out.println("Dia fora do escopo, o mes de agosto tem 31 dias");
                    setDia();
                    break;
                }
                this.dia = d;
                break;

            case 9 :
                if(d < 1 || d>30) {
                    out.println("Dia fora do escopo, o mes de setembro tem 30 dias");
                    setDia();
                    break;
                }
                this.dia =d;
                break;

            case 10:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escopo, o mes de outubro tem 31 dias");
                    setDia();
                    break;
                }
                this.dia=d;
                break;

            case 11:
                if(d < 1 || d>30) {
                    out.println("Dia fora do escopo, o mes de novembro tem 30 dias");
                    setDia();
                    break;
                }
                this.dia =d;
                break;

            case 12:
                if(d < 1 || d>31) {
                    out.println("Dia fora do escopo, o mes de dezembro tem 31 dias");
                    setDia();
                    break;
                }
                this.dia =d;
                break;



        }
    }

    // gets
    public int getDia(){return  this.dia;}
    public  int getMes() {return  this.mes;}
    public int getAno(){return this.ano;
    }


    public boolean bisexto(){
        boolean anoBisexto;
        double bisexto = getAno()%4;
        if(bisexto !=0) {


            return anoBisexto = false;


        }


        return  anoBisexto = true;

    }

    public String mostra1() {
        String dia,mes,ano;
        dia = this.getDia()<10 ?"0" + this.getDia() : Integer.toString(getDia());
        mes = this.getMes()<10 ?"0" + this.getMes() : Integer.toString(getMes());
        ano = this.getAno()<10 ?"0" + this.getAno() : Integer.toString(getAno());

        return dia + "/" + mes + "/" + ano;
    }
    public String mostra2() {
        String mes,dia,ano;
        dia = this.getDia()<10 ?"0" + this.getDia() : Integer.toString(getDia());
        ano = this.getAno()<10 ?"0" + this.getAno() : Integer.toString(getAno());



        switch (getMes()) {
            case 1 :
                mes = "Janeiro";
                return dia + "/" + mes + "/" + ano;

            case 2:
                mes = "Fevereiro";
                return dia + "/" + mes + "/" + ano;

            case 3:
                mes = "Março";
                return dia + "/" + mes + "/" + ano;

            case 4:
                mes = "Abril";
                return dia + "/" + mes + "/" + ano;


            case 5:
                mes = "Maio";
                return dia + "/" + mes + "/" + ano;

            case 6:
                mes = "Junho";
                return dia + "/" + mes + "/" + ano;

            case 7:
                mes = "Julho";
                return dia + "/" + mes + "/" + ano;

            case 8:
                mes = "Agosto";
                return dia + "/" + mes + "/" + ano;

            case 9:
                mes = "Setembro";
                return dia + "/" + mes + "/" + ano;

            case 10:
                mes = "Outubro";
                return dia + "/" + mes + "/" + ano;

            case 11:
                mes = "Novembro";
                return dia + "/" + mes + "/" + ano;

            case 12:
                mes = "Dezembro";
                return dia + "/" + mes + "/" + ano;



        }
        return null;

    }

    public void apresentaDataAtual() {
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        System.out.println("\n\nData de hoje: "+data.format(LocalDateTime.now()));

    }
    public void diasTranscorridos() {
        LocalDate begin = LocalDate.of(getAno(), Month.JANUARY, 01);
        LocalDate end = LocalDate.of(getAno(), getMes(), getDia());
        long days = ChronoUnit.DAYS.between(begin, end);
        out.println("Dias transcorridos: "+days + " dias\n");
    }



}