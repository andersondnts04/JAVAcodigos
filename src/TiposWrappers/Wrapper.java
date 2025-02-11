package TiposWrappers;

public class Wrapper {
    public static void main(String[] args) {
        int num1 = 9;

        // Utiliza o autoboxing para converter o int para Integer
        Integer wrapperNum = Integer.valueOf(num1);

        // Compara o valor Integer com 100
        System.out.println(wrapperNum.compareTo(100)); // Added to close the scanner object
    }
}
