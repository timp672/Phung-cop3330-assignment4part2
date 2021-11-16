package ucf.assignments.phungcop3330assignment4part2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class ToDoController implements Initializable {

    @FXML
    private TableView<Item> table;

    @FXML
    private TableColumn<Item, String> nameColumn;
    @FXML
    private TableColumn<Item, String> descColumn;
    @FXML
    private TableColumn<Item, LocalDate> dateColumn;


    //text input
    @FXML
    private TextField itemName;
    @FXML
    private TextField itemDesc;
    @FXML
    private DatePicker itemDate;


    public void initialize(URL url, ResourceBundle resourceBundle){
        nameColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        descColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Item, LocalDate>("date"));

        table.setItems(getItem());
    }

    public ObservableList<Item> getItem(){
        ObservableList<Item> item = FXCollections.observableArrayList();

        return item;
    }

    //clicked on add item
    public void addItem(ActionEvent event) {
        //add new to do item to list object
        Item item = new Item();
        item.setName(itemName.getText());
        item.setDescription(itemDesc.getText());
        item.setDate(itemDate.getValue());
        table.getItems().add(item);
        itemName.clear();
        itemDesc.clear();
        itemDate.getEditor().setText("");

    }

    public void removeItem(MouseEvent event) {

        ObservableList<Item> selectedRows, allItems;
        allItems = table.getItems();

        selectedRows = table.getSelectionModel().getSelectedItems();

        for (Item item: selectedRows)
        {
            allItems.remove(item);
        }
    }
    //edit name
    public void editName(TableColumn.CellEditEvent edittedCell){
        Item itemSelect = table.getSelectionModel().getSelectedItem();
        itemSelect.setName(edittedCell.getNewValue().toString());
    }
    public void editDescription(TableColumn.CellEditEvent edittedCell){
        Item itemSelect = table.getSelectionModel().getSelectedItem();
        itemSelect.setDescription(edittedCell.getNewValue().toString());
    }

    public boolean toDoCompleted() {
        //mark a task as completed
        //return true if the task has been deleted
        return true;
    }

    public void showCompletedTasks() {
        //displays all completed tasks in the list
    }

    public void showUncompletedTasks() {
        //displays all uncompleted tasks in the list
    }






}
