package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Contact;

public class ContactsController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField notesField;

    public Contact getNewContact(){
        String firstName = this.firstNameField.getText();
        String lastName = this.lastNameField.getText();
        String phoneNumber = this.phoneNumberField.getText();
        String notes = this.notesField.getText();
        Contact newContact = new Contact(firstName , lastName, phoneNumber, notes);
        return newContact;
    }


    public void editContact(Contact editContact){

        firstNameField.setText(editContact.getFirstName());
        lastNameField.setText(editContact.getLastName());
        phoneNumberField.setText(editContact.getPhoneNumber());
        notesField.setText(editContact.getNotes());
    }

    public void updateContact(Contact upContact){
        upContact.setFirstName(firstNameField.getText());
        upContact.setLastName(lastNameField.getText());
        upContact.setPhoneNumber(phoneNumberField.getText());
        upContact.setNotes(notesField.getText());
    }


}
