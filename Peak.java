//Solution for peak finding problem
import java.util.Scanner;
public class Peak{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int num = scanner.nextInt();
        int[] data = new int[num];

        for (int i=0;i<num;i++){
            System.out.print("Index " + i + ": ");
            int entry = scanner.nextInt();

            for (int k = 0; k < i; k++) {
                while (entry == data[k]){
                    System.out.println("Entries have to be unique");
                    System.out.println("Enter index " + i + ": ");
                    entry = scanner.nextInt();
                }
            }
            data[i] = entry;
        }

        for (int j = 0; j < data.length; j++) {
            if(j==0) {
                if (data[j] > data[j + 1] ) {
                    System.out.println("Peak number : " + data[j]);
                }
            } else if (j == data.length-1){
                if (data[j] > data[j-1]){
                    System.out.println("Peak number : " + data[j]);
                }
            }else {
                if (data[j]>data[j-1] && data[j] > data[j + 1]) {
                    System.out.println("Peak number : " + data[j]);
                }
            }
        }
    }

}