import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicios exer = new Exercicios();
        ExerMulher exerMulher = new ExerMulher();
        Planos planos = new Planos();
        int matriculaAluno = 12345678;

        System.out.println("----------------------------------------------------------");
        System.out.println("Catraca. Digite a sua matricula para liberar");
        int matricula = sc.nextInt();
        sc.nextLine();

            if (matricula != matriculaAluno) {
                System.out.println("Matricula Invalida!!!!");
                System.exit(0);
            } else {
                System.out.println("Catraca liberada!!!!");
            }
        System.out.println("----------------------------------------------------------");
        System.out.println(" ---- Olá, Bem vindo a Developer Gym ---- ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" Qual é o dia da semana? EX: Segunda ");
        System.out.printf("-----------------------------------------------------------");
        System.out.printf("%n 1 - Segunda%n 2 - Terça%n 3 - Quarta%n 4 - Quinta%n 5 - Sexta%n ");
        System.out.println("----------------------------------------------------------");
        String resposta = sc.nextLine();

        switch (resposta) {
            case "1" -> System.out.printf("Resultado Homem:  Peito, Triceps e Ombro %nResultado Mulher: Glúteos e Posteriores%n" + exer.getExerSegunda() + exerMulher.getExerSegunda());
            case "2" -> System.out.printf("Resultado Homem: Costas e Biceps Resultado %nMulher: Costas, Peito e ombro%n" + exer.getExerTerca() + exerMulher.getExerTerca());
            case "3" -> System.out.printf("Resultado Homem: Inferiores Completo Resultado %nMulher: Quadriceps e Glúteo%n" + exer.getExerQuarta() + exerMulher.getExerQuarta());
            case "4" -> System.out.printf("Descanso ou Cardio leve (30 a 40 min)");
            case "5" -> System.out.printf("Resultado Homem: Superiores Completo %nResultado Mulher: Glúteos, ênfase em isolamento" + exer.getExerSexta() + exerMulher.getExerSexta());
        }
        System.out.printf("%nGostaria de ver os planos e parcelas? s/n %n");
        String resposta1 = sc.nextLine();
        if (resposta1.equals("s")) {
            System.out.printf("Planos: " + planos.getPlanoOpen() + "%n" + planos.getPlanoStart() + "%n" + planos.getDiaria());
        } else {
            System.exit(0);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Qual plano você gostaria de ver as parcelas");
        System.out.printf("%n 1 - Plano Start %n 2 - Plano Open");
        String parcelas = sc.nextLine();

        switch (parcelas) {
            case "1" -> System.out.println("Plano Start");
            case "2" -> System.out.println("Plano Open");
        }
        for (int x = 1; x < 13; x++) {
            System.out.println(x + "-" + "Plano Start: " + planos.getMensalidadeStart());
        }
        for (int i = 1; i < 13; i++) {
            System.out.println(i + "-" + "Plano Open: " + planos.getMensalidadeOpen());
        }
    }
}