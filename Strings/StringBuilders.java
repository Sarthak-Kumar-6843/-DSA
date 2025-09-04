package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //insert
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(3,'n');
        System.out.println(sb);

        //delete
        sb.delete(3,4);
        System.out.println(sb);


        //append
        StringBuilder sb2 = new StringBuilder("h");
        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");
        System.out.println(sb2);


    }
}
