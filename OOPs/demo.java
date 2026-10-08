package OOPs;

public class demo {
    String name ;
    int age ;
    demo(String name){
        this.name = name;
    }
    demo (int age) {
        this.age = age;
        System.out.println("this is parameterized constructor");
    }
    demo (String name ,int age){
        this.name =name;
        this.age = age;
    }
    demo(){
        System.out.println("this is no parametrized");
    }


    //Inheritance

    class animal {
        String name = "animal";
        void sound(){
            System.out.println("animal is moving");
        }
    }
    class dog extends animal {
        String name = "dog";
        void sound(){
            System.out.println("dog is barking");
        }



    }
    public static void main(String args[]){
//        demo = new demo();
        // constructor -non paramaterized, paratmeterized, default && constructor overloading
        demo  d= new demo(27);
        demo h = new demo("rahul");
        demo a = new demo();

        // inheritance:
        animal x = new animal();
        x.sound();
        animal y = new dog();
        y.sound();
        dog dg = new dog();
        dg.sound();





    }

}


