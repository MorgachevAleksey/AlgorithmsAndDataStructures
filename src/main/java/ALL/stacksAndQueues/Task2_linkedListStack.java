package ALL.stacksAndQueues;

public class Task2_linkedListStack {
    //Тестированиеp
    public static void main(String[] args){
        Stack testStack = new Stack();
        testStack.isEmpty();
        testStack.size();
        testStack.peek();
        testStack.push(14);
        testStack.push(324787324);
        testStack.push(324787323);
        testStack.peek();
        testStack.pop();
        testStack.size();
        testStack.isEmpty();
    }

    //Стэк, руками, на связном списке
    static class Stack{
        //Создание подкласса узла
        static class Node{
            //Поля элемента и ссылки на следующий узел
            int element;
            Node before;

            //Конструктор
            Node(int element){
                this.element = element;
                this.before = null;
            }
            Node(int element, Node next){
                this.element = element;
                this.before = next;
            }
        }

        //Служебные поля
        private Node top;
        private int size;

        //Push
        public void push(int value){
            Node newNode = new Node(value, top);
            top = newNode;
            size++;
        }

        //Pop
        public int pop(){
            if (!isEmpty()){
                int topElement = top.element; //Необходимо сохранить элемент перед удалением
                size--;
                top = top.before;
                return topElement;
            } else {
                printError();
                return -1;
            }
        }

        //Peek
        public int peek(){
            if (!isEmpty()){
                return top.element;
            } else {
                printError();
                return -1;
            }
        }

        //Size
        public int size (){
            return size;
        }

        //isEmpty
        public boolean isEmpty(){
            return size == 0;
        }

        //Методы вывода
        public void printError(){
            System.out.println("Error");
        }
    }
}
