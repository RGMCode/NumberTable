package RGMCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        numTable();
    }

    public static void numTable(){
        int maxRows = 25;
        int maxCol = 25;

        for (int i = 1; i <= maxRows; i++){
            for (int j = 1; j <= maxCol; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }


}