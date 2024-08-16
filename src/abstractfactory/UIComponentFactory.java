package abstractfactory;

import java.awt.*;

public interface UIComponentFactory {
    Button createButton();
    TextField createTextField();
}