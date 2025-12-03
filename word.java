
abstract class Word {

    protected String text;
    protected String category;
    protected String difficulty;

    public String getText();
    public String getCategory();
    public String getDifficulty();

    public abstract Word pickWord(
        List<Word> wordList,
        String selectedCategory,
        String difficulty
    );
}

class BuiltInWord extends Word {

    private List<Word> builtInWordsList;

    @Override
    public String getText();
    @Override
    public String getCategory();
    @Override
    public String getDifficulty();
    @Override
    public Word pickWord(List<Word> wordList, String selectedCategory, String difficulty);
}