// BlueJ project: lesson4/checkerboard
// Video: Checkerboard

public class CheckerBoardPainter
{
    /**
     * Computes the color of a square on a checkerboard.
     * The top left corner is blue.
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint
     */
    public int getColor(int row, int col)
    {

    {
        //To do!
    if((row+col)%2==0 || Math.abs(row-col)%2==0)
        return 0;
        else return 1;
       
}

    }
}
