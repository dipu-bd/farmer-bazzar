package MyPack;

public class CurrentUser {
    String name;
    String id;
    public double totalAmountPurchased;
    public double totalCostOfPurchasedProducts;
    public String[] vegNames=new String[100];
    public String[] vegAmounts=new String[100];
    public double[] vegCost=new double[100];
    int vegCount=0;
    
    public String[] groceryNames=new String[100];
    public String[] groceryAmounts=new String[100];
    public double[] groceryCost=new double[100];
    int groceryCount=0;
    
     public String[] liquidsNames=new String[100];
    public String[] liquidsAmounts=new String[100];
    public double[] liquidsCost=new double[100];
    int liquidsCount=0;
    
     public String[] chockolatesNames=new String[100];
    public String[] chockolatesAmounts=new String[100];
    public double[] chockolatesCost=new double[100];
    int chockolatesCount=0;
    
     public String[] eggsNames=new String[100];
    public String[] eggsAmounts=new String[100];
    public double[] eggsCost=new double[100];
    int eggsCount=0;
    
    
     public String[] meatsNames=new String[100];
    public String[] meatsAmounts=new String[100];
    public double[] meatsCost=new double[100];
    int meatsCount=0;
    
    
    public String[] fishesNames=new String[100];
    public String[] fishesAmounts=new String[100];
    public double[] fishesCost=new double[100];
    int fishesCount=0;
    
    
    
    public String[] colddrinksNames=new String[100];
    public String[] colddrinksAmounts=new String[100];
    public double[] colddrinksCost=new double[100];
    int colddrinksCount=0;
    
    
    
     public String[] cosmeticsNames=new String[100];
    public String[] cosmeticsAmounts=new String[100];
    public double[] cosmeticsCost=new double[100];
    int cosmeticsCount=0;
    
    
    
     public String[] othersNames=new String[100];
    public String[] othersAmounts=new String[100];
    public double[] othersCost=new double[100];
    int othersCount=0;
    
    public int getGroceryCount(){
        return groceryCount;
    }
    
    public void setGroceryCount(int a){
        groceryCount = a;
    }
    
    public String[] getGroceryNames(){
        return groceryNames;
    }
    
    public void setGroceryNames(String[] a){
        groceryNames = a;
    }
    
    public String[] getGroceryAmounts(){
        return groceryAmounts;
    }
    
    public void setGroceryAmounts(String[] a){
        groceryAmounts = a;
    }
    
    public double[] getGroceryCost(){
        return groceryCost;
    }
    
    public void setGroceryCost(double[] a){
        groceryCost = a;
    }
    
    public int getVegCount(){
        return vegCount;
    }
    public void setVegCount(int a){
        vegCount = a;
    }
    public void setVegCost(double[] a){
        vegCost = a;
    }
    public double[] getVegCost(){
        return vegCost;
    }
    
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getID(){
        return id;
    }
     public void setID(String id){
        this.id = id;
    }
    
    
    public void setVegNames(String[] str){
        vegNames = str;
    }
    public void setVegAmounts(String[] str){
        vegAmounts = str;
    }
    public String[] getVegNames(){
        return(vegNames);
    }
    public String[] getVegAmounts(){
        return(vegAmounts);
    }
    
    
    
    public int getLiquidsCount(){
        return liquidsCount;
    }
    
    public void setLiquidsCount(int a){
        liquidsCount = a;
    }
    
    public String[] getLiquidsNames(){
        return liquidsNames;
    }
    
    public void setLiquidsNames(String[] a){
        liquidsNames = a;
    }
    
    public String[] getLiquidsAmounts(){
        return liquidsAmounts;
    }
    
    public void setLiquidsAmounts(String[] a){
        liquidsAmounts = a;
    }
    
    public double[] getLiquidsCost(){
        return liquidsCost;
    }
    
    public void setLiquidsCost(double[] a){
        liquidsCost = a;
    }
    
    
    
     public int getChockolatesCount(){
        return chockolatesCount;
    }
    
    public void setChockolatesCount(int a){
        chockolatesCount = a;
    }
    
    public String[] getChockolatesNames(){
        return chockolatesNames;
    }
    
    public void setChockolatesNames(String[] a){
        chockolatesNames = a;
    }
    
