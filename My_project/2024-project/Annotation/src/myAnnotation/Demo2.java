package myAnnotation;

import java.lang.annotation.Annotation;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("dao.MyAnnotation");

        if (aClass.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            System.out.println("类上的注解对象" + annotation);
            System.out.println(annotation.userName());
            System.out.println(annotation.password());
        }

        new dao.MyAnnotation().show();
        Annotation[] annotations = aClass.getAnnotations();

    }
}
