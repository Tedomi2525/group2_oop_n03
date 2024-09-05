package ReusingClasses.InterfacesExercise20;

class WithFinals {
    void f() {
        System.out.println("WithFinals.f()");
    }
    void g() {
    	System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    void f() {
    	System.out.println("OverridingPrivate.f()");
    }
    
    void g() {
    	System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
    	System.out.println("OverridingPrivate2.f()");
    }
    
    public void g() {
    	System.out.println("OverridingPrivate2.g()");
    }
}

public class bTap20 {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        
        OverridingPrivate op = op2;
        op.f(); 
        op.g(); 

        WithFinals wf = op2;
        wf.f(); 
        wf.g(); 
    }
}

//OverridingPrivate2.f()
//OverridingPrivate2.g()
//OverridingPrivate2.f()
//OverridingPrivate2.g()
//OverridingPrivate2.f()
//OverridingPrivate2.g()
