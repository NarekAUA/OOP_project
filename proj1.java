abstract class Vehicle {
  protected int length;
  protected int weight;

  public Vehicle(){
    this.length = 20;
    this.weight = 30;
  }

  public Vehicle(int l, int w){
    this.length = l;
    this.weight = w;
  }

  public int getLength(){
    return length;
  }

  public void setLength(int l){
    length = l;
  }

  public int getWeight(){
    return weight;
  }

  public void setWeight(int w){
    weight = w;
  }

  public abstract void calcLength();
  public abstract void calcWeight();

}

class Car extends Vehicle {

  public Car(){
    this.length = 25;
    this.weight = 35;
  }

  public Car(int a, int b){
      this.length = a;
      this.weight = b;
  }

  @Override
  public void calcLength(){
    System.out.println("The length of the car is " + getLength());
  }

  @Override
  public void calcWeight(){
    System.out.println("The weight of the car is " + getWeight());
  }

}

class Boat extends Vehicle {

   public Boat(){
    this.length = 45;
    this.weight = 15;
  }

  public Boat(int a, int b){
      this.length = a;
      this.weight = b;
  }

  @Override
  public void calcLength(){
    System.out.println("The length of the boat is " + getLength());
  }

  @Override
  public void calcWeight(){
    System.out.println("The weight of the boat is " + getWeight());
  }

}

class Truck extends Vehicle {

  private boolean isTrailorAttached;
  private int trailorLength;
  private int trailorWeight;
  public Truck(){
    this.length = 50;
    this.weight = 40;
  }

  public Truck(int a, int b){
      this.length = a;
      this.weight = b;
  }

  public void attachTrailor(int a, int b){
    isTrailorAttached = true;
    trailorLength = a;
    trailorWeight = b;
  }

  public void detachTrailor(){
    isTrailorAttached = false;
  }

   @Override
  public void calcLength(){
    if(isTrailorAttached){
      length += trailorLength;
      System.out.println("The length of the Truck with a trailor is " + getLength());
    } else {
      length -= trailorLength;
      System.out.println("The length of the Truck is " + getLength());
    }
    
  }

  @Override
  public void calcWeight(){
    if(isTrailorAttached){
      weight += trailorWeight;
      System.out.println("The weight of the Truck with a trailor is " + getWeight());
    } else {
      weight -= trailorWeight;
      System.out.println("The weight of the Truck is " + getWeight());
    }
    
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Vehicle car1 = new Car(14, 15);
    car1.calcLength();
    car1.setLength(18);
    car1.calcLength();

    Vehicle car2 = new Car();
    car2.calcWeight();

    Vehicle boat1 = new Boat();
    boat1.calcWeight();

    Vehicle boat2 = new Boat(40, 30);
    boat2.calcLength();

    Truck truck1 = new Truck(70, 80);
    truck1.calcLength();
    truck1.calcWeight();

    truck1.attachTrailor(10,5);

    truck1.calcLength();
    truck1.calcWeight();
   
    truck1.detachTrailor();

   
    truck1.calcLength();
    truck1.calcWeight();
  }
}

