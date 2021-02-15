package sandbox;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 10};

        int temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println("*** i value is " + array[i]);
            for(int j = 0; j < array.length; j++) {
                System.out.println("*** j value is " + array[j]);
                if(array[i] > array[j]) {
                    System.out.println("entro al IF");
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                System.out.println("^^^");
            }
        }

        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
