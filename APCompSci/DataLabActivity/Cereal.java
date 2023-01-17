public class Cereal{
    private String name;
    private String type;
    private int calories;
    private int protein; 
    private int fat;
    private int sodium;
    private double fiber;
    private double carbs;
    private int sugar;
    private int potassium;
    private int vitamens;
    private int shelf;
    private double weight;
    private double cups;
    private double rating; 
    
    public Cereal(){
        name = "";
        type = "";
        calories = 0;
        protein = 0;
        fat = 0;
        sodium = 0;
        fiber = 0;
        carbs = 0;
        sugar = 0;
        potassium = 0;
        vitamens = 0;
        shelf = 0;
        weight = 0;
        cups = 0;
        rating = 0;
    }

    public void attainInformation(String n, String t, int cal, int pro, int sod, double f, double carb, int sug, int pot, int v, int she, int cup, int r){
        name = n;
        type = t;
        calories = cal;
        protein = pro;
        sodium = sod;
        fiber = f;
        carbs = carb;
        sugar = sug;
        potassium = pot;
        vitamens = v;
        shelf = she;
        cups = cup;
        rating = r;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getCalories(){
        return calories;
    }

    public int getProtein(){
        return protein;
    }

    public int getSodium(){
        return sodium;
    }

    public double getFiber(){
        return fiber;
    }

    public double getCarbs(){
        return carbs;
    }

    public int getSugar(){
        return sugar;
    }

    public int getPotassium(){
        return potassium;
    }

    public int getVitamens(){
        return vitamens;
    }

    public int getShelf(){
        return shelf;
    }

    public double getWeight(){
        return weight;
    }

    public double getCups(){
        return cups;
    }

    public double getRating(){
        return rating;
    }

    public String toString(){
        String string = ("Name: " + name + "\nType: " + type + "\nCalories: " + calories + "\nProtein: " + protein + "\nFat: " + fat + "\nSodium: " + "\nFiber: " + fiber + "\nSugar: " + sugar + "\nPotassium: " + potassium + "\nVitamens: " + vitamens + "\nShelf: " + shelf + "\nWeight: " + weight + "\nCups: " + cups + "\nRating: " + rating);
        return string;
    }
}