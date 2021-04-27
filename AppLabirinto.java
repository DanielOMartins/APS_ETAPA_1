public class AppLabirinto {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        labirinto.iniciarLab();
        labirinto.imprimirLab();
        System.out.println("\n procurando solucao \n");
        int linhainicio = labirinto.linhaInicio();
        int colunainicio = labirinto.colunainicio();
        boolean achou = labirinto.procurarCaminho(linhainicio, colunainicio);
        if(achou){
            System.out.println("achou caminho");
        } else {
            System.out.println("não tem caminho");
        }
    }
}
