# Array Insert Shift

## **Whiteboard : 📝**

![img](./Array-Insert-Shift.jpg)

### My code

```
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num=5;
        int[]array={2,4,6,-8};
        int[] finalArray= insertShiftArray(array,num);
        for (int i=0;i<finalArray.length;i++){
            System.out.println(finalArray[i]);
        }
    }
    public static int[] insertShiftArray(int[]array,int num){
        int result=array.length/2;
int newArray[]=new int[array.length+1];

for(int i=0;i<result;i++) {
    newArray[i] = array[i];
    newArray[result]=num;
}
for (int i=result+1;i<array.length+1;i++){
    newArray[i]=array[i-1];

}
       return newArray;
    }
}

```
