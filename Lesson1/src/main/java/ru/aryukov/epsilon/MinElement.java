package ru.aryukov.epsilon;

/**
 * Created by olega on 18.01.17.
 */
public class MinElement {

    private double epsilon;

    public MinElement(double epsilon){
        this.epsilon = epsilon;
    }

    public void getMin(){
        double result;
        int count = 0;
        do {
            count++;
            result = calculate(count);
        }while (result > epsilon);

        System.out.println(count - 1);
        for (int i = 0; i < count -1; i++){
            System.out.println(calculate(count));
        }

    }

    private double calculate(int count){
        return 1 / Math.pow(count + 1, 2);
    }
    public static void main(String[] args) {
        MinElement minElement = new MinElement(0.02);
        minElement.getMin();
    }

}
