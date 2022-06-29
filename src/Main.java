/**
 * Luiz Gustavo Leal Cortez e Guilherme Pontes
 * Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles serão solicitados:
 * Usando a classe AmostraTemperatura instancie o objeto t1 inicializado-o com o construtor AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v);
 * Exiba todas as propriedades de t1;
 * Agora instancie o objeto t2 usando o construtor AmostraTemperatura();
 * Exiba todas as propriedades de t2;
 * Usando os métodos setData(), setHora() e setValor, altere as propriedades de T1;
 * Exiba todas as propriedades de t1 novamente.
 */


public class Main {

    public static void main(String[] args){ //ano-mes-dia//hora-minuto-segundo//temperatura//
        AmostraTemperatura t1 = new AmostraTemperatura(2022, 11, 24, 16, 00, 00, 32.5f);


        System.out.println("Data: " + t1.getData());
        System.out.println("Hora: " + t1.getHora());
        System.out.println("Temperatura: " + t1.getValor());
        System.out.println("");


        AmostraTemperatura t2 = new AmostraTemperatura();


        System.out.println("Data: " + t2.getData());
        System.out.println("Hora: " + t2.getHora());
        System.out.println("Temperatura: " + t2.getValor());
        System.out.println("");



        t1.setData();
        t1.setHora();
        t1.setValor();


        System.out.println("Data: " + t1.getData());
        System.out.println("Hora: " + t1.getHora());
        System.out.println("Temperatura: " + t1.getValor());

    }
}