public class Grape

{
private String color = "";
private static int count = 0;
private float weight = 0.0f;
public Grape (String newColor, float newWeight)
{color = newColor;
 weight = newWeight;
 count++;}
public String toString()
{return "This instance of Grape is " + color + " and the Weight is " + weight + " lb. So far you have generated " + count + " Grape ";}
}
