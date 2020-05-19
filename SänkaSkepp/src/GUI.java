import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class GUI {

    private enum ConnectionState { LISTENING, CONNECTING, CONNECTED, CLOSED }
    private static String defaultPort = "1501";
    private static String defaultHost = "localhost";

    JFrame frame=new JFrame();
    JButton[][] grid;

    public GUI(int width, int length){
        frame.setLayout(new GridLayout(width,length));
        grid=new JButton[width][length];
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){
                grid[x][y]=new JButton("("+x+","+y+")");

                grid[x][y].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        grid[1][1].setBackground(Color.RED);
                        grid[1][1].setOpaque(true);
                    }
                });
                grid[x][y].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println(((JButton)actionEvent.getSource()).getText());
                    }
                });
                frame.add(grid[x][y]);
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI(10,10);
    }
}