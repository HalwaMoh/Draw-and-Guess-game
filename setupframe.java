class SetupFrame extends BaseFrame {

    // Attributes & Components
    private JPanel playerEntryPanel;
    private JPanel wordTypePanel;
    private JPanel difficultyPanel;
    private JPanel okNextPanel;

    // Methods
    public List<String> getPlayerNames();
    public String getWordTypeSelection();
    public String getDifficultySelection();

    @Override
    public void setScreen(JPanel panel);
}