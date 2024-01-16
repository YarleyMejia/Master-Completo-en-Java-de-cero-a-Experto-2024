package org.ycmejia.SystemProperties;

public class EjemploSystemProperties {
    public static void main(String[] args) {
        String userName= System.getProperty("user.name");
        System.out.println("El nombre de usuario es: "+ userName);

        String home=System.getProperty("user.home");
        System.out.println("Home:"+home);

        String workspace=System.getProperty("user.dir");
        System.out.println("worhspace: "+ workspace);

    }

}
