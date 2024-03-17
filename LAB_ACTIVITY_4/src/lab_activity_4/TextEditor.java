
package lab_activity_4;


public class TextEditor {
    private String text;
    public String prevText[] = new String[10];
    public int history = 0;
    
    public TextEditor(String initialText) {
        prevText[history] = text;
        history++;
        
        this.text = initialText;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String newText) {
        this.text = newText;
    }
    
    public void append(String newText) { //it appends the new text
        
        prevText[history] = text;
        
        history++;
        
        this.text += newText;
    }
    
    public void delete(int n){ //deletes one letter at a time
        
        prevText[history] = text;
        history ++;
        
        if(n>=this.text.length()){
        } else{
            this.text = this.text.substring(0, this.text.length() - n);
        }
    }
}
