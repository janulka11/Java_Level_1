package lesson2;
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Cycles {

        static void  invertArray(){
            int [] arr = {1,1,0,0,1,0,1,1,0,0};
            for ( int i = 0; i <arr.length; i++){
                if (arr[i]==1){
                    arr[i]=0;
                } else {
                    arr[i]=1;
                }
                System.out.println ( + arr[i]);
            }

 // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

            int [] ts = new int [8];
            for ( int i = 0; i <ts.length; i++){
                ts [i] = i * 3;
                System.out.println (+ts [i]);
            }

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
            int [] rs = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1,};
            for ( int i = 0; i <arr.length; i++) {
                if (rs[i]<6){
                    rs[i]= rs[i]*2;
                }
                System.out.println (+rs [i]);
            }
        }

    static void fillDiagonal(){
            int[][] ws = new int [4][4];
            for ( int i = 0; i <ws.length; i++) {
                for ( int j = 0; j <ws.length; j++){
                    ws [i][j]=(i==j || i+j==ws.length-1) ? 1:0;
                    System.out.print(ws [i][j] + " ");
                }
                System.out.println();
            }

    }

    public static void main(String[] args) {
        fillDiagonal();
    }


}











