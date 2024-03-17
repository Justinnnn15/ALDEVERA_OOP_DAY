
package lab_activity_4;


public class PrintTextEditor extends TextEditor {
    public PrintTextEditor(String initialText) {
        super(initialText);
    }
    
    public void print(){
        System.out.println(getText());
    }
}