    public String[] getChockolatesAmounts(){
        return chockolatesAmounts;
    }
    
    public void setChockolatesAmounts(String[] a){
        chockolatesAmounts = a;
    }
    
    public double[] getChockolatesCost(){
        return chockolatesCost;
    }
    
    public void setChockolatesCost(double[] a){
        chockolatesCost = a;
    }
    
    
     public int getEggsCount(){
        return eggsCount;
    }
    
    public void setEggsCount(int a){
        eggsCount = a;
    }
    
    public String[] getEggsNames(){
        return eggsNames;
    }
    
    public void setEggsNames(String[] a){
        eggsNames = a;
    }
    
    public String[] getEggsAmounts(){
        return eggsAmounts;
    }
    
    public void setEggsAmounts(String[] a){
        eggsAmounts = a;
    }
    
    public double[] getEggsCost(){
        return eggsCost;
    }
    
    public void setEggsCost(double[] a){
        eggsCost = a;
    }
    
    
     public int getMeatsCount(){
        return meatsCount;
    }
    
    public void setMeatsCount(int a){
        meatsCount = a;
    }
    
    public String[] getMeatsNames(){
        return meatsNames;
    }
    
    public void setMeatsNames(String[] a){
        meatsNames = a;
    }
    
    public String[] getMeatsAmounts(){
        return meatsAmounts;
    }
    
    public void setMeatsAmounts(String[] a){
        meatsAmounts = a;
    }
    
    public double[] getMeatsCost(){
        return meatsCost;
    }
    
    public void setMeatsCost(double[] a){
        meatsCost = a;
    }
    
    
    
    
     public int getFishesCount(){
        return fishesCount;
    }
    
    public void setFishesCount(int a){
        fishesCount = a;
    }
    
    public String[] getFishesNames(){
        return fishesNames;
    }
    
    public void setFishesNames(String[] a){
        fishesNames = a;
    }
    
    public String[] getFishesAmounts(){
        return fishesAmounts;
    }
    
    public void setFishesAmounts(String[] a){
        fishesAmounts = a;
    }
    
    public double[] getFishesCost(){
        return fishesCost;
    }
    
    public void setFishesCost(double[] a){
        fishesCost = a;
    }
    
    
    
    public int getColddrinksCount(){
        return colddrinksCount;
    }
    
    public void setColddrinksCount(int a){
        colddrinksCount = a;
    }
    
    public String[] getColddrinksNames(){
        return colddrinksNames;
    }
    
    public void setColddrinksNames(String[] a){
        colddrinksNames = a;
    }
    
    public String[] getColddrinksAmounts(){
        return colddrinksAmounts;
    }
    
    public void setColddrinksAmounts(String[] a){
        colddrinksAmounts = a;
    }
    
    public double[] getColddrinksCost(){
        return colddrinksCost;
    }
    
    public void setColddrinksCost(double[] a){
        colddrinksCost = a;
    }
    
    
    
    
    public int getCosmeticsCount(){
        return cosmeticsCount;
    }
    
    public void setCosmeticsCount(int a){
        cosmeticsCount = a;
    }
    
    public String[] getCosmeticsNames(){
        return cosmeticsNames;
    }
    
    public void setCosmeticsNames(String[] a){
        cosmeticsNames = a;
    }
    
    public String[] getCosmeticsAmounts(){
        return cosmeticsAmounts;
    }
    
    public void setCosmeticsAmounts(String[] a){
        cosmeticsAmounts = a;
    }
    
    public double[] getCosmeticsCost(){
        return cosmeticsCost;
    }
    
    public void setCosmeticsCost(double[] a){
        cosmeticsCost = a;
    }
    
    
      public int getOthersCount(){
        return othersCount;
    }
    
    public void setOthersCount(int a){
        othersCount = a;
    }
    
    public String[] getOthersNames(){
        return othersNames;
    }
    
    public void setOthersNames(String[] a){
        othersNames = a;
    }
    
    public String[] getOthersAmounts(){
        return othersAmounts;
    }
    
    public void setOthersAmounts(String[] a){
        othersAmounts = a;
    }
    
    public double[] getOthersCost(){
        return othersCost;
    }
    
    public void setOthersCost(double[] a){
        othersCost = a;
    }
   
    
}
