public class MatrizRecursiva {

    public static int[][] criaMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int valor = 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor++;
            }
        }
        return matriz;
    }

    public static void exibeMatriz(int[][] matriz, int linha, int coluna) {
        if (linha == matriz.length) {
            return;
        }

        System.out.print(matriz[linha][coluna] + " ");
        if (coluna + 1 < matriz[0].length) {
            exibeMatriz(matriz, linha, coluna + 1);
        } else {
            System.out.println();
            exibeMatriz(matriz, linha + 1, 0);
        }
    }

    public static void main(String[] args) {
        int[][] matriz = criaMatriz(3, 3);
        exibeMatriz(matriz, 0, 0);
    }
}