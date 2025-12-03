class DrawPanel extends JPanel {

    // Attributes
    private Color penColor;
    private List<Stroke> strokes;

    // Methods
    private void handleResize();
    @Override
    protected void paintComponent(Graphics g);
    private void mousePressed();
    private void mouseDragged();
    public void changePenColor(Color c);
    public void clearCanvas();
}