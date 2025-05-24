package project.ui.background;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Background {
    private ImageView imageView;

    public Background() {
        Image image = new Image("C:\\Users\\TBN\\Desktop\\2024.2 courses\\Java learning - OOP 2024.2\\Java code\\UI\\ImageResources\\Background.jpg"); // Thay đổi đường dẫn
        imageView = new ImageView(image);
        imageView.setFitWidth(600);
        imageView.setFitHeight(350);
        imageView.setTranslateX(0);
        imageView.setTranslateY(-175);
    }

    public ImageView getImageView() {
        return imageView;
    }
}