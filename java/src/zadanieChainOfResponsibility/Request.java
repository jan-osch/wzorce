package zadanieChainOfResponsibility;

public class Request {

    private int impact;
    private int priority;

    public Request(int impact, int priority) {
        this.impact = impact;
        this.priority = priority;
    }

    public int getSeverity() {
        return this.impact * this.impact * this.priority;
    }

    public void solve() {
        System.out.println("Request was solved:" + presentRequest());
    }

    private String presentRequest() {
        return "Impact: " + this.presentImpact() + " Priority: " + this.presentPriority();
    }

    private String presentImpact() {
        switch (this.impact) {
            case 1:
                return "local";
            case 2:
                return "middle";
            case 3:
                return "global";
            default:
                return "";
        }
    }

    private String presentPriority() {
        switch (this.priority) {
            case 1:
                return "low";
            case 2:
                return "medium";
            case 3:
                return "high";
            case 4:
                return "critical";
            default:
                return "";
        }
    }


    public void drop() {
        System.out.println("Request was dropped:" + this.presentRequest());
    }
}
