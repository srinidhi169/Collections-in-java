
import java.util.*;
class StateInformation{
  ArrayList state = new ArrayList();
  Scanner sc = new Scanner(System.in);
  public void setStateInformation(){
    System.out.println("Enter the male population(age>=18)");
    long maleAbove18 = sc.nextLong();
    System.out.println("Enter the female population(age>=18)");
    long femaleAbove18 = sc.nextLong();
    System.out.println("Enter the transgenger population(age>=18)");
    long transgenderAbove18 = sc.nextLong();
    System.out.println("Enter the male population(age<18)");
    long male = sc.nextLong();
    System.out.println("Enter the female population(age<18)");
    long female = sc.nextLong();
    System.out.println("Enter the transgenger population(age<18)");
    long transgender = sc.nextLong();
    long population = male+maleAbove18+female+femaleAbove18+transgender+transgenderAbove18;
    state.add(population);

    System.out.println("Enter the Hindu population");
    long hindu = sc.nextLong();
    state.add(hindu);
    System.out.println("Enter the Muslim population");
    long muslim = sc.nextLong();
    state.add(muslim);
    System.out.println("Enter the Christian population");
    long christian = sc.nextLong();
    state.add(christian);

 

    System.out.println("Enter the number of districts");
    int disticts = sc.nextInt();
    state.add(disticts);
    System.out.println("Enter the literacy percentage");
    float literacy = sc.nextFloat();
    state.add(literacy);
    double voting = (maleAbove18+femaleAbove18+transgenderAbove18)*100/population;
    state.add(voting);
    System.out.println("Enter the number of Government lands");
    long land = sc.nextLong();
    state.add(land);

 

    System.out.println("Enter the employment ratio");
    double employment_ratio = sc.nextDouble();
    state.add(employment_ratio);

 

    System.out.println("Enter the number of seas");
    int seas = sc.nextInt();
    state.add(seas);
    System.out.println("Enter the number of ports");
    int ports = sc.nextInt();
    state.add(ports);
    double male_ratio = ((male+maleAbove18)*100)/population;
    double female_ratio = ((female+femaleAbove18)*100)/population;
    double transgender_ratio = ((transgender+transgenderAbove18)*100)/population;
    state.add(male_ratio);
    state.add(female_ratio);
    state.add(transgender_ratio);
    System.out.println("Enter the number of lok shaba seats");
    int lok_shaba = sc.nextInt();
    state.add(lok_shaba);
    System.out.println("Enter the number of rajya shaba seats");
    int rajya_shaba = sc.nextInt();
    state.add(rajya_shaba);
  }
   public void getStateInformation(){
     System.out.println("Population : "+state.get(0));
     System.out.println("Enter your Religion(1-3) :");
     System.out.println("1.Hindu\n2.Muslim\n3.Cristian");
     int option = sc.nextInt();
     switch(option){
       case 1 :System.out.println("Hindu Population : "+state.get(1));
         break;
       case 2 : System.out.println("Muslim Population : "+state.get(2));
         break;
       case 3 : System.out.println("Cristian Population : "+state.get(3));
         break;
         default : System.out.println("Invalid Religion");
     }
     System.out.println("number of Disticts : "+state.get(4));
     System.out.println("Literacy Percentage : "+state.get(5));
     System.out.println("Voting Percentage : "+state.get(6));
     System.out.println("Government lands : "+state.get(7));
     System.out.println("Employment ratio : "+state.get(8));
     System.out.println("Number of Seas : "+state.get(9));
     System.out.println("Number of Ports : "+state.get(10));
     System.out.println("Male ratio : "+state.get(11));
     System.out.println("Female ratio : "+state.get(12));
     System.out.println("Transgender ratio : "+state.get(13));
     System.out.println("Number of Lok Shaba Seats : "+state.get(14));
     System.out.println("Number of Rajya Shaba Seats : "+state.get(15));
     state.clear();
   }
}
class GeneralizedStatesSurvey{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StateInformation si = new StateInformation();
    boolean bb=true;
    while(bb){
    System.out.println("*****************************");
    System.out.println("Welcome to India Survey");

 

System.out.println("1.AndhraPradesh\n2.Telangana\n3.Karnataka\n4.Kerala");
    System.out.println("Enter Your Option");
    int option = sc.nextInt();
    switch(option){
      case 1 : si.setStateInformation();
        System.out.println("*****Andhra Pradesh Details******");
        si.getStateInformation();

        break;
      case 2 : si.setStateInformation();
        System.out.println("*****Telangana Details******");
        si.getStateInformation();
        break;
      case 3 :si.setStateInformation();
        System.out.println("*****Karnataka Details******");
        si.getStateInformation();
        break;
      case 4 : si.setStateInformation();
        System.out.println("*****Kerala Details******");
        si.getStateInformation();
        break;
      default : System.out.println("Invalid State");
        bb=false;
    }
    }
  }
}