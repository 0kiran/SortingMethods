public class Runner {
    public static void main(String[] args){
        int[] testarray = SortingUtil.randIntArr(10);

        System.out.println("Before: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();

         SortingUtil.bubble(testarray);

         System.out.println("After: ");
        for( int num:testarray){
            System.out.print(num+" ");
        }
        System.out.println();




    }
}
