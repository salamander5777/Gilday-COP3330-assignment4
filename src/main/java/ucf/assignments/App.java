package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Michael Gilday
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

class FileMenuOptions{
    //Create FileChooser 'fileC' set equal to new FileChooser.
    //Set on action of clicking on the menu option of open trough new event handler.
    //Set as @Override
    public void openFile(){
        //Create new File 'openFile' to 'fileC.showOpenDialog'.
        //If 'openFile' has a value (not null), then open the file.
    }

    //Set on action of clicking on the menu option of 'open in' trough new event handler.
    //Set as @Override
    public void openAnotherFile(){
        //Try to load new stage for another file window to be opened.
    }

    //Set on action of clicking on the menu option of save trough new event handler.
    //Set as @Override
    public void saveFile(){
        //Create new File 'saveFile' to 'fileC.showSaveDialog'.
        //If 'saveFile' has a value (not null), then save the file to a destination.
    }

    //Set on action of clicking an item that has already been added to the table.
    //Set a new button for committing changes called 'commit'; Clicking this will alter the information in
    //the table.
        public void editInformation(){
            //Get information of selected row and display a text box with the relevant information for
            //'task', 'dueDate', and 'taskDescription.
            //The information in the text boxes can be changed and committed to the row through pushing the
            //commit button.
        }
        //Create a new button called 'deleteTask'. Clicking this will remove the current row from the table.
        public void deleteInformation(){
            //Create new variable called 'removeTask', which will be set to the current selected item (row)
            //of the table.
            //Use .getItems().remove() and remove the current row set to 'removeTask'.
        }
}

class ToDoList {
    //Create 'public final SimpleStringProperty' for listName, task, dueDate, and taskDescription. Also create a new
    // CheckBox value for the 'complete' column.

    private ToDoList(
            //This will use Strings of the id values
    ) {
        //Set each SSP to 'this.(variableName)' to a new SSP of the corresponding id value found in the App.fxml file (
        //there is currently no set ids as they will be added in part 2 of the assignment).
    }

    //Set as @Override
    //Set on action of clicking on clicking the option of 'Change Name'.
        public String getListName(){ //Get value of To-Do List name, then return value.
            return "String literal";
        }
        public void addListName(){
            //If there is new input in the list name then change current list name.
        }

    public String getTask(){ //Get value from Task column, then return value.
        return "String literal";
    }
    public void addTask(
            //String of id matched to task input
    ){
        //Set input value of task to SSP 'task'.
    }

    public String getDueDate(){ //Get value from dueDate column, then return value.
        return "String literal";
    }
    public void addDueDate(
            //String of id matched to dueDate input
    ){
        //Verify input is in proper format. Do not allow any information to be input if incorrect.
        //Set input value of date to SSP 'dueDate'.
    }

    public String getTaskDescription(){ //Get value from taskDescription column, then return value.
        return "String Literal";
    }
    public void addTaskDescription(
            //String of id matched to taskDescription input
    ){
        //Set input value of taskDescription to SSP 'taskDescription'.
    }

    public boolean complete(){ //Use 'isSelected() to verify if the checkbox is ticked, then return true if it is, else
        //false.
        return true;
    }
}

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("App.fxml")));
        primaryStage.setTitle("To-do List");
        primaryStage.setScene(new Scene(root, 600, 430));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
