package com.northcoders;

public class Choice {

    private String msg;
    private Room targetRoom;
    private int penalty = 0;

    public Choice(Room targetRoom, String msg) {
        this.msg = msg;
        this.targetRoom = targetRoom;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public Room getTargetRoom() {
        return targetRoom;
    }

    public void setTargetRoom(Room targetRoom) {
        this.targetRoom = targetRoom;
    }
}
