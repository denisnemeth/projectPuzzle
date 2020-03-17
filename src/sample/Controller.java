package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

    public Button btnStart;
    public Button btnEnd;
    public Button btnReset;
    public Button btn_empty, btn_1, btn_2, btn_3;
    public Button btn_4, btn_5, btn_6, btn_7;
    public Button btn_8, btn_9, btn_10, btn_11;
    public Button btn_12, btn_13, btn_14, btn_15;

    public void startGame(ActionEvent actionEvent) {}
    public void endGame(ActionEvent actionEvent) {Platform.exit();}
    public void resetGame(ActionEvent actionEvent) {}
    public void clickBtn(ActionEvent actionEvent) {}
}
