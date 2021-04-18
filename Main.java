public class Main {
    public static StringBuilder toBinary(int num){
        StringBuilder lista = new StringBuilder();
        while(num >= 1){
            lista.append(num%2);
            num = num/2;
        }
        lista.append("0".repeat(Math.max(0, 4 - lista.length())));
        lista.reverse();
        return lista;
    }
    public static void main(String[] args) {
        for(int x = 0;x <= 50;x++){
            System.out.println(toBinary(x));
        }
    }
}