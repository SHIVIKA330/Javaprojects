class Dog{
String name;
String breed;
Dog(String name , String breed){this.name = name ; this.breed = breed;}

public static void main(String[] args){
Dog d = new Dog("Tiger" , "German shepherd");
System.out.println(d.name + " " + d.breed);
}
}
