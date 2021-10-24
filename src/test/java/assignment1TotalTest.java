import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.Objects;

class FileMenuOptions{
    @Test
    //Loading previously saved to do list.
    public void openFile(){
        //Create new File 'openFile' to 'fileC.showOpenDialog'.
        //Use assertions to see if file exist.
        //If 'openFile' has a value (not null), then open the file.
    }

    @Test
    //Loading multiple to-do list.
    public void openAnotherFile(){
        //Use assertions to see if file exist.
        //Try to load new stage for another file window to be opened.
    }

    @Test
    //Save all items in to-do list. This should also work for multiple to-do list.
    public void saveFile(){
        //Create new File 'saveFile' to 'fileC.showSaveDialog'.
        //Use assertions to see if the saved file exist.
        //If 'saveFile' has a value (not null), then save the file to a destination.
    }

    //Set on action of clicking an item that has already been added to the table.
    //Set a new button for committing changes called 'commit'; Clicking this will alter the information in
    //the table.
    @Test
    //Edit description and edit due-date.
    public void editInformation(){
        //Get information of selected row and display a text box with the relevant information for
        //'task', 'dueDate', and 'taskDescription.
        //The information in the text boxes can be changed and committed to the row through pushing the
        //commit button.
        //Use assertions to make sure the information added is valid and not null.
    }
    //Create a new button called 'DeleteTask'. Clicking this will remove the current row from the table.
    @Test
    //Delete current task from to-do-list.
    public void deleteInformation(){
        //Create new variable called 'removeTask', which will be set to the current selected item (row)
        //of the table.
        //Use .getItems().remove() and remove the current row set to 'removeTask'.
        //Use assertions to verify that the information from 'removeTask' is no longer found in the table.
    }
}

class ToDoList {
    //Create 'public final SimpleStringProperty' for listName, task, dueDate, and taskDescription. Also create a new
    // CheckBox value for the 'complete' column.

    //Constructs To-do list.
    private ToDoList(
            //This will use Strings of the id values
    ) {
        //Set each SSP to 'this.(variableName)' to a new SSP of the corresponding id value found in the App.fxml file (
        //there is currently no set ids as they will be added in part 2 of the assignment).
    }

    @Test
    public String getListName(){ //Get value of To-Do List name, then return value.
        //Assert that the input value is not null, as there has to be a title for the to-do list.
        return "String literal";
    }
    @Test
    //Edit title of existing to-do-list.
    public void addListName(){
        //If there is new input in the list name then change current list name.
        //Assert that the current list name is now equal to the new to-do.
    }

    @Test
    //addTask(), addDueDate(), & addTaskDescription() are used together to add a new item to an existing to-do list.
    public String getTask(){ //Get value from Task column, then return value.
        //Assert that the input value is not null, as there has to be a task name for the to-do list.
        return "String literal";
    }
    @Test
    public void addTask(
            //String of id matched to task input
    ){
        //Assert that the current value in the table is no longer null with the new input.
        //Set input value of task to SSP 'task'.
    }

    @Test
    public String getDueDate(){ //Get value from dueDate column, then return value.
        //Assert that the input value is not null, as there has to be a task name for the to-do list.
        return "String literal";
    }
    @Test
    public void addDueDate(
            //String of id matched to dueDate input
    ){
        //Verify input is in proper format. Do not allow any information to be input if incorrect.
        //Set input value of date to SSP 'dueDate'.
    }

    @Test
    public String getTaskDescription(){ //Get value from taskDescription column, then return value.
        return "String Literal";
    }
    @Test
    public void addTaskDescription(
            //String of id matched to taskDescription input
    ){
        //Set input value of taskDescription to SSP 'taskDescription'.
    }

    @Test
    //Used to mark if item is complete; Clicking the button next to (complete) should display only completed items.
    public boolean complete(){ //Use 'isSelected() to verify if the checkbox is ticked, then return true if it is, else
        //false
        //Use assertions to check if the checkbox is ticked.
        return true;
    }
}

class App extends Application {

    @Test
    //Used to open up the App.fxml, which will create an instance that will allow a new to-do list to be opened.
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Assert that 'App.fxml' exist and is not null.
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("App.fxml")));
        primaryStage.setTitle("To-do List");
        primaryStage.setScene(new Scene(root, 600, 430));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
