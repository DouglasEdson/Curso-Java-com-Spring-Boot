public class SalaDeAula {
    // Variável estática para contar o número de alunos
    static int totalAlunos= 27;

    //Método estático para adicionar alunos
    public static void adicionarAluno() {
        totalAlunos++;
    }

    // Método estático para exibir o número total de alunos
    public static void exibirTotalAlunos() {
        System.out.println("Total de alunos: " + totalAlunos);
    }

}
