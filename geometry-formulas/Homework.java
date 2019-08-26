/**
 * Just a demo of how you can access functions in one class from another.
 * 
 * @author Jon Cooper 
 * @version August 23, 2018
 */
public class Homework
{
    public static void main(String[] args)
    {
        double a = Geometry.areaOfParallelogram(5, 4); 
        System.out.println(a);
    }
}
