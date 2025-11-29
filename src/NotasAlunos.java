public class NotasAlunos {
    public static void main(String[] args) {
        int tamanho = 5;

        double[] notasAlunos = new double[tamanho];

        notasAlunos[0] = 7.6;
        notasAlunos[1] = 8.5;
        notasAlunos[2] = 9.4;
        notasAlunos[3] = 10.0;
        notasAlunos[4] = 4.5;

        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(notasAlunos[i]);
        }
    }
}
