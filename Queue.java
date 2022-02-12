public class Queue<T>{
    public static final int SIZE = 10;
    // 데이터 삭제 포인터 
    private int front = -1;
    // 데이터 삽입 포인터 
    private int rear = -1;
    private Object[] queue;
    
    public Queue() {
        queue = new Object[SIZE];
    }

    // 큐가 비었는지 확인 
    public boolean empty() {
        if(front == rear) {
            return true;
        } else {
            return false;
        }
    }

    // 큐가 꽉차있는지 확인 
    public boolean pull() {
        if(front == ((rear+1)%SIZE)) {
            return true;
        } else {
            return false;
        }
    }

    // 큐 삽입 
    public void push(T data) {
        if(pull()) {
            System.out.println("큐가 가득찼습니다. 비워주세요");
        } else {
            rear += (1 % SIZE);
            queue[rear] = data;
        }
    }
    // 큐 삭제 
    public void pop() {
        if(empty()) {
            System.out.println("큐에 아무런 데이터도 없습니다.");
        } else {
            front += (1 % SIZE);
            queue[front] = null;
        }
    }

    public void print() {
        for(int i=0; i<SIZE; i++) {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qe = new Queue<Integer>();
        Queue<String> qe1 = new Queue<String>();
        qe.print();
        for(int i=0; i<SIZE; i++){
            qe.push(10);
        }
        qe.print();
        qe.pop();
        qe.print();

        for(int i=0; i<SIZE; i++){
            qe1.push("hello");
        }
        qe1.pop();
        qe1.print();


    }
}
