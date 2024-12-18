import org.junit.Test;

import java.lang.reflect.Method;

public class demo {
    @Test
    public void testPressClass(){
        Class<testAnnotation> myClass = testAnnotation.class;
        if(myClass.isAnnotationPresent(myAnnotation2.class)){
            myAnnotation2 anno = myClass.getDeclaredAnnotation(myAnnotation2.class);
            System.out.println(anno.value());
            System.out.println(anno.name());
        }
    }

    @Test
    public void testPressMethod() throws NoSuchMethodException {
        Class<testAnnotation> myClass = testAnnotation.class;
        Method test = myClass.getDeclaredMethod("test");

        if(test.isAnnotationPresent(myAnnotation2.class)){
            myAnnotation2 anno = test.getDeclaredAnnotation(myAnnotation2.class);
            System.out.println(anno.value());
            System.out.println(anno.name());
        }
    }
}
