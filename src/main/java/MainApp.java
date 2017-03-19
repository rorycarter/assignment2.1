/**
 * Created by Rory on 2017-03-19.
 */
public class MainApp

{

    public int testInt()
    {
        return 6;
    }

    public double testDouble()
    {
        return 10.0;
    }

    public String testString()
    {
        return ("Rory");
    }


    public boolean testTruth() throws Exception {
        String word="";
        if(word.equals(""))
            return true;
        else
            return false;
    }

    public boolean getFalse(){
        String name="";
        if (name.equals("RoryCarter"))
        {

            return true;
        }
        else {
            return false;
        }
    }

    public String getName(){

        return null;
    }

    public String getSurname(){

        return "null";
    }

    public int getArrayNums()
    {
        int []nums= new int[5];


        nums[2]=22;
        return nums[5];

    }

    public void generateNums() {
        int count =2;

        while(count<2){


        }
    }




}
