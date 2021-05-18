package lesson03.linuxImpl;

import lesson03.Button;
import lesson03.GUIFactory;
import lesson03.Select;
import lesson03.TextField;

public class LinuxGUIFactory implements GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public TextField createTextField() {
        return new LinuxTextField();
    }

    public Select createSelect() {
        return new LinuxSelect();
    }
}
