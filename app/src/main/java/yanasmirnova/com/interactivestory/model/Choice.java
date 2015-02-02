package yanasmirnova.com.interactivestory.model;

/**
 * Holds the options for the user to move through the Story.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
