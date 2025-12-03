class GameController {

    // Attributes
    private List<Player> players;
    private int currentPlayerIndex;
    private Player currentDrawer;
    private Player currentGuesser;
    private Word currentWord;
    private int roundNumber;
    private Map<Player, Integer> scoreBoard;
    private Timer hintTimer;
    private int hintCount;

    // Methods
    public void startGame();
    public void assignDrawer();
    public void assignGuesser();
    public void chooseWord();
    public void calculateScore(String guess, int timeTaken);
    public void calculateHint();
    public boolean checkGuess(String guess);
    public Player getWinner();
}