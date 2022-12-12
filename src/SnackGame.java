import javax.swing.*;

public class SnackGame extends JFrame {
    private GameBoard board;
    public SnackGame(){
        board=new GameBoard();
        add(board);
        setBounds(100,100,800,500);
        setResizable(false);
        pack();
        setVisible(true);



    }
    public static void main(String[] args){
        JFrame snackGame=new SnackGame();
    }
}

