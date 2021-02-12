package FootBall_Leauge;




public class FootBall2021 implements Comparable<FootBall2021> {
  private int TeamName;
  private String club;
  private int PlayedMatches;
  private int WonMatches;
  private int LostMatches;
  private int TeamPoints;
  private double TeamNRR;
  
  
  public FootBall2021(int position, String club, int played, int won,int lost, int points, double nrr) {
    this.TeamName = position;
    this.club = club;
    this.PlayedMatches = played;
    this.WonMatches = won;
    this.LostMatches = lost;
    this.TeamPoints = points;
    this.TeamNRR = nrr;
  }

  public String toString() {
    return String.format("%-3d%-20s%10d%10d%10d%10d%25f", TeamName, club, PlayedMatches, WonMatches, LostMatches, TeamPoints,TeamNRR);
  }

  public int getPosition() {
    return TeamName;
  }

  public void setPosition(int position) {
    this.TeamName = position;
  }

  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }

  public int getPlayed() {
    return PlayedMatches;
  }

  public void setPlayed(int played) {
    this.PlayedMatches = played;
  }

  public int getWon() {
    return WonMatches;
  }

  public void setWon(int won) {
    this.WonMatches = won;
  }

  public int getLost() {
    return LostMatches;
  }

  public void setLost(int lost) {
    this.LostMatches = lost;
  }
  
  public int getPoints() {
	  return TeamPoints;
  }
  
  public void setPoints(int points) {
	  this.TeamPoints = points;
  }
  
  public double getNrr() {
	  return TeamNRR;
  }
  
  public void setNrr(double nrr) {
	  this.TeamNRR = nrr;
  }
  
@Override
public int compareTo(FootBall2021 c) {
    return ((Integer) TeamPoints).compareTo(c.TeamPoints);
  }
}
