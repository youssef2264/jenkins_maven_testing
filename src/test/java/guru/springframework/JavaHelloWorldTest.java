package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        JavaHelloWorld javahelloworld=new JavaHelloWorld();
        assertEquals("Hello World",javahelloworld.getHello());
    }

    @org.junit.Test
    public void testGetHello() {
        JavaHelloWorld javahelloworld=new JavaHelloWorld();
        assertEquals("Hello World",javahelloworld.getHello());
    }
}