/*
package project.ui.filterOptions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FilterOptions {
    private HBox filterBox;

    public FilterOptions() {
        filterBox = new HBox(10);
        filterBox.setStyle("-fx-padding: 20;");

        // Tạo các combo box
        ComboBox<String> brandBox = new ComboBox<>();
        brandBox.getItems().addAll("Apple", "Samsung", "Dell", "...");
        brandBox.setPromptText("Brand");

        ComboBox<String> categoryBox = new ComboBox<>();
        categoryBox.getItems().addAll("Laptop", "Desktop", "Tablet", "...");
        categoryBox.setPromptText("Category");

        ComboBox<String> osBox = new ComboBox<>();
        osBox.getItems().addAll("macOS", "Windows", "Linux", "...");
        osBox.setPromptText("OS");

        ComboBox<String> costBox = new ComboBox<>();
        costBox.getItems().addAll("Below 10M", "10M - 30M", "30M - 50M", "Above 50M");
        costBox.setPromptText("Cost");

        ComboBox<String> statusBox = new ComboBox<>();
        statusBox.getItems().addAll("Available", "Out of Stock", "Sale events", "...");
        statusBox.setPromptText("Status");
        String style = "-fx-background-color: #f0f4ff; -fx-padding: 5 5; " +
                "-fx-border-radius: 10; -fx-background-radius: 10;";
        brandBox.setStyle(style);
        categoryBox.setStyle(style);
        osBox.setStyle(style);
        costBox.setStyle(style);
        statusBox.setStyle(style);

        // Thiết lập vị trí
        filterBox.setTranslateX(0);
        filterBox.setTranslateY(380);

        // Thêm các ComboBox vào HBox
        filterBox.getChildren().addAll(brandBox, categoryBox, osBox, costBox, statusBox);
    }

    private ComboBox<String> createComboBox(String promptText, String... items) {
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(items);
        comboBox.setPromptText(promptText);

        // Thiết lập kích thước
        comboBox.setPrefWidth(110); // Giảm chiều rộng
        comboBox.setMaxWidth(110);

        comboBox.setStyle("-fx-background-color: #f0f4ff; -fx-padding: 5 10; -fx-border-radius: 10; -fx-background-radius: 10;");

        // Đảm bảo prompt text hiển thị đầy đủ
        comboBox.setEditable(false);

        return comboBox;
    }

    public HBox getFilterBox() {
        return filterBox;
    }
}

 */

package project.ui.filterOptions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class FilterOptions {

    private HBox filterBox;

    public FilterOptions() {
        // Khởi tạo components trong constructor
        initializeComponents();
    }

    private void initializeComponents() {
        // ComboBox cho Brand
        ComboBox<String> brandBox = new ComboBox<>();
        brandBox.getItems().addAll("Apple", "Samsung", "Dell", "Asus");
        brandBox.setPromptText("Brand");

        // ComboBox cho Category
        ComboBox<String> categoryBox = new ComboBox<>();
        categoryBox.getItems().addAll("Laptop", "Desktop", "Tablet", "Accessories");
        categoryBox.setPromptText("Category");

        // ComboBox cho OS
        ComboBox<String> osBox = new ComboBox<>();
        osBox.getItems().addAll("macOS", "Windows", "Linux", "ChromeOS");
        osBox.setPromptText("OS");

        // ComboBox cho Cost
        ComboBox<String> costBox = new ComboBox<>();
        costBox.getItems().addAll("Below 10M", "10M - 20M", "20M - 30M", "Above 30M");
        costBox.setPromptText("Cost");

        // ComboBox cho Status
        ComboBox<String> statusBox = new ComboBox<>();
        statusBox.getItems().addAll("Available", "Out of Stock", "Coming Soon");
        statusBox.setPromptText("Status");

        // Style từng ComboBox (màu sắc + padding)
        String style = "-fx-background-color: #f0f4ff; -fx-padding: 5 5; " +
                "-fx-border-radius: 10; -fx-background-radius: 10;";
        brandBox.setStyle(style);
        categoryBox.setStyle(style);
        osBox.setStyle(style);
        costBox.setStyle(style);
        statusBox.setStyle(style);

        // Gán vào instance variable thay vì biến local
        filterBox = new HBox(15, brandBox, categoryBox, osBox, costBox, statusBox);
        filterBox.setStyle("-fx-padding: 30;");
        filterBox.setTranslateX(0);
        filterBox.setTranslateY(380);
    }

    public HBox getFilterBox() {
        return filterBox;
    }
}

