package stack.and.queue;

public class AnimalShelter {

    Queue catList = new Queue();
    Queue dogList = new Queue();

    public void enqueue(Animal animal) {
        if (animal instanceof Cat) {
            catList.enqueue(animal);
        } else if (animal instanceof Dog){
            dogList.enqueue(animal);
        }
    }

    public Object dequeue(String pref) {

        if (pref.equals("cat")) {
            if(catList.isEmpty()){
                return "empty list";
            }else {
            return catList.dequeue();}
        } else  if (pref.equals("dog")) {
            if(dogList.isEmpty()){
                return "empty list";
            }else {
            return dogList.dequeue();}
        }
        return null;
    }

    @Override
    public String toString() {
        return "\ncatList=" + catList +
                "\ndogList=" + dogList ;
    }
}