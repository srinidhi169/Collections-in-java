class InvalidAgeException extends Exception{
  public InvalidAgeException(String Str){
    super(Str);
  }
}
public class Custom{
  static void validate(int age)throws InvalidAgeException{
    if(age<18){
      throw new InvalidAgeException("age is not valid");
    }
    else{
      System.out.println("welcome to vote");
    }
  }
public static void main(String agrs[]){
  try{
    validate(13);
  }
  catch(InvalidAgeException ex){
    System.out.println("caught an exception");
  }

}
}