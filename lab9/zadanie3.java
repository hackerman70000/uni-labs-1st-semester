public class zadanie3 {
    public static void main(String[] args) {
        int firstRowSum = 4;
        int secondRowSum = 2;
        int[] columnSum = {1, 2, 1, 1, 1};

        matrixReconstruction(4, 2, columnSum);
    }
    public static void matrixReconstruction(int firstRowSum, int secondRowSum, int[] columnSum) {
        int[] firstRow = new int[columnSum.length];
        int[] secondRow = new int[columnSum.length];

        for (int i = 0; i < columnSum.length; i++) {
            switch (columnSum[i]) {
                case 0:
                    firstRow[i] = 0;
                    secondRow[i] = 0;
                    break;

                case 1:
                    if (firstRowSum > 0) {
                        firstRow[i] = 1;
                        firstRowSum--;
                    } else if (secondRowSum > 0) {
                        secondRow[i] = 1;
                        secondRowSum--;
                    } else {
                        System.out.println("nie ma takiej macierzy");
                    }

                    break;
                case 2:
                    if (firstRowSum < 1 || secondRowSum < 1)
                        System.out.println("nie ma takiej macierzy");
                    else {
                        secondRow[i]=1;
                        firstRow[i] = 1;
                        firstRowSum--;
                        secondRowSum--;

                    }
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + columnSum[i]);
            }
        }

        for (int i = 0; i < firstRow.length; i++)
            System.out.print(firstRow[i]);
        System.out.println("");

        for (int i = 0; i < firstRow.length; i++)
            System.out.print(secondRow[i]);
    }
}


