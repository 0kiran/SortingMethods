public class Runner {
    public static void main(String[] args){
        int[] testarray = utils.randIntArr(100);
        System.out.println("Standard Bubble Sort:\n");
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

        System.out.println("Time Taken: "+time+"\n");

        int[] testarray2 = utils.randIntArr(100);
        System.out.println("Bubble Sort with Shorten algorithm:\n");
        System.out.println("Before: ");
        for( int num:testarray2){
            System.out.print(num+" ");
        }
        System.out.println();
        long time2 = System.nanoTime();
        utils.bubbleShort(testarray2);
        time2 = System.nanoTime()-time2;

        System.out.println("After: ");
        for( int num:testarray2){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("Time Taken: "+time2);

    }
}
