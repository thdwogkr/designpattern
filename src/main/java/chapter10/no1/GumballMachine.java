package src.main.java.chapter10.no1;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한개만 넣자");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("상품이 매진되었습니다. 다음 기회 이용바람!");
        } else if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알멩이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않아 동전을 반환할 수 없습니다.");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("손잡이는 한번만 돌려주세요.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("알멩이를 내보내고 있습니다.");
            afterDispense();
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("알멩이를 내보낼 수 없습니다.");
        }
    }

    private void afterDispense() {
        count = count -1;
        if (count == 0) {
            System.out.println("더 이상 알멩이가 없습니다.");
            state = SOLD_OUT;
        } else {
            state = NO_QUARTER;
        }
    }

    @Override
    public String toString() {
        String stateName = null;
        if (state == SOLD_OUT) {
            stateName = "매진";
        } else if (state == NO_QUARTER) {
            stateName = "동전 투입 대기중";
        } else if (state == HAS_QUARTER) {
            stateName = "동전 투입 후 대기중";
        } else if (state == SOLD) {
            stateName = "판매중";
        }
        return "\n주식회사 왕뽑기" +
                "\n자바로 돌아가는 최신형 뽑기 기계" +
                "\n남은 개수 : " + count +
                "\nstate = " + stateName +
                "\n"
                ;
    }
}
