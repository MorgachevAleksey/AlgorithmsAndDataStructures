package ALL.stacksAndQueues;

public class Task1_arrayStack {
    public static void main(String[] args) {
        //Тестирование стэка
        Stack myStack = new Stack(5);
        myStack.size();
        myStack.isEmpty();
        myStack.peek();
        myStack.push(17);
        myStack.push(23);
        myStack.push(34);
        myStack.peek();
        myStack.pop();
        myStack.peek();
        myStack.size();
        myStack.isEmpty();
    }

    //Ручная реализация стэка
    public static class Stack{
        private int[] stack; //Массив для хранения элементов
        private int top; //Индекс последнего элемента
        private int size; //Емкость

        //Конструктор - создание стэка заданного размера
        public Stack(int capacity){
            stack = new int[capacity]; //Создаем новый массив
            top = -1; //Прописываем что стэк пуст
            size = capacity; //Сохраняем размер
        }

        //Далее прописываем методы стэка - указаны в теоритическом файле
        //push - добавление в конец
        public void push(int element){
            if (!isFull()) {
                top++;
                stack[top] = element;
            } else {
                resize();
                top++;
                stack[top] = element;
            }
        }

        //pop - удалить и вернуть элемент с вершины
        public int pop(){
            if (!isEmpty()) {
                return stack[top--]; //По-другому не реализуемо - сначала возвращает нужный элемент, потом двигает указатель вершины влево (порядок действий в java)
            } else {
                printError();
                return -1;
            }

        }

        //peek - посмотреть и вернуть элемент с вершины
        public int peek() {
            if (!isEmpty()) {
                printTop();
                return stack[top];
            } else {
                printError();
                return -1;
            }
        }

        //isEmpty - проверка, что стэк пустой
        public boolean isEmpty(){
            return top == -1;
        }

        //isFull - проверка, что стэк полный
        public boolean isFull(){
            return top == size - 1;
        }

        //size - размер стэка
        public int size(){
            return top + 1;
        }

        //Методы вывода
        public void printError(){
            System.out.println("Error");
        }
        public void printTop(){
            System.out.println(stack[top]);
        }

        //Т.к. стэк ограниченного размера - нужен метод расширения
        public void resize(){
            int newSize = size * 2; //Увеличиваем емкость в 2 раза
            int[] newStack = new int[newSize]; //Создаем новый массив с новой емкостью
            //Копируем старый массив стэка в новый
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            size = newSize;
        }
    }
}
