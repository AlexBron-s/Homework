public class Human implements Members{
    private final String NAME = "Человек";
    private int number;
    private int maxLengthRun;
    private int maxHeightJump;

    public Human(int number, int maxLengthRun, int maxHeightJump) {
        this.number = number;
        this.maxLengthRun = maxLengthRun;
        this.maxHeightJump = maxHeightJump;
    }
    @Override
    public Boolean run(RunningTrack runningTrack){
        if (runningTrack.getLength() <= maxLengthRun) {
            System.out.println(NAME + " " + number + " пробежал дорожку");
            return true;
        }
        System.out.println(NAME + " " + number + " не смог пробежать дорожку");
        return false;
    }
    @Override
    public Boolean jump(Wall wall) {
        if (wall.getHeight() <= maxHeightJump) {
            System.out.println(NAME + " " + number + " перепрыгнул стену");
            return true;
        }
        System.out.println(NAME + " " + number + " не смог перепрыгнуть стену");
        return false;
    }
}
