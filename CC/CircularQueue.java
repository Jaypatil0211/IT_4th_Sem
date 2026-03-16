public class CircularQueue {
    int[] arr;
    int size;
    int rear;
    int front;

    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    void enqueue(int value){
      if((rear+1)%size==front){
        System.out.println("\nQueue is full \n");
        return;
      }
      if(front==-1){
        front=0;
      }
      rear=(rear+1)%size;
      arr[rear]=value;
      System.out.println("Element "+value+" added");
    }
   
    void display(){
      for(int i = front; i <= rear; i++){
        System.out.println(arr[i]);
      }
      System.out.println("\n");
    }
   
    void dequeue(){
      if(front==-1 && rear==-1){
        System.out.println("\nQueue is Empty\n");
        return;
      }
      if(front==rear){
        front=-1;
        rear=-1;
      }else{
      front=(front+1)%size;
      }
    }
   
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.display();
    }
}