package mapgen;

import mapgen.gfx.Window;

import java.awt.Point;

public class Global {

    public static Window getWindow() { return g_Window; }

    public static final Point g_WindowPosition = new Point(100, 100);
    public static final double g_ProjectVersion = 1.0;
    public static final int g_WindowHeight = 600, g_WindowWidth = 600;
    private static final Window g_Window = new Window();
}
