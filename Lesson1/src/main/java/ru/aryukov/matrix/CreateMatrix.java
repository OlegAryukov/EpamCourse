package ru.aryukov.matrix;

/**
 * Created by olega on 18.01.17.
 */
public class CreateMatrix {
    private int a;
    private int b;

    public CreateMatrix(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void showMatrix(){
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (j == i || ((b - (j + 1)) == i) ){
                    System.out.print("1");
                }else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        CreateMatrix createMatrix = new CreateMatrix(5,5);
        createMatrix.showMatrix();
    }
}
