public class StackClass {
    public static final int STACKSIZE = 10;
    private int top = -1;
    private int[] stack = new int[STACKSIZE];
    
    // 스택이 비웠는지 확인 
    public boolean stack_empty() {
        if(top == -1) {
           return true;
        } else {
           return false;
        }
    }

    // 스택이 꽉 찼는지 확인 
    public boolean stack_pull() {
        if(top == STACKSIZE-1) {
            return true;
        } else {
            return false;
        }
    }

    // 스택에 데이터 삽입 
    public void stack_push(int data) {
        if(stack_pull()) {
            System.out.println("스택이 가득 찼습니다. 스택을 비워주세요.");
        } else {
           stack[top+1] = data;
           top += 1;
        }
    }

    // 스택의 데이터 삭제 
    public void stack_pop() {
        if(stack_empty()) {
            System.out.println("스택이 비었습니다. 제거할 데이터가 없습니다.");
        } else {
            stack[top] = 0;
            top += -1;
        }
    }

    public void stack_print() {
        for(int i=0; i<STACKSIZE-1; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        StackClass sc = new StackClass();
        sc.stack_push(10);
        sc.stack_push(10);
        sc.stack_push(10);
        sc.stack_push(10);
        sc.stack_push(10);

        sc.stack_pop();
        sc.stack_print();

    }   
}
