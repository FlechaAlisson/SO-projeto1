package pcb;



public class PCB {
    private int id;
    private String state;
    private float timeNecessary;
    private int priority;

    public PCB(int id, String state, float timeNecessary, int priority) {
        this.id = id;
        this.state = state;
        this.timeNecessary = timeNecessary;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getTimeNecessary() {
        return timeNecessary;
    }

    public void setTimeNecessary(float timeNecessary) {
        this.timeNecessary = timeNecessary;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "PCB{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", timeNecessary=" + timeNecessary +
                ", priority=" + priority +
                '}';
    }
}
