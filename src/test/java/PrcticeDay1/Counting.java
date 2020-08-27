package PrcticeDay1;

public class Counting {
    // counting java
    public static void main(String[] args) {
        String str = "java is the best language java java ";
        int java =0;
        // approach 1
        for(int i=0; i < str.length()-3; i++){
            if(str.substring(i,i+4).equalsIgnoreCase("java")) java++;

        }
        System.out.println("Java found " + java);

        // approach 2

        int java2 = 0;
        while(str.contains("java")){
            java2++;
            str = str.replaceFirst("java","");
        }
        System.out.println(" java 22 " + java2);
    }
}
