package prac16.task2;

public class TextEditor {
    private boolean isCapsLock = false;

    public void capsLock() {
        isCapsLock = !isCapsLock;
    }

    public void print(String text) {
        System.out.println(isCapsLock ? text.toUpperCase() : text);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.print("привет");
        editor.capsLock();
        editor.print("привет");
        editor.capsLock();
        editor.print("мир");
    }
}
