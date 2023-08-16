public class ExercicioDeFixacao {
    public static void main(String[] args) {
        double salarioAnual = 30000;
        double primeiraFaixa = 9.17 / 100;
        double segundaFaixa = 34.35 / 100;
        double terceiraFaixa = 49.9 / 100;
        double salrioLiquido;

        if (salarioAnual >= 65000){
            salrioLiquido = terceiraFaixa * salarioAnual;
        }else if (salarioAnual <= 40000 && salarioAnual >= 40000){
            salrioLiquido = salarioAnual * segundaFaixa;
        }else{
            salrioLiquido = salarioAnual * primeiraFaixa;
        }
        System.out.println(salrioLiquido);


    }
}
