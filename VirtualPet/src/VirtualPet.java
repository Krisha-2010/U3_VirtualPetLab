// Part A
public class VirtualPet
{
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYrs;
    private int ageMonths;

    public VirtualPet(String name)
    {
        this.name = name;
        this.weight = 5;
        this.ageYrs = 0;
        this.ageMonths = 0;
    }

    //Return name
    public String getName()
    {
        return name;
    }

    //Return int energy level
    public int getEnergyLevel()
    {
        return energyLevel;
    }

    //Return int happiness level
    public int getHappinessLevel()
    {
        return happinessLevel;
    }

    //Return String representation of pet name and status.
    //Status contains energy level, happiness level, weight, age of pet in yrs & months
    public String toString()
    {
        return name + "'s Information: \n" + "Energy: " + energyLevel
                + "\n Happiness: " + happinessLevel + "\nWeight: " + weight + "g"
                + "\nAge: " + ageMonths + " months and " + ageYrs + " years";
    }

    //Increases energy level & weight by 1
    //Energy level must always be between 0-10
    public void feed()
    {

    }

    //Increases happinessLevel by 1 (must always be between 0-10)
    //Decreases weight by 1 (cannot go below 5)
    public void play()
    {

    }

    //Decreases happinessLevel & energyLevel by 1
    //Weight must always be btwn 0-10
    //energyLevel must always be ab
    public void undateStatus()
    {

    }
}