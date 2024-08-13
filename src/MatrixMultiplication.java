public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
                {1, 12,7},
                {9, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {9, 8, 71},
                {61, 5, 4},
                {3, 21, 1}
        };

        int rowsA = A.length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];

        Thread[] threads = new Thread[rowsA];
        for (int i = 0; i < rowsA; i++) {
            threads[i] = new WorkerThread(A, B, C, i);
            threads[i].start();
        }

        for (int i = 0; i < rowsA; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiply(int[][] A, int[][] B, int[][] C, int row) {
        int n = B.length;
        int m = B[0].length;

        for (int j = 0; j < m; j++) {
            C[row][j] = 0;
            for (int k = 0; k < n; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }

    static class WorkerThread extends Thread {
        int[][] A;
        int[][] B;
        int[][] C;
        int row;
        WorkerThread(int[][] A, int[][] B, int[][] C, int row) {
            this.A = A;
            this.B = B;
            this.C = C;
            this.row = row;
        }
        public void run() {
            multiply(A, B, C, row);
        }
    }
}