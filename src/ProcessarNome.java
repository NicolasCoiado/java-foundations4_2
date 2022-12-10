import java.util.Scanner;
public class ProcessarNome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva seu nome:");
        String fullName = sc.nextLine();
        sc.close();
        int space = fullName.indexOf(" ");
        String initial = fullName.substring(0, 1);
        String surname = fullName.substring(space+1, fullName.length());
        System.out.println("Seu nome é "+surname+", "+initial+".");
    }
}
