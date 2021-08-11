package nz.ac.massey;

import javax.swing.*;
import java.awt.*;

public class Search {
    TextArea SearchFunction(TextArea textBox) {
        String searchBox = (String)JOptionPane.showInputDialog("Search Text:");
        final int l1 = textBox.getText().indexOf(searchBox);
        final int l2 = searchBox.length();

        if (l1 == -1) {
            JOptionPane.showMessageDialog(null, "Search Value Not Found");
        } else {
            textBox.select(l1, l2+l1);
        }
        return textBox;
    }
}
