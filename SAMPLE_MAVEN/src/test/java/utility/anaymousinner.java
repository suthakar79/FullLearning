package utility;
class anaymousinner {
    interface Car { public void numberOfDoors(); }
    public static void main(String...args) {
     Car car = new Car() {
      public void numberOfDoors() {
       System.out.println("4");
      }
     };
     car.numberOfDoors();
    }
   }
