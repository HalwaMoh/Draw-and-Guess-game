public class RoundEndFrame {
    // Attributes & Components
    private JLabel roundWinnerLabel;
    private JPanel roundScorePanel;
    private JButton nextRoundButton;
    private JButton quitButton;
    private JPanel okNextPanel;

    // Methods
    public void displayRoundResults();
    public String getPlayerDecision();

    @Override
    public void setScreen(JPanel panel);
    @Override
    public void changeFramePanel(BaseFrame newFrame);
}

