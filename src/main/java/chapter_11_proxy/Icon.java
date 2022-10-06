package chapter_11_proxy;

import java.awt.*;

public interface Icon {

    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(Component c, Graphics g, int x, int y);
}
