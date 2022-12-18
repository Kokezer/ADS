package pract_2.zd8;

public class Test {

    public static String[] reverse(String array[]){
        for(int i = 0 ; i<array.length/2;i++){
            String a = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = a;
        }
        return array;
    }



    public static void main(String[] args){
        String[] array=new String[] {" Change"," the"," world"," my"," final"," message"};
        array = reverse(array);
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
