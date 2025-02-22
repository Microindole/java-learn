package learn.classes.experiment.experiment1;

public class Forth {

    public static boolean Display(int num){
        return ((num % 5 == 0)||(num % 6 == 0)) && (num % 30 != 0);
    }

    public static void main(String[] args) {
        int line = 1;
        for(int i = 100; i <= 200; i++){
            if(Display(i)){
                System.out.print(i);
                if(line%10 == 0){
                    System.out.println(" ");
                }else{
                    System.out.print("  ");
                }line++;
            }
        }
    }
}
