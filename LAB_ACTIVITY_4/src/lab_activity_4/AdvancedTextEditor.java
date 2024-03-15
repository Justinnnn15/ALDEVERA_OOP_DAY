
package lab_activity_4;

import java.util.Stack;


public class AdvancedTextEditor extends TextEditor {
    private Stack<String> history;

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        history = new Stack<>();
        history.push(initialText);
    }

    public void append(String newText) {
        super.append(newText);
        history.push(text);
    }

    @Override
    public void delete(int n) {
        super.delete(n);
        history.push(text);
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop(); // Remove current state
            if (!history.isEmpty())
                text = history.peek(); // Revert to the previous state
        }
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
