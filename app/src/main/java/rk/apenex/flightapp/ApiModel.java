package rk.apenex.flightapp;

public class ApiModel {
    private boolean isUsingApi1;

    public ApiModel() {
    }

    public ApiModel(boolean isUsingApi1) {
        this.isUsingApi1 = isUsingApi1;
    }

    public boolean isUsingApi1() {
        return isUsingApi1;
    }

    public void setUsingApi1(boolean usingApi1) {
        isUsingApi1 = usingApi1;
    }
}
