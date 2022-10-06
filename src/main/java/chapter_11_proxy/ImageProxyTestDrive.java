package chapter_11_proxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("앨범 커버 뷰어");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> albums = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        albums.put("Love Dive", "https://i.scdn.co/image/ab67616d0000b2739016f58cc49e6473e1207093");
        albums.put("Fearless", "https://cdns-images.dzcdn.net/images/cover/5d27bb682fabe51b4245ec2ac4c8ff64/500x500.jpg");
        albums.put("Mozart Piano Concerto No. 20", "https://i.scdn.co/image/ab67616d0000b273412d95241fe57790ba434dac");
        albums.put("Chopin Piano Concerto No. 1", "https://m.media-amazon.com/images/I/71CM1GPERaL._AC_SX342_.jpg");

        URL initialURL = new URL(albums.get("Love Dive"));
        menuBar = new JMenuBar();
        menu = new JMenu("즐겨찾는 앨범");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for(Enumeration<String> e = albums.keys(); e.hasMoreElements();) {
            String name = e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
                frame.repaint();
            });
        }

        // 프레임 및 메뉴 설정

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getAlbumUrl(String name) {
        try {
            return new URL(albums.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
