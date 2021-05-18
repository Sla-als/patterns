package lesson03.windowsImpl;

import lesson03.Button;
import lesson03.GUIFactory;
import lesson03.Select;
import lesson03.TextField;

public class WindowsGUIFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public TextField createTextField() {
       return new WindowsTextField();
    }

    public Select createSelect() {
        return new WindowsSelect();
    }
}
