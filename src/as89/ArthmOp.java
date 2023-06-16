package as89;

public class ArthmOp {
    public static void main(String[] args) {
        int a=2,b=3,c=4,d,e,f,g;
        d=a+b*c;
        e=c+a/b;
        f=a%b+c;
        g=a*b+c;

        System.out.println("value of d:" +d);
        System.out.println("value of e:"+e);
        System.out.println("value of f:"+f);
        System.out.println("value of g:"+g);
        if(a<=b && a<=c)
            System.out.println("min num:"+a);
        if(b<=a && b<=c)
            System.out.println("min num:" +b);
        if(c<=a && c<=b)
            System.out.println("min num:" +c);
        if(a>=b && a>=c)
            System.out.println("max num:"+a);
        if(b>=a && b>=c)
            System.out.println("max num:" +b);
        if(c>=a && c>=b)
            System.out.println("max num:" +c);
    }
}


