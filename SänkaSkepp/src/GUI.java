import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GUI {

    JFrame frame=new JFrame();
    JButton[][] grid;

    public GUI(int width, int length){
        frame.setLayout(new GridLayout(width,length));
        grid=new JButton[width][length];
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){
                grid[x][y]=new JButton("("+x+","+y+")");
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