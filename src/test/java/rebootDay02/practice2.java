package rebootDay02;

public class practice2 {
    // mutability

    public static void main(String[] args) {

        String st = "java";
        StringBuilder sts = new StringBuilder("java");

        st = sts + " is fun";
        System.out.println(st.hashCode());
        System.out.println(sts.hashCode());
        System.out.println(st);

        sts.append("is fun");
        System.out.println(sts.toString());
        System.out.println(sts.hashCode());
    }
}