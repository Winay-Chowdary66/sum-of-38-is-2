import java.util.Scanner;
public class Main{
    static int sum_of_all_dig(int number){
        int rem_of_num, sum_of_num = 0;
        while(number > 0){
            rem_of_num = number%10;
            sum_of_num += rem_of_num;
            number /= 10;
        }
        return sum_of_num;
    }
    public static void main(String[] args){
        Scanner my_scanner = new Scanner(System.in);
        int number = my_scanner.nextInt();
        int sum_of_num = 0;
        sum_of_num = sum_of_all_dig(number);
        if(sum_of_num > 9){
            System.out.println(sum_of_all_dig(sum_of_num));
        }
        else{
            System.out.println(sum_of_num);
        }
    }
}

