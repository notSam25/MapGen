/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mapgen;

import org.junit.jupiter.api.Test;

import mapgen.gfx.Window;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void windowFunctionality() {
        Window classUnderTest = new Window();
        assertNotNull(classUnderTest.initWindow(), "window success");
    }
}
