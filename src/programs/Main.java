package programs;

public class Main {
    public static void main(String args[]){
        System.out.println("System Starts...");
        /*StudentImp ob = new StudentImp();
        ob.greet();*/
        Student st = new Student() {
            @Override
            public void greet() {
                System.out.println("Good Morning");
            }
        };
        st.greet();
        // Second Anonymous Class
        Student st1 = new Student() {
            @Override
            public void greet() {
                System.out.println("Good Afternoon");
            }
        };
        st1.greet();

        //Using Lambda
        Employee e=()->{
            System.out.println("We are earning");
        };
        e.earn();

        Employer emp = (int x, int y)->{
            return x+y;
        };
        Employer emp1 = (x, y)-> x+y;

        System.out.println(emp.sum(10,20));
        System.out.println(emp1.sum(5,3));

        StringLen len = str -> str.length();
        System.out.println(len.slength("Rupesh Gupta"));
    }
}
