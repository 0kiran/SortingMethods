public class Runner {
    public static void main(String[] args){
        int[] testarray = utils.randIntArr(10);

        System.out.println("Before: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();
        long time = System.nanoTime();
        utils.bubble(testarray);
        time = System.nanoTime()-time;

        System.out.println("After: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("Time Taken: "+time);

    }
}
