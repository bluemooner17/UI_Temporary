package project.ui.logoQuickLap;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LogoQuickLap {
    private Label label;

    public LogoQuickLap() {
        label = new Label("QuickLap");
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        label.setTranslateX(-85);
        label.setTranslateY(-250);
    }

    public Label getLabel() {
        return label;
    }
}