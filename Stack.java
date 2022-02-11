public class Stack {
    public static final int SIZE = 10;
    private int top = -1;
    private int[] stack ;
    
    public Stack() {
        stack = new int[SIZE];
    }
    // 스택이 비웠는지 확인 
    public boolean empty() {
        if(top == -1) {
           return true;
        } else {
           return false;
        }
    }

    // 스택이 꽉 찼는지 확인 
    public boolean pull() {
        if(top == SIZE-1) {
            return true;
        } else {
            return false;
        }
    }

    // 스택에 데이터 삽입 
    public void push(int data) {
        if(pull()) {
            System.out.println("스택이 가득 찼습니다. 스택을 비워주세요.");
        } else {
           stack[top+1] = data;
           top += 1;
        }
    }

    // 스택의 데이터 삭제 
    public void pop() {
        if(empty()) {
            System.out.println("스택이 비었습니다. 제거할 데이터가 없습니다.");
        } else {
            stack[top] = 0;
            top += -1;
        }
    }

    public void print() {
        for(int i=0; i<SIZE-1; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        Stack sc = new Stack();
        sc.pop();
        sc.print();

        for(int i =0; i< SIZE; i++){
            sc.push(10);
        }
        sc.print();
        sc.push(10);
        

    }   
}
