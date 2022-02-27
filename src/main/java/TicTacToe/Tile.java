package TicTacToe;

import javax.swing.*;

public class Tile extends JButton {
    private char state;
    public Tile(){
    state = 'u';

    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
}
