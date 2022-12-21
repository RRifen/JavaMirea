package lab23.task01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Что хотите протестировать? 1 - ArrayQueue, 2 - ArrayQueueADT, 3 - ArrayQueueModule: ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1) {
            ArrayQueue queue = new ArrayQueue();
            while(true) {
                System.out.print("Выберите операцию: 1 - enqueue, 2 - dequeue, 3 - element, 4 - size, 5 - isEmpty, 6 - clear, 7 - exit: ");
                choice = in.nextInt();
                if (choice == 1) {
                    System.out.print("Введите элемент: ");
                    Object element = in.next();
                    queue.enqueue(element);
                    queue.display();
                } else if (choice == 2) {
                    try {
                        System.out.println("Удаленный элемент: " + queue.dequeue());
                        queue.display();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Очередь пуста");
                    }
                } else if (choice == 3) {
                    try {
                        System.out.println(queue.element());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Очередь пуста");
                    }
                } else if (choice == 4) {
                    System.out.println(queue.size());
                } else if (choice == 5) {
                    System.out.println(queue.isEmpty());
                } else if (choice == 6) {
                    queue.clear();
                    queue.display();
                } else if (choice == 7) {
                    break;
                }
            }
        } else if (choice == 2) {
            ArrayQueueADT queue = new ArrayQueueADT();
            while(true) {
                System.out.print("Выберите операцию: 1 - enqueue, 2 - dequeue, 3 - element, 4 - size, 5 - isEmpty, 6 - clear, 7 - exit: ");
                choice = in.nextInt();
                if (choice == 1) {
                    System.out.print("Введите элемент: ");
                    Object element = in.next();
                    ArrayQueueADT.enqueue(queue, element);
                    ArrayQueueADT.display(queue);
                } else if (choice == 2) {
                    try {
                        System.out.println("Удаленный элемент: " + ArrayQueueModule.dequeue());
                        ArrayQueueADT.display(queue);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Очередь пуста");
                    }
                } else if (choice == 3) {
                    try {
                        System.out.println(ArrayQueueADT.element(queue));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Очередь пуста");
                    }
                } else if (choice == 4) {
                    System.out.println(ArrayQueueADT.size(queue));
                } else if (choice == 5) {
                    System.out.println(ArrayQueueADT.isEmpty(queue));
                } else if (choice == 6) {
                    ArrayQueueADT.clear(queue);
                    ArrayQueueADT.display(queue);
                } else if (choice == 7) {
                    break;
                }
            }
        } else if (choice == 3) {
            while(true) {
                System.out.print("Выберите операцию: 1 - enqueue, 2 - dequeue, 3 - element, 4 - size, 5 - isEmpty, 6 - clear, 7 - exit: ");
                choice = in.nextInt();
                if (choice == 1) {
                    System.out.print("Введите элемент: ");
                    Object element = in.next();
                    ArrayQueueModule.enqueue(element);
                    ArrayQueueModule.display();
                } else if (choice == 2) {
                    try {
                        System.out.println("Удаленный элемент: " + ArrayQueueModule.dequeue());
                        ArrayQueueModule.display();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Очередь пуста");
                    }
                } else if (choice == 3) {
                    try {
                        System.out.println(ArrayQueueModule.element());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Очередь пуста");
                    }
                } else if (choice == 4) {
                    System.out.println(ArrayQueueModule.size());
                } else if (choice == 5) {
                    System.out.println(ArrayQueueModule.isEmpty());
                } else if (choice == 6) {
                    ArrayQueueModule.clear();
                    ArrayQueueModule.display();
                } else if (choice == 7) {
                    break;
                }
            }
        }
    }
}
