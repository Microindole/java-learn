package learn.classes.experiment.experiment2;

import java.util.Scanner;

public class Secondtt {

    public static int indexofSmallestElement(double[] array){
        double minNum = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < minNum){
                minNum = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个数字：");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextDouble();
        }
        int note = indexofSmallestElement(array);
        System.out.println("最小元素的下下标为 "+note+"\n"+"这个数为 "+array[note]+"\n");
    }
}
