
class CustomWord extends Word {

    private List<Word> customWordsList;

    public void setText(String text);
    public void setCategory(String category);
    public void setDifficulty(String difficulty);

    // Inherits abstract methods from Word
    @Override
    public String getText();
    @Override
    public String getCategory();
    @Override
    public String getDifficulty();
    @Override
    public Word pickWord(List<Word> wordList, String selectedCategory, String difficulty);
}

class RoundTimer {

    private int timeRemaining;

    public void startTimer();
    public void stopTimer();
    public int returnTime();
}