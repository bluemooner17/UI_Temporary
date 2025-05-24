package project.ui.product2;

import project.ui.product2.details2.Details2;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import project.ui.product1.details1.Details1;

public class Product2 {
    private VBox productPane;
    private void showProductDetails() {
        Details2.showProductDetails();
    }
    public Product2() {
        productPane = new VBox(10);
        productPane.setStyle("-fx-padding: 20;");

        // Thêm sản phẩm
        Image image = new Image("C:\\Users\\TBN\\Desktop\\2024.2 courses\\Java learning - OOP 2024.2\\Java code\\UI\\ImageResources\\Product2.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        Text productName = new Text("HP 240 G8");
        productName.setFill(Color.BLACK);
        Text productPrice = new Text("14.490.000đ");
        productPrice.setFill(Color.BLACK);
        Button addButton1 = new Button("More...");
        addButton1.setTextFill(Color.BLACK);
        addButton1.setOnAction(e -> {
            System.out.println("More button clicked for MacBook Air M1");
            // Xử lý khi nhấn nút
            showProductDetails();
        });
        productPane.setTranslateX(230);
        productPane.setTranslateY(450);

        productPane.getChildren().addAll(imageView, productName, productPrice, addButton1);
    }

    public VBox getProductPane() {
        return productPane;
    }
}