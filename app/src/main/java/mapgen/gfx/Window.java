package mapgen.gfx;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mapgen.Global;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Window extends JFrame {

    private class Panel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.blue);
            g.fillRect(10, 10, 50, 50);
            g.dispose();
        }
    }

    public boolean initWindow() {
        System.out.println("Window created");
        
        m_Panel.setDoubleBuffered(true);
        m_Panel.setPreferredSize(new Dimension(Global.g_WindowWidth, Global.g_WindowHeight));
        System.out.println("Setting up pannel");

        this.setTitle(m_WindowName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(Global.g_WindowPosition);
        this.setUndecorated(false);
        this.add(this.m_Panel);
        this.pack();
        this.setVisible(true);
        System.out.println("Setting up window");

        return true;
    }
    
    public void render() {
        this.initWindow();

        while(true) {
            this.m_Panel.repaint();
        }
    }
    
    private static final String m_WindowName = "MapGen " + Global.g_ProjectVersion;
    private final Panel m_Panel = new Panel();
}
