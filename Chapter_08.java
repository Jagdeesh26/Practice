class employee{
    int salary;
    String name;
    public int getsalary(){
        return  salary;
    }
    public String getname(){
        return name;

    }
    public void setName(String a){
        name=a;
    }

}

class cellphone{
    public void ringing(){
        System.out.println("Ringiung.......");
    }
    public void vibrating(){
        System.out.println(" Is vibrating");
    }
    public void calling(){
        System.out.println(" Is calling");
    }

}

class sqare{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int lenght;
    int width;
    public int area(){
        return lenght*width;
    }
    public int perimeter(){
        return (lenght+width)*2;
    }
}
class TommyVecetti{
    String player;
    public void setplayername(String a){
        player=a;
    }
    public void hit(){
        System.out.println(player+" hiting the enemy");
    }public void run(){
        System.out.println(player+" runnign from here");
    }public void jum(){
        System.out.println(player+" jumping very long");
    }

}
public class Chapter_08 {
    public static void main(String[] args) {
       // problem 1
//        employee jd=new employee();
//        jd.salary=145000;
//        jd.setName("Jagdeesh");
//
//
//      //  System.out.println(jd.name);
//      //  System.out.println("salary of "+jd.name+" is "+jd.salary);
//       // System.out.println();
//        System.out.println( jd.getname());
//        System.out.println( jd.getsalary());
        // problem 2
//        cellphone oppo=new cellphone();
//        oppo.ringing();
//        oppo.calling();
//        oppo.vibrating();
        //  problem 3
//        sqare sq=new sqare();
//        sq.side=5;
//        System.out.println("The Area of a sqare is : "+sq.area());
//        System.out.println("the perimeter of a sqare is : "+sq.perimeter());
//        // problem 4
//        rectangle rq=new rectangle();
//       rq.width=15;
//       rq.lenght=10;
//        System.out.println("The Area of a rectangle is : "+rq.area());
//        System.out.println("the perimeter of a rectangle is : "+rq.perimeter());

        // problem 5
//TommyVecetti palayer1=new TommyVecetti();
//palayer1.setplayername("Jagdeesh");
//palayer1.hit();
//palayer1.jum();
//palayer1.run();
    }

}
