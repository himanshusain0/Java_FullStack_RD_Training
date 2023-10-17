// import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        String newArray[]={"Ram", "Shyam", "Mohan "};
        for(String name : newArray){
           System.out.println(name);
        }
        int i =0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);

        int j =0;
        while(j<5){
            System.out.println(j);
            j++;
        }
    }
}