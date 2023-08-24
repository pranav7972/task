package Inheri;

public class Test {
    public static void main(String[] args) {
    
    	F f=new F();
    	System.out.println(f.a); //20
    	System.out.println(f.b); //10
    	System.out.println(f.c); //30
    	System.out.println(f.d); //30
    	System.out.println(f.e); //40
    //	System.out.println(f.f); //50
    	
    	f.m1(); //m1-f
    	f.m2(); //m2-c 
    	f.m3(); //m3-f
    	f.m4(); //m4-f
    	f.m5(); //m5-e
    	f.m6(); //m6-f
    
        C c=new C();
        c.m1();
        c.m3();
        c.m4();
        c.m6();
        c.m2();
        c.m5();
        
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
        System.out.println(c.e);
        
        
        B b=new B();
        b.m1();
        b.m3();
        b.m4();
    //  b.m6();
        b.m2();
        b.m5();
        
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);
        System.out.println(b.e);
   //   System.out.println(b.f);
        
        E e=new E();
        e.m1();
        e.m3();
        e.m4();
        e.m6();
        e.m2();
        e.m5();
        
        System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.c);
        System.out.println(e.d);
        System.out.println(e.e);
        System.out.println(e.f);
        
        D d=new D();
        d.m1();
        d.m3();
        d.m4();
  //    d.m6();
        d.m2();
        d.m5();
        
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
        System.out.println(d.d);
        System.out.println(d.e);
        System.out.println(d.f);
        
        
       
        A a=new A();
        a.m1();
        a.m3();
        a.m4();
   //   a.m6();
   //   a.m2();
   //   a.m5();
        
        System.out.println(a.a);
    //  System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    //  System.out.println(a.e);
    //  System.out.println(a.f);
    
    
    
        A a1=new C();
        a1.m1();
        a1.m3();
        a1.m4();
   //   a1.m6();
   //   a1.m2();
   //   a1.m5();
        
        System.out.println(a1.a);
    //  System.out.println(a1.b);
        System.out.println(a1.c);
        System.out.println(a1.d);
    //  System.out.println(a1.e);
    //  System.out.println(a1.f); 
        
        

        A a2=new B();
        a2.m1();
        a2.m3();
        a2.m4();
   //   a2.m6();
   //   a2.m2();
   //   a2.m5();
        
        System.out.println(a2.a);
    //  System.out.println(a2.b);
        System.out.println(a2.c);
        System.out.println(a2.d);
    //  System.out.println(a2.e);
    //  System.out.println(a2.f); 
        
        

        A a3=new D();
        a3.m1();
        a3.m3();
        a3.m4();
   //   a3.m6();
   //   a3.m2();
   //   a3.m5();
        
        System.out.println(a3.a);
    //  System.out.println(a3.b);
        System.out.println(a3.c);
        System.out.println(a3.d);
    //  System.out.println(a3.e);
    //  System.out.println(a3.f);
        
        

        A a4=new E();
        a4.m1();
        a4.m3();
        a4.m4();
   //   a4.m6();
   //   a4.m2();
   //   a4.m5();
        
        System.out.println(a4.a);
    //  System.out.println(a4.b);
        System.out.println(a4.c);
        System.out.println(a4.d);
    //  System.out.println(a4.e);
    //  System.out.println(a4.f); 
        
        

        A a5=new F();
        a5.m1();
        a5.m3();
        a5.m4();
   //   a5.m6();
   //   a5.m2();
   //   a5.m5();
        
        System.out.println(a5.a);
    //  System.out.println(a5.b);
        System.out.println(a5.c);
        System.out.println(a5.d);
    //  System.out.println(a5.e);
    //  System.out.println(a5.f); 
        
        
        B b2=new D();
        b2.m1();
        b2.m3();
        b2.m4();
  //    b2.m6();
        b2.m2();
        b2.m5();
        
        System.out.println(b2.a);
        System.out.println(b2.b);
        System.out.println(b2.c);
        System.out.println(b2.d);
        System.out.println(b2.e);
  //    System.out.println(b2.f);
        
        
        C c2=new E();
        c2.m1();
        c2.m3();
        c2.m4();
        c2.m6();
        c2.m2();
        c2.m5();
        
        System.out.println(c2.a);
        System.out.println(c2.b);
        System.out.println(c2.c);
        System.out.println(c2.d);
        System.out.println(c2.e);
        
        
        C c3=new F();
        c3.m1();
        c3.m3();
        c3.m4();
        c3.m6();
        c3.m2();
        c3.m5();
        
        System.out.println(c3.a);
        System.out.println(c3.b);
        System.out.println(c3.c);
        System.out.println(c3.d);
        System.out.println(c3.e);
    }
}      
