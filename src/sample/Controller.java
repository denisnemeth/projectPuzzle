package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

    public Button btnStart;
    public Button btnEnd;
    public Button btnReset;
    public Button btn_0, btn_1, btn_2, btn_3;
    public Button btn_4, btn_5, btn_6, btn_7;
    public Button btn_8, btn_9, btn_10, btn_11;
    public Button btn_12, btn_13, btn_14, btn_15;
    private Game game;

    public Controller() {game = new Game();}
    public void clickBtn(ActionEvent actionEvent) {
        String temp = ((Button)actionEvent.getSource()).getId().substring(4);
        int value = Integer.parseInt(temp);
        if (value != 0) {
            game.nextMove(value);
        }
    }
    public void changeTiles() {}
    public void startGame(ActionEvent actionEvent) {
        game.startGame();
        btnStart.setDisable(true);
        btnReset.setDisable(false);
    }
    public void endGame(ActionEvent actionEvent) {
        Platform.exit();
    }
    public void resetGame(ActionEvent actionEvent) {
        game.resetGame();
        btnReset.setDisable(true);
        btnStart.setDisable(false);
    }
}
