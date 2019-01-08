public class Runner {
    public static void main(String[] args){
        int[] testarray = utils.randIntArr(10);
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

        testarray = utils.randIntArr(10);
        System.out.println("Bubble Sort with Shorten algorithm:\n");
        System.out.println("Before: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();
        long time2 = System.nanoTime();
        utils.bubbleShort(testarray);
        time2 = System.nanoTime()-time2;

        System.out.println("After: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("Time Taken: "+time2+"\n");

        testarray = utils.randIntArr(10);
        System.out.println("Selection Sort:\n");
        System.out.println("Before: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();
        long time3 = System.nanoTime();
        utils.selection(testarray);
        time3 = System.nanoTime()-time3;

        System.out.println("After: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("Time Taken: "+time3);

    }
}
