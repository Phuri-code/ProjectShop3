import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button_buy;

    @FXML
    private Label price_tag;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    void on_buy(ActionEvent event) {
        int item_1_price = 1;
        int item_2_price = 5;
        int item_3_price = 3;

        int item_1_quantity = spinner_Item_1.getValue();
        int item_2_quantity = spinner_Item_2.getValue();
        int item_3_quantity = spinner_Item_3.getValue();

        int total_price = (item_1_price * item_1_quantity) + (item_2_price * item_2_quantity) + (item_3_price * item_3_quantity);

        price_tag.setText("Total Price: " + total_price + "$");

    }

    VBox vbox = new VBox();

    HBox hbox_1 = new HBox();
    HBox hbox_2 = new HBox();
    HBox hbox_3 = new HBox();

    Label label_1 = new Label("apple");
    Label label_item_1_price = new Label("1$");
    Image image1 = new Image(getClass().getResourceAsStream("/apple.png"));
    ImageView image_1 = new ImageView(image1);
    Spinner<Integer> spinner_Item_1 = new Spinner<>(0, 100, 0);

    Label label_2 = new Label("kiwi");
    Label label_item_2_price = new Label("5$");
    Image image2 = new Image(getClass().getResourceAsStream("/kiwi.png"));
    ImageView image_2 = new ImageView(image2);
    Spinner<Integer> spinner_Item_2 = new Spinner<>(0, 100, 0);

    Label label_3 = new Label("orange");
    Label label_item_3_price = new Label("3$");
    Image image3 = new Image(getClass().getResourceAsStream("/orage.png"));
    ImageView image_3 = new ImageView(image3);
    Spinner<Integer> spinner_Item_3 = new Spinner<>(0, 100, 0);

    @FXML
    void initialize() {

        image_1.setFitWidth(200);
        image_1.setFitHeight(200);

        image_2.setFitWidth(200);
        image_2.setFitHeight(200);

        image_3.setFitWidth(200);
        image_3.setFitHeight(200);

        hbox_1.getChildren().addAll(
                label_1,
                label_item_1_price,
                image_1,
                spinner_Item_1
        );

        hbox_2.getChildren().addAll(
                label_2,
                label_item_2_price,
                image_2,
                spinner_Item_2
        );

        hbox_3.getChildren().addAll(
                label_3,
                label_item_3_price,
                image_3,
                spinner_Item_3
        );

        vbox.getChildren().addAll(hbox_1);
        vbox.getChildren().addAll(hbox_2);
        vbox.getChildren().addAll(hbox_3);

        scrollpane.setContent(vbox);
    }
}