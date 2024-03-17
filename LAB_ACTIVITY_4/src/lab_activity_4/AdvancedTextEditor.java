
package lab_activity_4;


public class AdvancedTextEditor extends TextEditor {
    public AdvancedTextEditor(String text){
        super(text); //calls the initial text
    }
    
        public void undo(){ //to undo
        history--;
        
        setText(prevText[history]);
    }
}
