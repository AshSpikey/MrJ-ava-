public class Student {
    private String favoriteClass;
    private Double happinessLevel;
    private String name;
    
    public Student(){
        favoriteClass = "";
        happinessLevel = 0.0;
        name = "";
    }

    public Student(String fav, Double hap, String nam){
        favoriteClass = fav;
        happinessLevel = hap;
        name = nam;
    }

    public void modifyFavoriteClass(String fav){
        favoriteClass = fav;
    }

    public void modifyHappinessLevel(Double hap){
        happinessLevel = hap;
    }

    public String getFavoriteClass(){
        return favoriteClass;
    }

    public Double getHappinessLevel(){
        return happinessLevel;
    }

    public String toString(){
        return name;
    }
}
