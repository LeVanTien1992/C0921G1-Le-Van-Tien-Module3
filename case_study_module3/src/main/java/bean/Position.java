package bean;

public class Position {
    private int positionId;
    private String positionName;

    public Position() {
    }

    public Position(int positionId) {
        this.positionId = positionId;
    }

    public Position(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
