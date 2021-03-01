package ru.sapteh.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sapteh.dao.DAO;
import ru.sapteh.entity.User;
import ru.sapteh.service.UserDaoImpl;

import java.util.ArrayList;
import java.util.List;


public class RegistrationController {
    public RegistrationController() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        DAO<User, Integer> userDAOImpl = new UserDaoImpl(factory);
    }

    List<User> users = new ArrayList<>();

   @FXML
   private TextField txtName;
   @FXML
   private TextField txtLogin;
   @FXML
    private PasswordField txtPassword;
   @FXML
    private Label lblInfo;
   @FXML
    private TextField txtRole;
   @FXML
    private Button buttonReg;
   @FXML
    private Button buttonQuit;

   @FXML
    public void SignIn(){

   }

}
