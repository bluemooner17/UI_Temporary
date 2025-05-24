package project.ui.logoQ;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LogoQ {
    private Label labelQ;

    public LogoQ() {
        labelQ = new Label("Q");
        labelQ.setTextFill(Color.LIGHTGRAY);
        labelQ.setFont(Font.font("Bangers", FontWeight.BOLD, 90));
        labelQ.setTranslateX(-240);
        labelQ.setTranslateY(-260);
    }

    public Label getLabel() {
        return labelQ;
    }

}