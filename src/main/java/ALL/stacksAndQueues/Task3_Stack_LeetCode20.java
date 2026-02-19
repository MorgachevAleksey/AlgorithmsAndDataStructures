package ALL.stacksAndQueues;

public class Task3_Stack_LeetCode20 {
    //Решение задачи с использованием созданного стэка
    public static void main(String[] args){
        String s = "()";
        int n = s.length();
        Stack myStack = new Stack(n);

        //TODO дописать решение задачи с помощью методов стэка
        //Проход по строке скобок
        for (int i = 0; i < n; i++){
            //Если скобка открывающая
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                myStack.push(s.charAt(i));
            }
            //Если скобка закрывающая
            else {
                //Если открывающих перед ней нет
                if (myStack.isEmpty()) {
                    System.out.println("false");
                }
                //Если перед ней есть открывающие
                else {
                    //Если скобки совпадают
                    if (myStack.peek() == '(' && s.charAt(i) == ')' || myStack.peek() == '[' && s.charAt(i) == ']' || myStack.peek() == '{' && s.charAt(i) == '}') {

                    }
                    //Если не совпадают
                    else {

                    }
                }
            }
        }
        //Если в конце в стэке остались открывающие скобки
        if (!myStack.isEmpty()){
            System.out.println("false");
        }
    }

    //Реализация стэка для решения 20 задачи LEETCODE
    static class Stack{
        char[] arr;
        int top;
        int size;

        public Stack(int n){
            this.arr = new char[n];
            this.top = -1;
            this.size = n;
        }

        public void push(char element){
            if (!isFull()) {
                top++;
                arr[top] = element;
            } else{
                resize();
                top++;
                arr[top] = element;
            }
        }

        public char pop(){
            if (!isEmpty()) {
                return arr[top--];
            } else {
                return 'f';
            }
        }

        public char peek() {
            return arr[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == size - 1;
        }

        public int size(){
            return top + 1;
        }

        public void resize(){
            char[] newArr = new char[size * 2];
            for(int i = 0; i <= top; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
            size = size * 2;
        }
    }
}
