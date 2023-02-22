public class NestedLoops {
    public static void main(String[] args)
    {
        /* How many times will "I'm here!" be printed? */
        for (int i = 0; i < 10; i++)
        {
            int j = 0;
            while ( j < 10)
            {
                System.out.println("I'm here!");
                j++;
            }
        }


        /* What does the following nested loop print? */
        int numRows = 12;
        int numCols = 92;
        for (int i = 0; i < numRows; i++ )
        {
            for (int j = 0; j < numCols; j++ )
            {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }


    }
}
