package lesson03.macosImpl;

import lesson03.Button;
import lesson03.GUIFactory;
import lesson03.Select;
import lesson03.TextField;

public class MacGUIFactory  implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public TextField createTextField() {
        return new MacTextField();
    }

    public Select createSelect() {
        return new MacSelect();
    }
}
