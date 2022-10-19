public class Student {
    private String favoriteClass;
    private Double happinessLevel;
    
    public Student(){
        favoriteClass = "";
        happinessLevel = 0.0;
    }

    public Student(String fav, Double hap){
        favoriteClass = fav;
        happinessLevel = hap;
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
}
