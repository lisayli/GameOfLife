package gameoflife;

public enum LifeStatus {
    ALIVE("10"), DEAD("0");


    private final String state;

    LifeStatus(String state) {

        this.state = state;
    }

    public String getState() {
        return state;
    }
}

