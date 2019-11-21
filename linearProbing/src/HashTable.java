public class HashTable {

    private HashItem[] Hashtable;

    public HashTable(){
        this.Hashtable = new HashItem[constant.TABLE_SIZE];
    }

    private int hash(int key){
        //return key % constant.TABLE_SIZE;
        return 1;
    }

    public void put(int key,int value){
        int arrayIndex = hash(key);

        while(Hashtable[arrayIndex] != null){
            System.out.println("collision searching next bucket");
            arrayIndex = (arrayIndex + 1) % constant.TABLE_SIZE;
        }
        System.out.println("bucket found adding item ...");
        Hashtable[arrayIndex] = new HashItem(key,value);
    }

    public int get(int key){

        int item = hash(key);

        while(Hashtable[item].getKey() != key && Hashtable[item] != null){
            System.out.println("mapping to the next index ..");
            item = (item + 1) % constant.TABLE_SIZE;
        }

        if(Hashtable[item] == null){
            return -1;
        }else {
            System.out.println("found element ");
            return Hashtable[item].getValue();
        }
    }
}
