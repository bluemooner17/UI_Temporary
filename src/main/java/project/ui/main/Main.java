package project.ui.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import project.ui.background.Background;
import project.ui.logoQuickLap.LogoQuickLap;
import project.ui.logoQ.LogoQ;
import project.ui.product1.Product1;
import project.ui.product2.Product2;
import project.ui.product3.Product3;
import project.ui.textFilter.TextFilter;
import project.ui.filterOptions.FilterOptions;
import project.ui.searchBar.SearchBar;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tạo các thành phần giao diện
        LogoQuickLap logo1 = new LogoQuickLap();
        LogoQ logo2 = new LogoQ();
        Background background = new Background();
        Product1 product1 = new Product1();
        Product2 product2 = new Product2();
        Product3 product3 = new Product3();
        TextFilter textMenu = new TextFilter();
        FilterOptions filterOptions = new FilterOptions();
        SearchBar searchBar = new SearchBar();

        // Tạo StackPane để chứa tất cả các thành phần
        StackPane root = new StackPane();
        root.getChildren().addAll(background.getImageView(), logo1.getLabel(),
                logo2.getLabel(), textMenu.getLabel(), filterOptions.getFilterBox(), searchBar.getSearchContainer(), product1.getProductPane(), product2.getProductPane(),
                product3.getProductPane());

        // Tạo Scene và hiển thị
        Scene scene = new Scene(root, 600, 700);
        primaryStage.setTitle("QuickLap");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
