//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //definir
        int [][] barcos;
        int max;
        //inicializar
        barcos = new int [][]{
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,1,1,0},
                {0,0,0,0,0},
                {0,1,0,0,0}
        };

        recorrertablero(tablero);
            System.out.println("...");
    }
    public static void recorrertablero(int[][] tablero) {
            for (int i=0; i<5; i++){
                for(int j=0; j<5; j++) {
                    if (tablero[i][j]>0) {
                        switch (tablero[i][j]) {
                            case 1:
                                System.out.println("Submarino" + i + ":" + j);
                                break;

                            case 2:
                                System.out.println("Acorazado" + i + ":" + j);
                                break;

                            case 3:
                                System.out.println("Submarino" + i + ":" + j);
                                break;


                        }
                    }
                }
            }
    }
}