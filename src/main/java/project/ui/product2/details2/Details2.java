package project.ui.product2.details2;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

public class Details2 {

    public static void showProductDetails() {
        // Tạo dialog chi tiết
        Dialog<Void> dialog = new Dialog<>();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.setTitle("Product Details");
        dialog.initStyle(StageStyle.UTILITY);
        dialog.getDialogPane().getStylesheets().add("path/to/styles.css");
        // Tạo layout
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setStyle("-fx-padding: 20;");

        // Thêm hình ảnh sản phẩm
        Image image = new Image("file:C:/Users/TBN/Desktop/2024.2 courses/Java learning - OOP 2024.2/Java code/UI/ImageResources/Product2.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        grid.add(imageView, 0, 0, 1, 3);

        // Thêm thông tin chi tiết
        grid.add(new Label("Product:"), 1, 0);
        grid.add(new Label("MacBook Air M1"), 2, 0);

        grid.add(new Label("Price:"), 1, 1);
        grid.add(new Label("18.990.000đ"), 2, 1);

        grid.add(new Label("Specs:"), 1, 2);
        grid.add(new Label("• Apple M1 Chip\n• 8GB RAM\n• 256GB SSD\n• 13.3\" Retina Display"), 2, 2);

        // Thêm nút đóng
        dialog.getDialogPane().setContent(grid);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);


        // Hiển thị dialog
        dialog.showAndWait();
    }

    /* Hoặc phiên bản đơn giản dùng Alert:
    public static void showProductDetails() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Product Details");
        alert.setHeaderText("MacBook Air M1");
        alert.setContentText("Price: 18.990.000đ\n\nSpecifications:\n"
                + "- Apple M1 Chip\n"
                + "- 8GB Unified Memory\n"
                + "- 256GB SSD Storage\n"
                + "- 13.3\" Retina Display");
        alert.showAndWait();
    }
    */
}