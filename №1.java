package com.company;
class Main {
// №1
    public static void main(String[] args) {
    int[] arr = new int[10];
    for(int i = 0; i<10; i++){
    if (i % 2 == 0) {
        arr[i] = 0;
        System.out.println(arr[i]);
    }else {
        arr[i] = 1;
        System.out.println(arr[i]);
           }
    }
    //№2
    int[] arr2 = new int[8];
    for(int i = 1; i<8; i++){
        arr2[i] = arr2[i-1] +3;
        System.out.println(arr2[i]);
        }

    //№3
    int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i<12; i++){
            if (arr3[i] < 6) {
                arr3[i] = arr3[i]*2;
            System.out.println(arr3[i]);}
            else {
                System.out.println(arr3[i]); }
}
    //№4
    int[][] quad = new int[9][9];
        for(int q = 0; q < quad.length; q++)
            for (int j = 0; j < quad.length; j++) {
                if (q == j) {
                    quad[q][j] = 1;
                } else if (q + j == quad.length) quad[q][j] = 1;
                else {
                    quad[q][j] = 0;
                }
            }
    //№5
                int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                int q = arr4[0];
                for (int i = 0; i < arr4.length; i++) {

                    if(arr4[i]> q){
                        q = arr4[i];
                    }}
                System.out.println("Наибольшее число - "+q);
                q = arr4[0];
                for (int i = 0; i < arr4.length; i++) {

                    if(arr4[i]< q){
                        q = arr4[i];
                    }}
                System.out.println("Наименьшее число - "+q);
    // №6
                int[] balance = {1, 3, 2, 4, 2, 1};
        boolean bal = true;
        if (balance[0]+balance[1]+balance[2] == balance[3]+balance[4]+balance[5]){
            bal = true;
        }else {bal = false;
        }
        System.out.println(bal);
    // №7
        int[] mas = {1,2,3,4,5,6};
        int f = 0;
        int n = 2;
        for (int b = 0; b < mas.length; b++) {
            f = mas[mas.length - n];
            n++;
            System.out.println(f);
            // Не получилось :(
        }













}
}
