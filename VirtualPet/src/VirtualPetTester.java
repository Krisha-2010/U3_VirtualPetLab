public class VirtualPetTester
{
    public static void main(String[] args)
    {
        //Creates a pet with the name "Bubba"
        VirtualPet bubba = new VirtualPet("Bubba");

        //Returns the name
        bubba.getName();

        //Print the info about pet
        bubba.toString();

        //Increase energy level 0 -> 1
        //Increase weight 5 -> 6
        bubba.feed();

        //Print updated info
        bubba.toString();

        //Increase energy level 1 -> 2
        //Increase weight 6 -> 7
        bubba.feed();

        //Increase energy level 2 -> 3
        //Increase weight 7 -> 8
        bubba.feed();

        //Increase energy level 3 -> 4
        //Increase weight 8 -> 9
        bubba.feed();

        //Increase energy level 4 -> 5
        //Increase weight 9 -> 10
        bubba.feed();

        //Increase energy level 5 -> 6
        //Increase weight 10 -> 11
        bubba.feed();

        //Increase energy level 6 -> 7
        //Increase weight 11 -> 12
        bubba.feed();

        //Increase energy level 7 -> 8
        //Increase weight 12 -> 13
        bubba.feed();

        //Energy level currently at 8
        bubba.getEnergyLevel();

        //Increase energy level 8 -> 9
        //Increase weight 13 -> 14
        bubba.feed();

        //Increase energy level 9 -> 10
        //Increase weight 14 -> 15
        bubba.feed();

        //Print updated info
        bubba.toString();

        //Energy level at 10
        bubba.getEnergyLevel();

        // Energy level doesn't increase, at limit (10)
        //Increase weight 15 -> 16
        bubba.feed();

        //Happiness level at 0
        bubba.getHappinessLevel();
    }
}