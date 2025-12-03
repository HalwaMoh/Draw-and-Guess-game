class GameFrame extends BaseFrame {
    // Attributes & Components
    private DrawPanel drawPanel;
    private JPanel scorePanel;
    private JLabel roundNumberDisplay;
    private JLabel hintDisplay;
    private JLabel currentDrawerLabel;
    private JLabel currentGuesserLabel;
    private JLabel timerDisplay;
    private JPanel answerPanel;
    private JLabel guessResultDisplay;
    private JPanel redoUndoPanel;
    private JPanel okNextPanel;

    // Methods
    public void updateScores();
    public void displayCurrentWordHint();
    public void switchTurn();
    public void updateTimerDisplay();
    public void showGuessResult(boolean correct);
    public void attachDrawListeners();
    public void handleRedoUndo();

    @Override
    public void setScreen(JPanel panel);
    @Override
    public void changeFramePanel(BaseFrame newFrame);

    public void showGuessPopup();
}