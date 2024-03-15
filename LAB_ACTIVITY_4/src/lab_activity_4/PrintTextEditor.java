
package lab_activity_4;

import static java.awt.SystemColor.text;


public class PrintTextEditor extends TextEditor {
    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    public void print() {
        System.out.println(text);
    }
}
