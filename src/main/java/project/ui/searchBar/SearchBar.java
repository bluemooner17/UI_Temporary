package project.ui.searchBar;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SearchBar {
    private HBox searchContainer;

    public SearchBar() {
        searchContainer = new HBox(10);
        searchContainer.setStyle("-fx-padding: 15; -fx-alignment: center;");

        // Tạo ô nhập liệu tìm kiếm
        TextField searchField = new TextField();
        searchField.setPromptText("What do you need today");
        searchField.setStyle("-fx-background-color: #ffffff; -fx-padding: 10 20; -fx-border-radius: 20; -fx-background-radius: 20; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 5, 0, 0, 2);");
        searchField.setPrefWidth(350);
        searchField.setFont(Font.font("Arial", 14));

        // Tạo nút tìm kiếm
        Button searchBtn = new Button("Search");
        searchBtn.setStyle("-fx-background-color: #4a7dff; -fx-text-fill: white; -fx-padding: 10 25; -fx-border-radius: 20; -fx-background-radius: 20; -fx-cursor: hand;");
        searchBtn.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        searchBtn.setOnAction(e -> handleSearch(searchField.getText()));

        // Thiết lập container
        searchContainer.getChildren().addAll(searchField, searchBtn);
        searchContainer.setTranslateY(-100); // Vị trí từ trên xuống
    }

    private void handleSearch(String query) {
        System.out.println("Searching for: " + query);
        // Thêm logic xử lý tìm kiếm tại đây
    }

    public HBox getSearchContainer() {
        return searchContainer;
    }
}