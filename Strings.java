public class Strings {
    public static void main(String[] args) {
        //concatenation
        String fname = "Tony";
        String lname = "Stark";
        String full = fname + " " + lname;
        System.out.println(full);
        //length
        System.out.println(full.length());
        //charAt
        for (int i = 0; i < full.length(); i++) {
            System.out.println(full.charAt(i));
        }

        //compare
        String name1 = "Tony";
        String name2 = "Tony";
        //1 s1 = s2 == 0
        //2 s1 > s2 == +ve
        //3 s1 < s2 == -ve
        if (name1.compareTo(name2) == 0){
            System.out.println("yuh uh");
        }else {
            System.out.println("nuh uh");
        }

        //substring
        String sentence = "My name is SlimShady";
        //substring(first index, end index)
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);

        //parseInt
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        //tostring
        int str2 = 123;
        String num3 = Integer.toString(str2);
        System.out.println(num3);
    }
}
