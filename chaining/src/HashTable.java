public class HashTable {

    private HashItem[] HashTable;

    public HashTable(){
        HashTable = new HashItem[Constant.TABLE_SIZE];
    }

    private int hash(int key){
        return key % Constant.TABLE_SIZE;
    }

    public int get(int key){

        int arrayIndex = hash(key);

        if(HashTable[arrayIndex] == null){
            return -1;
        }
        if(HashTable[arrayIndex].getKey() == key){
            return HashTable[arrayIndex].getValue();
        }else {
            HashItem item = HashTable[arrayIndex].getNextHashItem();
            while(item != null && item.getKey() != key){
                item = item.getNextHashItem();
            }

            if(item == null){
                return -1;
            }else {
                return item.getValue();
            }
        }
    }

    public void put(int key , int value){
        int arrayIndex = hash(key);
        if(HashTable[arrayIndex] == null){
            System.out.println("simple insertion no collision");
            HashTable[arrayIndex] = new HashItem(key,value);
        }else {
            System.out.println("collision when inserting with key "+key);
            HashItem item = HashTable[arrayIndex];
            while(item.getNextHashItem() != null){
                item = item.getNextHashItem();
                System.out.println("considering the next item in the linked list "+item.getValue());
            }
            System.out.println("finally we have a place to insert");
            item.setNextHashItem(new HashItem(key,value));
        }
    }
}
