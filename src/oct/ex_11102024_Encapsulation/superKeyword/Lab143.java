package oct.ex_11102024_Encapsulation.superKeyword;

public class Lab143 {
    //super keyword in java is a reference variable that allows
    // a subclass( child class to reference the parent class)

    //1.Use of super with Variables
    //2.Use of super with Methods
    //3.Use of super with Constructors
    public static void main(String[] args) {
        Car c =new Car();
    }

    static class Car extends Vehicle{

        private int maxSpeed=281;

        void display(){

            System.out.println("Child");
        }

        Car(){
            super(10);//constructor chaining
            System.out.println("DC Car");
            this.display();//my own display
            super.display();//Parent display
            System.out.println(this.maxSpeed);//my own variable
            System.out.println(super.maxSpeed);//parent variable
        }
    }






    static class Vehicle{
        public int maxSpeed=180;

        void display(){

            System.out.println("Parent");
        }

        Vehicle(){
            System.out.println("DC Vehicle");
        }
        Vehicle(int a){
            System.out.println("PC Vehicle");
        }

        void message(){
            System.out.println("Hello Vehicle");
        }

        void message(int a){
            System.out.println("Hello Vehicle");
        }



    }
}
