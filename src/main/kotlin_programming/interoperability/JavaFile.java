package interoperability;

public class JavaFile {
    public static void main(String []args){
        //calling Kotlin method
        int result = KotlinEx.add(10,20);
        System.out.println("Printing sum from Java File: "+result);

    }

    //Java Method for addition of two numbers
    public static int add(int a, int b){
        System.out.println("Inside Java Method");
        return a+b;
    }
}
