public class Main {
    public static StringBuilder decimalToBinary(int num){
        StringBuilder lista = new StringBuilder();
        while(num >= 1){
            lista.append(num%2);
            num = num/2;
        }
        lista.append("0".repeat(Math.max(0, 4 - lista.length())));
        lista.reverse();
        return lista;
    }

    public static StringBuilder decimalToHexa(int num){
        String[] chars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        StringBuilder lista = new StringBuilder();
        while(num > 0){
            lista.append(chars[num%16]);
            num = num/16;
        }
        lista.reverse();
        return lista;
    }
    public static void main(String[] args) {

    }
}
