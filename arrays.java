import javax.sound.midi.Synthesizer;

class arrays {
    public static void main(String[] args) {
        // declare an array
        // double[] data = new double[10];
        // ---------------------------------------------------------------------------------------------------------------
        // declare and initialize and array
        // int[] age = { 12, 4, 5, 2, 5 };

        // int[] data = { 4, 1, 5, 2, 4, 2 };
        // for (int i = 0; i <= 5; i++) {
        // System.out.println(data[i]);
        // }
        // ---------------------------------------------------------------------------------------------------------------
        // // create an Array and print through for each loop

        // int[] value = { 1, 4, 5, 6, 77, 8 };
        // for (int number : value) {
        // System.out.println("the value of an arrays is = " + number);
        // }
        // ---------------------------------------------------------------------------------------------------------------
        // // Calculate the sum of all elements of an array
        // int add = 0;
        // int sum[] = { 4, 2, 3, 45, 6, 8 };
        // for (int i = 0; i < sum.length; i++) {
        // add = add + sum[i];

        // }
        // System.out.println("the sum of " + add);
        // ---------------------------------------------------------------------------------------------------------------

        // // Add all element through for eack loop
        // int addd = 0;
        // int adi[] = { 4, 2, 8, 7, 5, 9 };

        // for (int number : adi) {
        // addd += number;

        // }
        // System.out.println("the sum of " + addd);
        // ---------------------------------------------------------------------------------------------------------------

        // Example: Compute Sum and Average of Array Elements

        // int[] number = { 4, 5, 1, 2, 8, 6, 2 };
        // int add = 0;
        // for (int numbers : number) {
        // add += numbers;
        // }
        // int arrlength = number.length;
        // double Average = (double) add / (double) arrlength;
        // System.out.println(+add);
        // System.out.println(+Average);
        // ---------------------------------------------------------------------------------------------------------------

        // Two dimentional Array in java

        // int [][]data ={
        // {9,7,58,2,5},{4,2,8,5,2}
        // };

        // System.out.println(data[0].length);
        // System.out.println(data[1].length);
        // System.out.println(data[2].length);
        // -----------------------------------------------------------------------------------------
        // //
        // Print all elements of 2d array Using Loop

        int[][] element = { { 78, 9, 8, 5, 2, 5 }, { 4, 5, 2, 1 } };
        int sum = 0;
        for (int i = 0; i < element.length; i++) {
            sum += sum + element[i];
        }
            // for (int j = 0; j < element[i].length; j++) {
            //     System.out.println("the all value of an araya = " + element[i][j]);

           
            
        
        // sum += sum + element[i][j];

        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------------

    }
}