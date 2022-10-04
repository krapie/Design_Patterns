package chapter_10_state;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    // getters

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder display = new StringBuilder(
                "\n주식회사 왕뽑기\n" +
                "자바로 돌아가는 최신형 뽑기 기계\n" +
                "남은 개수: " + count + "개\n");

        if (count > 0) {
            display.append("동전 투입 대기중");
        } else {
            display.append("매진되었습니다.");
        }

        return display.toString();
    }
}
