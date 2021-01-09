import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
                              
        int i, N;
        System.out.println("Masukan Jumlah Input Kata : ");
        Scanner inputan = new Scanner(System.in);
        Scanner inputan2 = new Scanner(System.in);
        N = inputan.nextInt();
        
        String[] input = new String[N];
        
        System.out.println();

        if (N>100) {
            System.out.println("Jumlah input kata tidak boleh lebih dari 100!");
        }
        else {
            for (i=0; i<N; i++){
                int j = i+1;                
                    System.out.println("Masukan 2 kata ke-" + j);
                    input[i] = inputan2.nextLine();
            }
            System.out.println();
            System.out.println("Hasil :");
            for (i=0; i<N; i++) {

            int j = i+1;            
                String[] splitString = input[i].split(" ");

                StringBuffer stringBalik = new StringBuffer(splitString[1]);
                stringBalik.reverse();
                String string1 = splitString[0];
                String string2 = stringBalik.toString();

                System.out.print("2 kata ke-" + j + " = ");
                System.out.println(splitString[0] + " " + splitString[1]);
                if(splitString[0].equals(splitString[1])) {
                    System.out.println("Sama");
                }
                else if (string1.equals(string2)){
                    System.out.println("Pencerminan");
                }
                else if (splitString[0].contains(splitString[1])){
                    System.out.println("Substring");
                }
                else if (string1.contains(string2)){
                    System.out.println("Substring Pencerminan");
                }
                else {
                    System.out.println("Bukan Substring");
                }
                System.out.println();

            }
        }

    }
}