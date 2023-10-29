package homework_34;

import java.util.Iterator;

public class homework_34 {
    public static void main(String[] args) {
        MyIterableArrayList<String> friends = new MyIterableArrayList<String>();

        Iterator<String> myIter = friends.iterator();

        friends.add("John");
        friends.add("Sam");
        friends.add("Alex");
        friends.add("Kat");

        for (int i = 0; i < friends.size(); i++) {
            if(myIter.hasNext()) System.out.println(myIter.next());
        }
    }


}
