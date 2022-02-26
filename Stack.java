public class Stack<T> {
    public static final int SIZE = 10;
    private int top = -1;
    private Object[] stack ;
    
    public Stack() {
        stack = new Object[SIZE];
    }
    // 스택이 비웠는지 확인 
    public boolean isEmpty() {
        if(top == -1) {
           return true;
        } else {
           return false;
        }
    }

    // 스택이 꽉 찼는지 확인 
    public boolean isPull() {
        if(top == SIZE-1) {
            return true;
        } else {
            return false;
        }
    }

    // 스택에 데이터 삽입 
    public void push(T data) {
        if(isPull()) {
            System.out.println("스택이 가득 찼습니다. 스택을 비워주세요.");
        } else {
           top += 1;
           stack[top] = data;
           
        }
    }

    // 스택의 데이터 삭제 
    public void pop() {
        if(isEmpty()) {
            System.out.println("스택이 비었습니다. 제거할 데이터가 없습니다.");
        } else {
            stack[top] = null;
            top += -1;
        }
    }

    public void print() {
        for(int i=0; i<SIZE-1; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> sc = new Stack<Integer>();
        Stack<String> sc1 = new Stack<String>();
        sc1.push("Hello");
        sc1.push("American");
        sc1.push("Korean");
        sc1.pop();
        sc1.print();

        sc.pop();
        sc.print();

        for(int i =0; i< SIZE; i++){
            sc.push(10);
        }
        sc.print();
        sc.push(10);
        

    }   
}
