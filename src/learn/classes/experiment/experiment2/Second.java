package learn.classes.experiment.experiment2;

public class Second {

    public static boolean isPrime(int num){
        int num1 = (int) Math.sqrt(num);
        if(num == 1)
            return false;
        else if(num == 2)
            return true;
        else{
            for(int i = 2; i <= num1; i++){
                if (num % i == 0)
                    return false;
            }return true;
        }
    }

    public static boolean isPalindrome(int num){
        int length = String.valueOf(num).length();

        if(num < 10)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int i = 0;
        int num = 2;
        int line = 0;
        while(i < 100){
            if(line % 10 == 0){
                System.out.print("\n");
            }
            if(isPrime(num) || isPalindrome(num)){
                System.out.print(num+"  ");
                i++;
                line++;
            }num++;
        }
    }
}
