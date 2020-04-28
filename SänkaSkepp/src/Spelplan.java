import java.awt.*;

public class Spelplan {

    private int height;
    private int width;
    private int rows;
    private int columns;
    private int xDot;
    private int yDot;
    private boolean grid;
    private boolean gameover;
    private int[][] spelplan;

    private final int NOTHING = 0;
    private final int SKEPP = 1;
    private final int SKEPPHIT = 2;

    public Spelplan(int width, int height, int columns, int rows, boolean grid) {
        this.width = 1000;
        this.height = 1000;
        this.columns = 10;
        this.rows = 10;
        this.grid = grid;
        gameover = false;
        xDot = (int) width / columns;
        yDot = (int) height / rows;
        spelplan = new int[columns][rows];
       // setSize(new Dimension(width, height));
       // setBackground(Color.white);
        reset();
    }
    public void reset(){
        for(int i=0;i<columns;i++)
            for(int j=0;j<rows;j++)
                spelplan[i][j] = NOTHING;
        gameover = false;
    }

    public int columnCount(){
        return columns;
    }

    public int rowCount(){
        return rows;
    }


}
