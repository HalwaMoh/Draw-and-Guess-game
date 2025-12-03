import javax.swing.JFrame;
import javax.swing.JPanel;

abstract class BaseFrame extends JFrame {

    // Attributes
    protected String frameTitle;
    protected int frameWidth;
    protected int frameHeight;
    protected int defaultCloseOperation;
    protected boolean visible;

    // Methods
    public abstract void handleResize();
    public abstract void setFrameProperties();
    public abstract void setScreen(JPanel panel);
    public abstract void changeFramePanel(BaseFrame newFrame);
}