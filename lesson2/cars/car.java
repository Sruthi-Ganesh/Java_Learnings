
/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car
{
    private double milesDriven;
    private double gasInTank;
    
    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double milesPerGallon = 50;
        double gasconsumed = distance / 