package lesson03;

import lesson03.linuxImpl.LinuxGUIFactory;
import lesson03.macosImpl.MacGUIFactory;
import lesson03.windowsImpl.WindowsGUIFactory;

public class MainApp {
    public void drawForm() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;
        if (osName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        } else {
            guiFactory = new LinuxGUIFactory();
        }
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.drawForm();
    }
}
