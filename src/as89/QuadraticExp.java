package as89;

public class QuadraticExp {
    public static void main(String[] args) {
        double a=1,b=4,c=0,d;
        double r1,r2;
        d=b*b-4*a*c;
        if(d<0)
            System.out.println("roots are complex");
        else if(d==0){
            System.out.println("roots are equal");
        r1=-b/(2*a);
        r2=-b/(2*a);
        System.out.println("r1=" +r1+ "r2=" +r2);
    }
    else
    {
        System.out.println("roots are real and distinct");
        r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("r1=" +r1+ "r2=" +r2);
    }
}
}