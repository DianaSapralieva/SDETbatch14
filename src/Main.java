

 import java.util.LinkedList;
    class Main extends LinkedList<Integer> {

        public void FibonacciLinkedList(int n){
            int a = 0, b = 0, c = 1;
            for(int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
                this.add(c);
            }
        }

        public void display() {
            System.out.println(this.toString());
        }

        public static void main(String[] args) {
            Main list = new Main();
            list.display();
        }
    }
