public class ArrayListMethods {

    private final int INIT_SIZE = 10;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    private void resizeArray(int newArrayLength){
        Object[] newArrayList = new Object[newArrayLength];
        System.arraycopy(array, 0, newArrayList, 0, pointer);
        array = newArrayList;
    }

    public void addElement(int element){
        if (pointer == array.length - 1) {
            resizeArray(array.length * 2);
        }
        array[pointer++] = element;
    }

    public void removeElement(int index){
        for (int i = index; i < pointer; i++){
            array[i] = array[i+1];
            array[pointer] = null;
            pointer--;
        }
    }

    public void getElement(int index){
        System.out.println("Требуемый элемент в списке: " + array[index].toString());
    }

    public void printArrayList(){
        for (int i = 0; i < pointer; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        ArrayListMethods newArrayList = new ArrayListMethods();

        newArrayList.addElement(5);
        newArrayList.addElement(3);
        newArrayList.addElement(4);
        newArrayList.addElement(6);
        newArrayList.addElement(8);

        newArrayList.removeElement(3);

        newArrayList.getElement(1);


        newArrayList.printArrayList();
    }

}
