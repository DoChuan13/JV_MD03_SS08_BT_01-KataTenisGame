public class TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score == player2Score) {
            if (player1Score < 4) {
                score = getScoreString(player1Score) + "-All";
            } else {
                score = "Deuce";
            }
        } else if (player1Score > 3 || player2Score > 3) {
            int minusResult = player1Score - player2Score;
            if (Math.abs(minusResult) == 1)
                score = "Advantage " + (minusResult > 0 ? player1Name : player2Name);
            else
                score = "Win for " + (minusResult > 0 ? player1Name : player2Name);

        } else score = getScoreString(player1Score) + "-" + getScoreString(player2Score);
        return score;
    }

    private static String getScoreString(int score) {
        String scoreToString = "";
        switch (score) {
            case 0:
                scoreToString += LOVE;
                break;
            case 1:
                scoreToString += FIFTEEN;
                break;
            case 2:
                scoreToString += THIRTY;
                break;
            case 3:
                scoreToString += FORTY;
                break;
        }
        return scoreToString;
    }
}
