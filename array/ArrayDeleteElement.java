package sarbajit.array;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=7;
        int n = 6, index=1;

        for (int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        for (int i=index; i<n; i++){
            A[i-1] = A[i];
        }
        n--;
        for (int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
}
