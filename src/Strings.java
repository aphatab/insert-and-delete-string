public class Strings {
    public static void main(String args [] ){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

        //delet the extra n
        sb.insert(2,3);
        System.out.println(sb);
    }
}
