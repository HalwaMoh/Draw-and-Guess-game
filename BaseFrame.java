class BaseFrame extends JFrame {

    // Attributes
    protected String frameTitle;
    protected int frameWidth;
    protected int frameHeight;
    protected int defaultCloseOperation;
    protected boolean visible;

    // Methods
    public void handleResize();
    public void setFrameProperties();
    public void setScreen(JPanel panel);
    public void changeFramePanel(BaseFrame newFrame);
}